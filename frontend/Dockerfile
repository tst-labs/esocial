FROM tstlabs/frontend:latest

# Copia os arquivos do build para o diretório HTML do nginx
COPY ./build /usr/share/nginx/html
RUN chmod -R 755 /usr/share/nginx/html

# Cria e ajusta permissões para o cache do nginx
RUN mkdir -p /var/cache/nginx/client_temp && \
    mkdir -p /var/cache/nginx/proxy_temp && \
    mkdir -p /var/cache/nginx/fastcgi_temp && \
    mkdir -p /var/cache/nginx/uwsgi_temp && \
    mkdir -p /var/cache/nginx/scgi_temp && \
    chown -R nginx:nginx /var/cache/nginx

# Alterna para o usuário nginx
USER nginx