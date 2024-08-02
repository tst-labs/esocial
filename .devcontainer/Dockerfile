# Use a imagem base com OpenJDK 8 e Maven
FROM adoptopenjdk/maven-openjdk8

# Configurações de ambiente
ENV LANG=en_US.UTF-8 \
    LANGUAGE=en_US.UTF-8 \
    LC_CTYPE=en_US.UTF-8 \
    LC_ALL=en_US.UTF-8 \
    TZ=America/Sao_Paulo \
    DEBIAN_FRONTEND=noninteractive

# Atualize e instale dependências adicionais
RUN apt-get update && \
    # comentei porque a aplicação utiliza ainda a versão 8 do openjdk
    # apt-get upgrade -y && \
    apt-get install -y tzdata curl git zip && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Configurar o fuso horário
RUN ln -fs /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime && \
    echo "America/Sao_Paulo" > /etc/timezone && \
    dpkg-reconfigure -f noninteractive tzdata

# Criar e usar um usuário não root
RUN addgroup esocial && adduser --disabled-password --gecos "" --ingroup esocial esocial
USER esocial

# Configurar o diretório de trabalho
WORKDIR /workspace

# Expor a porta necessária
EXPOSE 8080

# Comando para manter o contêiner ativo
CMD ["tail", "-f", "/dev/null"]

