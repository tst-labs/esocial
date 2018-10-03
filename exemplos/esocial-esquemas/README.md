Este tutorial tem como objetivo explicar os passos usados para a geração do pacote `esocial-esquemas` a partir dos arquivos `XSD` disponibilizados pelo eSocial-Gov.

A geração deve ser feita copiando o projeto para a máquina (`git clone`) e executando os comandos a partir desta pasta (`exemplos/esocial-esquemas`).

## XSD

- Copiar os arquivos `.xsd` para a pasta `src/main/resources/xsd/eventos/<versao_esocial>` (observar o exemplo)
- Copiar o arquivo `xmldsig-core-schema.xsd` que vem no pacote de comunicação para a mesma pasta (ou usar o arquivo que está no exemplo)
- Executar o comando `sh ./generate-java-from-xsd.sh`
- Copiar os arquivos gerados em `target/generated-sources/xsd/java` para a pasta correspondente do projeto `esocial-esquemas`
