Este tutorial tem como objetivo explicar os passos usados para a geração do pacote `esocial-comunicacao` a partir dos arquivos `XSD` e `WSDL` de comunicação disponibilizados pelo eSocial-Gov.

A geração deve ser feita copiando o projeto para a máquina (`git clone`) e executando os comandos a partir desta pasta (`exemplos/esocial-comunicacao`).

## WSDL

- Copiar os arquivos `.wsdl` para a pasta `src/main/resources/wsdl` (observar o exemplo)
- Executar o comando `mvn clean package` (usando o `pom.xml` desta pasta)
- Copiar os arquivos gerados em `target/generated-sources/axis2/wsdl2code/src` para a pasta correspondente do projeto `esocial-comunicacao`

## XSD

- Copiar os arquivos `.xsd` para a pasta `src/main/resources/xsd` (observar o exemplo)
- Executar o comando `sh ./generate-java-from-xsd.sh`
- Copiar os arquivos gerados em `target/generated-sources/xsd/java` para a pasta correspondente do projeto `esocial-comunicacao`
