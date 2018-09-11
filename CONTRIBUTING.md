# Contribuindo com o **eSocial-jt**

Desejamos criar um ambiente convidativo para contribuições nesse projeto. Para
isso, nós seguimos um código de conduta simples e pedimos que os contribuintes
façam o mesmo.

## Comunicação

Caso você esteja interessando em contribuir, tenha alguma dúvida ou sugestão,
por favor abra uma [issue](https://github.com/tst-labs/esocial/issues) que iremos
responder o mais rápido possível.

Recomendamos o uso da _branch master_ como versão mais estável. Ainda não
implementamos um ciclo regular para liberação de _releases_ e, por isso, ainda
não temos boas informações em _release notes_. Estaremos trabalhando em uma
versão _pré-1.0_ o que significa que a API, o processo de instalação e os
modelos de banco sofrem alterações continuadas. Entretanto, em um momento mais
estável, considere que estamos aderentes ao [semantic
versioning](http://semver.org/lang/pt-BR/).

Como as iniciativas estão bem fragmentadas, caso queira acompanhar os trabalhos
diários, sugerimos verificar as _branchs_ ou verificar se existe uma
[issue](https://github.com/tst-labs/esocial/issues) já aberta com as mesmas dúvidas.

## Processo de Desenvolvimento

Usamos o [git flow](http://nvie.com/posts/a-successful-git-branching-model/)
como modelo de ramificação no desenvolvimento desse produto.

### Mensagens de _commit_

Trate as mensagens de _commit_ como mensagens de email que descrevem a alteração
e o porquê.

A primeira linha de um _commit_ deve ser tratada como o **assunto** de um email.
Ela deve ser estritamente menor que 50 caracteres. O assunto deve ser
autocontido e ter um sentido próprio e não apenas referenciar números de
_issues_ ou _bugs_ externos.

A segunda linha deverá ser deixada em branco.

A terceira linha severá ser iniciada com o corpo da mensagem do _commit_ (um ou
dois parágrafos) descrevendo os detalhes do _commit_. Os parágrafos devem ser
separados por linhas em branco e, caso sejam maiores que 76 caracteres, devem
ser quebrados para melhor legibilidade.

As referências externas podem ficar na última parte da mensagem de _commit_
(_e.g. que issues foram tratadas ou corrigidas_).

### Segurança

O servidor ou serviço **eSocial-jt** deverá rodar em ambiente interno ao órgão
(sem interface externa ao órgão). Assim, simples regras de visibilidade podem
ser implementadas pela infra.

## Guia de Contribuição

### Submeter uma _issue_

Antes de inciar qualquer contribuição por favor comente ou submeta uma issue
para que haja uma discussão a respeito da implementação.

### Pull Request

Alterações deverão ser solicitadas através de Pull Requests para a _branch_
**master**.

# **_ Documento em Elaboração _**
