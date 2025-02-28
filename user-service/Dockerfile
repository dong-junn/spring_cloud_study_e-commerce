FROM amazoncorretto:17.0.14-alpine3.21
# 해당 이미지를 기반으로(Amazon Corretto JDK 17)

VOLUME /tmp
#tmp 폴더에

COPY target/user-service-1.0.jar UserService.jar
#user-service-1.0.jar를 UserService.jar로 복사하고

ENTRYPOINT ["java", "-jar", "UserService.jar"]
#java -jar ... 커맨드로 실행한다