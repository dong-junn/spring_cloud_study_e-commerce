FROM amazoncorretto:17.0.14-alpine3.21
#해당 이미지를 기반으로(Amazon Corretto JDK 17)

VOLUME /tmp
#tmp 폴더에

COPY apiEncryptionKey.jks apiEncryptionKey.jks

COPY target/config-service-1.0.jar ConfigServer.jar
# ..~1.0.jar에 있는 파일을 ConfigServer.jar로 복사한담에

#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-XX:-UseContainerSupport", "-jar", "ConfigServer.jar"]
# java -jar ConfigServer.jar 명령어로 실행한다
# metrics 수집을 위한 jvm옵션을 추가하여 metrics에서 발생하는 npe문제를 해결한다

ENTRYPOINT ["java", "-jar", "ConfigServer.jar"]
# jdk17로 변경하고 cgroup v2관련 NPE문제가 발생하지 않는지 확인한다