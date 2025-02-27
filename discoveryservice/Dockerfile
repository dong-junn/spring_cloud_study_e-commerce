FROM amazoncorretto:17.0.14-alpine3.21
#해당 이미지를 기반으로(Amazon Corretto JDK 17)

VOLUME /tmp
#tmp 폴더에

COPY target/discoveryservice-1.0.jar DiscoveryService.jar
# .jar 복사하고

ENTRYPOINT ["java", "-jar", "DiscoveryService.jar"]
# java -jar ~.jar 로 실행