#!/bin/bash

CNPJ_TRIBUNAL=531954000120
CAMINHO_CERTIFICADO=/config/esocial.pfx

# Limpa containers, volumes e caches
echo -e "\n"
    docker-compose down -v --remove-orphans && \
    docker volume prune --force && \
    docker system prune --force

# Loop para solicitar o diretório de origem do certificado até que um caminho válido seja fornecido
while true; do
    read -p "Insira somente o diretório completo onde está o certificado esocial.pfx: " DIRETORIO_ORIGEM
    echo ${DIRETORIO_ORIGEM}
    if [ -f "${DIRETORIO_ORIGEM}/esocial.pfx" ]; then
        cp "${DIRETORIO_ORIGEM}/esocial.pfx" ".${CAMINHO_CERTIFICADO}"
        break
    else
        echo "O arquivo esocial.pfx não foi encontrado no diretório especificado. Tente novamente."
    fi
done

# Copiar o arquivo de exemplo para o arquivo de configuração real
cp ./config/application.properties.example ./config/application.properties

# Solicitar a senha do certificado ao usuário de forma silenciosa
read -s -p "Insira a senha do certificado eSocial: " SENHA_CERTIFICADO

# Substituir os valores dos atributos no arquivo application.properties da pasta config/
sed -i "s/^esocialjt.cnpj-empregador=.*/esocialjt.cnpj-empregador=${CNPJ_TRIBUNAL}/" ./config/application.properties
sed -i "s|^esocialjt.senhaCertificado=.*|esocialjt.senhaCertificado=$(printf '%s\n' "$SENHA_CERTIFICADO" | sed 's|[&/\]|\\&|g')|" ./config/application.properties
sed -i "s|^esocialjt.arquivoCertificado=.*|esocialjt.arquivoCertificado=${CAMINHO_CERTIFICADO}|" ./config/application.properties

# Substituir os valores dos atributos no arquivo application.properties da pasta /src/esocial-jt-service/
sed -i "s/^esocialjt.cnpj-empregador=.*/esocialjt.cnpj-empregador=${CNPJ_TRIBUNAL}/" ./src/esocial-jt-service/src/main/resources/application.properties
sed -i "s|^esocialjt.senhaCertificado=.*|esocialjt.senhaCertificado=$(printf '%s\n' "$SENHA_CERTIFICADO" | sed 's|[&/\]|\\&|g')|" ./src/esocial-jt-service/src/main/resources/application.properties
sed -i "s|^esocialjt.arquivoCertificado=.*|esocialjt.arquivoCertificado=${CAMINHO_CERTIFICADO}|" ./src/esocial-jt-service/src/main/resources/application.properties

echo "Configuração concluída."
