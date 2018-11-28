# Contribuindo com o **eSocial-jt**

Desejamos criar um ambiente convidativo para contribuições nesse projeto. Para
isso, nós seguimos um código de conduta simples e pedimos que os contribuintes
façam o mesmo.

## Como contribuir com o eSocial-JT?

Para contribuir com o eSocial-JT, antes de mais nada deve-se iniciar uma discussão com o time do TST (donos desse repositório) sobre a alteração ou melhoria que você deseja ver no projeto via [issue](https://github.com/tst-labs/esocial/issues).

Essa discussão deverá seguir seu curso até que o time do TST aceite que a alteração/melhoria discutida deva ser incorporada ao projeto, nos termos acertados na discussão da _issue_.

> Neste momento, a _issue_ já deverá ter sido movida para o quadro do projeto, para a coluna _**To do**_.

Em seguida, você (o proponente da alteração/melhoria) deverá trabalhar em uma _feature branch_ com a _issue_ referenciada em seu nome (ex.: EVENTO_9999_ISSUE_99), que deverá ser enviada ao repositório tão logo esteja funcional e apta a ser incorporada ao projeto:

* Com testes suficientes para validar as regras/lógica introduzidas;
* Sem falhar os testes existentes;
* Construindo no travis-ci sem erros (https://travis-ci.org/);
* Documentada, na própria _issue_ ou com alguma entrada no _Readme_.

> Neste momento, a _issue_ deverá se encontrar na coluna _**In progress**_ no quadro do projeto.

Após enviar a _branch_ sendo trabalhada ao repositório (_push_), você deverá abrir um _pull request_. Isso deixará a alteração/melhoria em estado de revisão.

> Neste momento, a _issue_ deverá se encontrar na coluna _**Review**_ no quadro do projeto.

Lembrando que a revisão poderá implicar em alguns ciclos de correção/adaptação até que a _branch_ possa ser aceita e incorporada (_merged_).

> Finalmente, a _issue_ se encontrará na coluna _**Done**_ no quadro do projeto.

### Recapitulando o fluxo de trabalho

Vamos revisar os principais passos:

1. Iniciar discussão em uma nova _issue_;
2. Trabalhar em uma nova _feature branch_;
3. Subir a _branch_ para o repositório e abrir um _pull request_;
4. Iterar sobre a _branch_ com ajustes e correções até que seja aceita;

Ao final, se tudo correr como esperado, a _issue_ será encerrada e a alteração/melhoria estará devidamente incorporada ao projeto.

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
