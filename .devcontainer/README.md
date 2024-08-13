# Como instalar o ambiente usando VSCODE

## Instalação inicial

1) Na raiz do projeto, rode esse comando abaixo:

```shellscript
$ ./.devcontainer/iniciar.sh
```

Obs.: Não comitar o arquivo [application.properties](../src/esocial-jt-service/src/main/resources/application.properties) as variáveis alteradas com relação ao certificado.

2) Abre o projeto em modo `devcontainer` e aguarde toda a instalação

## Atualizar os arquivos XSDs

1) Dentro do devcontainer, rode o comando que vai substituir todos os arquivos XSDs:

```shellscript
$ ./.devcontainer/download_xsd.sh
```

2) Gera todas as classes com base nos XSDs baixados:

```shellscript
mvn clean package -Pgenerate-resources -f /workspace/src/esocial-esquemas/pom.xml
```

3) Depois rode o comando abaixo para recompilar e testar tudo:

``shellscript
$ mvn clean verify -f /workspace/src/pom.xml
```

3) Para subir a aplicação, vá no ícone à esquerda chamado de `Spring Boot Dashboard` e dê o play no app `esocial-jt-service` e aguarde subir a aplicação.
