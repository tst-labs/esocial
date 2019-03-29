FROM nginx:1.15.2-alpine

RUN adduser -D -G root esocial

COPY ./config/nginx.conf /etc/nginx/nginx.conf
COPY ./dist/* /var/www/public/
COPY ./config/bootstrap.sh /usr/bin/bootstrap.sh

ENV ESOCIAL_SERVICE_URL=http://localhost:8080/esocial-jt-service
ENV CONECTOR_ETL_SERVICE_URL=http://localhost:8888/esocial-pentaho-server

RUN mkdir -p /var/www/public && \
    mkdir -p /var/www/run && \
    mkdir -p /var/www/cache && \
    mkdir -p /var/www/tmp && \
    chmod g+rwx -R /var/www && \
    chmod a+x /usr/bin/bootstrap.sh

EXPOSE 8080

USER esocial

ENTRYPOINT ["/usr/bin/bootstrap.sh"]