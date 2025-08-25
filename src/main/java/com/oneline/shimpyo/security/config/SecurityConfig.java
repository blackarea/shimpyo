package com.oneline.shimpyo.security.config;

import com.oneline.shimpyo.security.filter.CustomAuthenticationFilter;
import com.oneline.shimpyo.security.filter.CustomAuthorizationFilter;
import com.oneline.shimpyo.security.handler.CustomLogoutSuccessHandler;
import com.oneline.shimpyo.security.oAuth.handler.OAuth2SuccessHandler;
import com.oneline.shimpyo.security.oAuth.service.PrincipalOauth2UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(securedEnabled = true, prePostEnabled = true)
@RequiredArgsConstructor
public class SecurityConfig {

    // provider
    private final AuthenticationProvider authenticationProvider;

    // handler
    private final AuthenticationFailureHandler authenticationFailureHandler;    // 구현체의 CustomFailureHandler 작동
    private final AuthenticationSuccessHandler authenticationSuccessHandler;    // 구현체의 CustomSuccessHandler 작동
    private final AccessDeniedHandler accessDeniedHandler;
    private final OAuth2SuccessHandler successHandler;
    private final CustomLogoutSuccessHandler logoutSuccessHandler;

    // filter
    private final CustomAuthorizationFilter customAuthorizationFilter;

    // service
    private final PrincipalOauth2UserService principalOauth2UserService;

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http,
                                                   AuthenticationManager authManager) throws Exception {

        // login 필터
        CustomAuthenticationFilter filter =
                new CustomAuthenticationFilter(authManager);
        filter.setFilterProcessesUrl("/api/login");
        filter.setAuthenticationFailureHandler(authenticationFailureHandler);
        filter.setAuthenticationSuccessHandler(authenticationSuccessHandler);

        // 일반 설정
        http.csrf(csrf -> csrf.disable())
                .formLogin(form -> form.disable())
                .httpBasic(basic -> basic.disable())
                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .cors(cors -> cors.configurationSource(configurationSource()));

        // 모두 접근 가능
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/oauth2/**").permitAll()
                // 비회원/회원 둘다 접근 가능
                .requestMatchers("/api/**").hasAnyAuthority("ROLE_ANONYMOUS", "CLIENT")
                // 회원만 접근 가능
                .requestMatchers("/user/**").hasAnyAuthority("CLIENT")
                // 그 외
                .anyRequest().permitAll()
        );

        // 로그아웃 설정
        http.logout(logout -> logout
                .logoutUrl("/user/logout") // [POST]
                .logoutSuccessUrl("/")  // 로그아웃 성공 시
                .logoutSuccessHandler(logoutSuccessHandler)
                .deleteCookies("Set-Cookie")
                .invalidateHttpSession(true)
        );

        // OAuth2 설정
        http.oauth2Login(oauth2 -> oauth2
                .successHandler(successHandler)
                .userInfoEndpoint(userInfo -> userInfo.userService(principalOauth2UserService))
        );

        // 필터
        http.addFilterBefore(anonymousAuthenticationFilter(), BasicAuthenticationFilter.class)
                .addFilterBefore(customAuthorizationFilter, AnonymousAuthenticationFilter.class);

        // 로그인 필터
        http.addFilter(filter);

        // 권한 체크 후 엑세스할 수 없는 요청 시 동작 ( ex : 일반유저가 admin 권한이 필요한 url 요청 시 동작 [권한 없을 시])
        // 나중에 권한 필요한 설정 시 Custom 클래스 만들어서 제작 예정
        http.exceptionHandling(ex -> ex.accessDeniedHandler(accessDeniedHandler));

        // Security 인증이 되지 않은 유저가 요청했을 때 동작된다. [인증 불가 시]
        http.exceptionHandling(ex -> ex.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)));

        // AuthenticationProvider 등록
        http.authenticationProvider(authenticationProvider);

        return http.build();
    }

    @Bean
    public AnonymousAuthenticationFilter anonymousAuthenticationFilter() {
        String key = "myAnonymousKey";
        Object principal = "anonymousUser";
        List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_ANONYMOUS"));

        return new AnonymousAuthenticationFilter(key, principal, authorities);
    }
    @Bean
    public CorsConfigurationSource configurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.addAllowedOriginPattern("*");
        configuration.addAllowedHeader("*");
        configuration.addAllowedMethod("*");
        configuration.setAllowCredentials(true);    // -> true이면 addAllowedOrigin 사용 불가. addAllowedOriginPattern 사용 가능

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

}
