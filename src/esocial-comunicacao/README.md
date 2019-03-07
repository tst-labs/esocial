# esocial-comunicacao

Projeto que mapeia o classes de comunicação do eSocial a partir dos XSD e WSDL usando ferrametas do JAXB

## Gerando classes

- Copiar as pastas com arquivos `.wsdl` para a pasta `src/main/resources/wsdl` (observar a estrutura de diretórios atual)
- Copiar as pastas com arquivos `.xsd` para a pasta `src/main/resources/xsd` (observar a estrutura de diretórios atual)
- Executar o comando `mvn clean package -Pgenerate-resources` para executar o profile `generate-resources`
- Obs.: Sempre que esse comando é executado, as classes são geradas novamente, sobreescrevendo qualquer alteração que tenha sido feita
