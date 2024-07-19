#!/bin/bash

# Solicitar a URL do arquivo ZIP como input
read -p "Insira a URL do arquivo ZIP: " ZIP_URL

# Diretório de destino para os arquivos XSD
DEST_DIR="/workspace/src/esocial-esquemas/src/main/resources/xsd"

# Baixar o arquivo ZIP usando curl
echo "Baixando o arquivo ZIP..."
curl -sSLO "$ZIP_URL"

# Verificar se o download foi concluído com sucesso
if [ $? -ne 0 ]; then
  echo "Erro ao baixar o arquivo ZIP."
  exit 1
fi

# Criar o diretório de destino, se ainda não existir
mkdir -p "$DEST_DIR"

# Extrair os arquivos XSD para o diretório de destino
echo "Extraindo os arquivos XSD..."
unzip -qq "$(basename "$ZIP_URL")" -d "$DEST_DIR"

# Verificar se a extração foi bem-sucedida
if [ $? -ne 0 ]; then
  echo "Erro ao extrair os arquivos XSD."
  exit 1
fi

# Remover o arquivo ZIP após a extração
rm "$(basename "$ZIP_URL")"

echo "Arquivos XSD extraídos com sucesso em: $DEST_DIR"