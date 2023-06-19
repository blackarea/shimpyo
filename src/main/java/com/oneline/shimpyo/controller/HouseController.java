package com.oneline.shimpyo.controller;

import com.oneline.shimpyo.domain.BaseResponse;
import com.oneline.shimpyo.domain.house.dto.HouseReq;
import com.oneline.shimpyo.domain.house.dto.HouseRegisterRes;
import com.oneline.shimpyo.domain.member.Member;
import com.oneline.shimpyo.modules.CheckMember;
import com.oneline.shimpyo.security.auth.CurrentMember;
import com.oneline.shimpyo.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user/houses")
public class HouseController {

    private final HouseService houseService;
    private final CheckMember checkMember;

    @PostMapping("")
    public BaseResponse<HouseRegisterRes> createHouse(@RequestPart HouseReq houseReq, @ModelAttribute List<MultipartFile> houseImages
                                , @ModelAttribute List<MultipartFile> roomImages, @CurrentMember Member member) {

        long houseId = houseService.createHouse(member, houseReq, houseImages, roomImages);

        return new BaseResponse<>(new HouseRegisterRes(houseId));
    }

    @PatchMapping("/{houseId}")
    public void updateHouse(@PathVariable long houseId) {

    }

}
