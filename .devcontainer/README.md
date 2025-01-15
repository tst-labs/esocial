# Esocial-JT

- [Esocial-JT](#esocial-jt)
  - [Instalação inicial](#instalação-inicial)
  - [Configuração do projeto](#configuração-do-projeto)
  - [Para fins de desenvolvimento de uma PR](#para-fins-de-desenvolvimento-de-uma-pr)
    - [1 Passo: Atualização dos arquivos XSDs](#1-passo-atualização-dos-arquivos-xsds)
    - [2 Passo: Subir a aplicação localmente](#2-passo-subir-a-aplicação-localmente)
    - [Publicar branch no Gitlab do TJDFT](#publicar-branch-no-gitlab-do-tjdft)
    - [3 Passo: Realizar deploy da aplicação no Gitlab](#3-passo-realizar-deploy-da-aplicação-no-gitlab)
    - [4 Passo: Criar PR para Github do eSocial](#4-passo-criar-pr-para-github-do-esocial)
    - [5 Passo: Atualizar o repositório oficial do TST para Gitlab TJDFT](#5-passo-atualizar-o-repositório-oficial-do-tst-para-gitlab-tjdft)


## Instalação inicial

1) Clonagem repositório do TJDFT

```bash
# Faça o clone do projeto no Gitlab
$ git clone https://oauth2:<SEU_TOKEN_GERADO_NO_GITLAB>@gitlab.tjdft.jus.br/cosoft/nusof5/esocial/esocial-jt.git

$ cd esocial-jt/

# Aproveite para renomear o repositório do TJDFT para não confundir com os outros repositórios que serão adicionados a seguir
$ git remote rename origin gitlab-tjdft

# Adicionar o repositório pessoal apontando para seu repositório do github 
# para fins de envio do PR para repositório github oficial do TST
$ git remote add github-tst-pessoal https://github.com/<SEU_USUARIO_GITHUB>/esocial.git

# Adicionar o repositório apontando para repositório oficial do TST:
$ git remote add github-tst-oficial https://github.com/tst-labs/esocial.git

# Ao final, os repositórios deverão tá configurados assim:
$ git remote

github-tst-oficial -> github oficial do TST
github-tst-pessoal -> github pessoal
gitlab-tjdft       -> gitlab do tjdft
```

## Configuração do projeto

> Obs.: Antes de tudo, tenha em mãos o certificado esocial (com o nome **esocial.pfx**) e a sua respectiva senha.

1) Realiza a configuração inicial do projeto

```bash
$ ./.devcontainer/iniciar.sh
```

2) Abrir o projeto em modo `devcontainer` aguarde toda a instalação.

## Para fins de desenvolvimento de uma PR

### 1 Passo: Atualização dos arquivos XSDs

Obs.: Pule esse tópico, somente se não atualizar os arquivos XSDs.

1) Gerar novo branch a partir do branch **master** com o seguinte padrão:

`atualizacao-xsds-nt-<MES_NOTA_TECNICA>-<ANO_NOTA_TECNICA>-rev-<DIA_REV>-<MES_REV>-<ANO_REV>-tjdft`

Para substituir esses valores, basta olhar na [Documentação Técnica](https://www.gov.br/esocial/pt-br/documentacao-tecnica)

Um exemplo a ser aplicado:

> atualizacao-xsds-nt-02-2024-rev-29-02-2024-tjdft

2) Dentro do devcontainer, rode o comando que vai substituir todos os arquivos XSDs:

```bash
$ ./.devcontainer/download_xsd.sh
```

Nesse script, será perguntado qual a URL de onde estão os arquivos XSDs zipados na [Documentação Técnica](https://www.gov.br/esocial/pt-br/documentacao-tecnica)

3) Gera todas as classes com base nos XSDs baixados:

```bash
mvn clean package -Pgenerate-resources -f /workspace/src/esocial-esquemas/pom.xml
```

4) Depois rode o comando abaixo para recompilar e testar tudo:

```bash
mvn clean verify -f /workspace/src/pom.xml
```

>Obs.: Pode ocorrer algum erro no final da execução nesta etapa. Se ocorrer, executar essas 2 possibilidades: 

>1 - Tentar reabrir do devcontainer ou;

>2 - No pior caso, alterar/Corrigir alguma(s) classe(s) do projeto (pode ser guiado pelo erros no console).

### 2 Passo: Subir a aplicação localmente

1) No vscode (modo devcontainer), vá no ícone à esquerda chamado de `Spring Boot Dashboard` e dê o play no app `esocial-jt-service` e aguarde subir a aplicação.
2) Acesse o endereço http://localhost

### Publicar branch no Gitlab do TJDFT

1) Com o [branch já criado](#atualização-dos-arquivos-xsds) e com as alterações necessárias, será necessário testar a aplicação, antes mesmo de enviar [um novo PR para Github oficial do TST](#criar-pr-para-github-do-esocial).

```bash
# Faça o publicação do branch, depois que tudo estiver pronto
git push gitlab-tjdft <NOME_BRANCH>
```

> **IMPORTANTÍSSIMO**: Não comitar o arquivo [application.properties](../src/esocial-jt-service/src/main/resources/application.properties) pois existem variáveis sensíveis tais como a senha do certificado.

### 3 Passo: Realizar deploy da aplicação no Gitlab

Depois de comitado a branch, basta criar uma tag com mesmo padrão citado no item [Atualização dos arquivos XSDs](#atualização-dos-arquivos-xsds), adicionando antes do nome da tag:

- Padrão para o ambiente stage: **stage-**: `stage-atualizacao-xsds-nt-<MES_NOTA_TECNICA>-<ANO_NOTA_TECNICA>-rev-<DIA_REV>-<MES_REV>-<ANO_REV>-tjdft`

- Ambiente produção: **production-**: `production-atualizacao-xsds-nt-<MES_NOTA_TECNICA>-<ANO_NOTA_TECNICA>-rev-<DIA_REV>-<MES_REV>-<ANO_REV>-tjdft`

### 4 Passo: Criar PR para Github do eSocial

Antes de publicar uma PR, crie um novo branch a partir do branch criado na etapa [Atualização dos arquivos XSDs](#atualização-dos-arquivos-xsds) adicionando no final **-tst**, por exemplo:

`atualizacao-xsds-nt-<MES_NOTA_TECNICA>-<ANO_NOTA_TECNICA>-rev-<DIA_REV>-<MES_REV>-<ANO_REV>-tst`

O objetivo dessa branch é para deletar arquivos peculiares do TJDFT que serão irrelevantes para o TST

```bash
# Depois que tudo for testado e pronto, basta rodar o seguinte comando
git push github-tst-pessoal <NOME_BRANCH>
```

### 5 Passo: Atualizar o repositório oficial do TST para Gitlab TJDFT

1) Quando o TST mergear o PR para o master, será necessário sincronizar todas as mudanças para repositório do TJDFT:

```bash
# Acessa o branch
git checkout master

# Obtém atualizações do TST
git fetch github-tst-oficial

# Faz o merge do TST para o branch master do TJDFT
git merge github-tst-oficial/master

# Caso dê algum conflito, aceite todas alterações vindas do TST
git checkout --theirs . && git add . && git commit

# Só para mostrar as diferenças entre os repositórios (curiosidade)
git remote show gitlab-tjdft u github-tst-oficial

# Realiza push para repositório do TJDFT
git push gitlab-tjdft master
```

2) Refazer o deploy, criar uma tag apontando a partir da branch **master** com o mesmo padrão feito no tópico [Realizar deploy da aplicação no Gitlab](#3-passo-realizar-deploy-da-aplicação-no-gitlab), adicionando na frente do nome da tag a palavra **-oficial**.

Isso é só um exemplo: 

- stage: `stage-atualizacao-xsds-nt-02-2024-rev-29-02-2024-oficial`
- producao: `production-atualizacao-xsds-nt-02-2024-rev-29-02-2024-oficial`

