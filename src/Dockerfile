FROM azul/zulu-openjdk-alpine:8-jre

ENV LANG=en_US.UTF-8 \
    LANGUAGE=en_US.UTF-8 \
    LC_CTYPE=en_US.UTF-8 \
    LC_ALL=en_US.UTF-8

RUN apk -U upgrade
RUN apk add --no-cache curl tar socat tzdata
RUN cp /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime && echo "America/Sao_Paulo" > /etc/timezone

RUN addgroup esocial && adduser -D -G esocial esocial
USER esocial

COPY ./esocial-jt-service/target/esocial-jt-service*.jar /

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar /esocial-jt-service*.jar
