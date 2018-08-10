FROM maven:3.5.4-jdk-8-alpine

# "Workaround" para copiar arquivo somente se existir
COPY pom.xml ./docker/maven/settings.xml* /root/.m2/
COPY ./ /usr/src/esocial
WORKDIR /usr/src/esocial

RUN mvn clean install

EXPOSE 8080
ENTRYPOINT cd esocial-jt-service && \
            mvn flyway:migrate -Dflyway.url=jdbc:postgresql://esocial-db/postgres \
            -Dflyway.user=postgres -Dflyway.password=esocial \
            -Dflyway.baselineOnMigrate=true && \
            cd .. && \
            exec java $JAVA_OPTS -jar esocial-jt-service/target/esocial-jt-service*.jar
