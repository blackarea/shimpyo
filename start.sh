#!/bin/bash

REPOSITORY=/home/ec2-user/project
PROJECT_NAME=shimpyo  # 어플리케이션 이름 변경

echo "> Build 파일 복사"

cp $REPOSITORY/build/libs/shimpyo-0.0.1-SNAPSHOT.jar $REPOSITORY/

echo "> 현재 구동중인 애플리케이션 pid 확인"

CURRENT_PID=$(pgrep -f ${PROJECT_NAME}.*.jar)

echo "> 현재 구동중인 애플리케이션 pid: $CURRENT_PID"

if [ -z "$CURRENT_PID" ]; then
    echo "> 현재 구동 중인 애플리케이션이 없으므로 종료하지 않습니다."
else
    echo "> kill -9 $CURRENT_PID"
    kill -9 $CURRENT_PID
    sleep 2
fi

cd /home/ec2-user/project
echo "> 새 어플리케이션 배포"
JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1)

echo "> JAR Name: $JAR_NAME"

echo "> $JAR_NAME 에 실행권한 추가"

chmod +x $JAR_NAME

echo "> $JAR_NAME 실행"

nohup java -jar \
        -Dspring.config.location=classpath:/application.yml,/home/ec2-user/project/application-db.yml \
        /home/ec2-user/project/shimpyo-0.0.1-SNAPSHOT.jar > $REPOSITORY/nohup.out 2>&1 &