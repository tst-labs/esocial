# esocial-esquemas

Projeto que mapeia o esquema do eSocial a partir dos XSD usando ferrametas do JAXB

## Gerando classes

- Copiar os arquivos `.xsd` para a pasta `src/main/resources/xsd` (observar a estrutura de diretórios atual)
- Copiar para mesma pasta o arquivo `xmldsig-core-schema.xsd`
- Executar o comando `mvn clean package -Pgenerate-resources` para executar o profile `generate-resources`
- Obs.: Sempre que esse comando é executado, as classes são geradas novamente, sobreescrevendo qualquer alteração que tenha sido feita
