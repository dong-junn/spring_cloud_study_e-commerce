FROM mariadb
# base image는 mariadb로

ENV MYSQL_ROOT_PASSWORD=test1234
ENV MYSQL_DATABASE=msa
# 설정값 지정

# COPY ./mysql_data /var/lib/mysql 명령 제거
# MariaDB가 자체적으로 데이터베이스를 초기화하도록 함

EXPOSE 3306
# 포트 노출

# 볼륨 설정 추가
VOLUME /var/lib/mysql 