FROM tstlabs/frontend:latest

COPY build /usr/share/nginx/html
RUN chmod -R 755 /usr/share/nginx/html

RUN mkdir -p /var/cache/nginx && \
    chown -R nginx:nginx /var/cache/nginx

USER nginx