FROM openjdk:8-jre-alpine

RUN addgroup esocial && adduser -D -G esocial esocial
USER esocial

COPY ./esocial-jt-service/target/esocial-jt-service*.jar /

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar /esocial-jt-service*.jar
