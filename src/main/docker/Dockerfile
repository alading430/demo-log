FROM java:8

MAINTAINER demo-log demo@xxx.com

VOLUME /ROOT

ADD demo-log-0.0.1-SNAPSHOT.jar demo-log.jar

RUN bash -c 'touch /demo-log.jar'

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
&& echo 'Asia/Shanghai' >/etc/timezone

EXPOSE 8089

ENTRYPOINT ["java", "-jar", "demo-log.jar"]