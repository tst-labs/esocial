#!/bin/sh

# Diretório onde os certificados serão montados
CERT_DIR=/local-certs

# Caminho para o keystore do Java
TRUSTSTORE=${JAVA_HOME}/jre/lib/security/cacerts
STOREPASS=changeit

# Verifica se o diretório de certificados existe e não está vazio
if [ -d "$CERT_DIR" ] && [ -n "$(ls -A $CERT_DIR)" ]; then
  echo "Importando certificados de $CERT_DIR..."
  # Itera sobre cada arquivo no diretório
  for CERT in "$CERT_DIR"/*; do
    if [ -f "$CERT" ]; then
      # Extrai o alias do nome do arquivo
      ALIAS=$(basename "$CERT")
      echo "Importando $CERT com alias $ALIAS..."
      # Importa o certificado para o truststore
      keytool -import -trustcacerts -file "$CERT" -alias "$ALIAS" -keystore "$TRUSTSTORE" -storepass "$STOREPASS" -noprompt
    fi
  done
else
  echo "Nenhum certificado para importar ou diretório $CERT_DIR não encontrado."
fi

echo "Iniciando a aplicação..."
# Executa o comando original para iniciar a aplicação Java
exec java $JAVA_OPTS -jar /esocial-jt-service*.jar