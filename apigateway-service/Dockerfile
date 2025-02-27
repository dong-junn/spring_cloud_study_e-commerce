FROM amazoncorretto:17.0.14-alpine3.21
# 해당 이미지를 기반으로(Amazon Corretto JDK 17)

VOLUME /tmp
# tmp 폴더에

COPY target/apigateway-service-1.0.jar apiGatewayService.jar
# apigateway-service-1.0.jar를 apiGatewayService.jar로 복사하고

ENTRYPOINT ["java", "-jar", "apiGatewayService.jar"]
# java -jar apiGatewayService.jar 커맨드로 실행한다