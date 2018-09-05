# esocial-cockpit

O **esocial-cockpit** é o módulo de interface que representa o estado atual do sistema **esocial-jt-service**.

## Pré-requisitos

- Node.js
- NPM

## Executando em desenvolvimento

```console
npm install
npm start
```

## Executando os testes

```console
npm test
```

## Gerando a build

```console
npm run build
```

Os arquivos são gerados na pasta `dist`. Esses arquivos devem ser usados em um servidor de produção.

## Verificando qualidade do código

```console
npm run lint
```

## Detalhes de implementação

O projeto foi implementado utilizando [React](https://reactjs.org/) para componentizar a visão e o [Semantic UI](https://react.semantic-ui.com/) para auxiliar no design dos componentes. Além disso várias outras bibliotecas de auxílio foram utilizadas conforme arquivo [package.json](./package.json).

### Estrutura de pastas

- `/src/app`: arquivos especificos do `esocial-cockpit`
- `/src/app/api`: arquivos para conexão com API do `esocial-jt-service`
- `/src/app/components`: componentes visuais
- `/src/app/models`: Modelos usados nos componentes visuais e mapeamentos da API para esses modelos
- `/src/app/App.jsx`: Componente principal da aplicação
- `/src/shared`: arquivos criados no `esocial-cockpit` mas que podem ser extraídos posteriormente para outros projetos
- `/src/shared/components`: componentes genéricos o suficiente para atender outros projetos
- `/src/shared/libs`: bibliotecas genéricas o suficiente para atender outros projetos

### Desenvolvimento de componentes genéricos

Os componentes mais genéricos da aplicação podem ser visualizados sem a necessidade de execução do ambiente completo. Para isso utilizamos a biblioteca [storybook](https://storybook.js.org/). Essa biblioteca permite catalogar componentes da aplicação.

Para visualizar o catálogo de componentes genéricos execute o comando abaixo e acessando [http://localhost:9001/](http://localhost:9001/):

```console
npm run storybook
```

### Complexidades

Normalmente nas aplicações React os dados são passados de cima para baixo (pai para filho) através de propriedades (props). Isso gera um grande incômodo quando uma propriedade é utilizada por diversos componentes na aplicação.

Utilizamos a API de Context do React para que não tenhamos que explicitar essas propriedades para cada nó da árvore.

#### [`LoaderContext`](./src/shared/components/loader)

Utilizado para controlar o estado de **loading** da aplicação.

- `withLoader(Component)`: HOC para injetar propriedades de loader
- `<LoaderProvider>`: Componente para injetar comportamentos do loader no contexto

##### Uso

```jsx
class LoaderComponent {
  async componentDidMount() {
    this.props.setLoading(
      "identificador-loading", // identifica o loader para evitar conflitos
      true, // define que o loader deve ser ativado
      false // define se o loader deve bloquear a interface ou não
    );
    await somethingAsync();
    this.props.setLoading(
      "identificador-loading", // procura pelo loader com mesmo id
      false // define que loader deve ser desativado
    );
  }

  render() {
    const loader = this.props.getLoading("identificador-loading");

    if (loader.active && loader.blockui) {
      return <div>Carregando...</div>;
    } else {
      return (
        <LoaderProvider>
          {loader.active ? <div>Carregando...</div> : null}
          <Componente />
        </LoaderProvider>
      );
    }
  }
}

export default withLoader(LoaderComponent);
```

#### [`MessageContext`](./src/shared/components/message)

Utilizado para controlar as mensagens da aplicação.

- `withMessage(Component)`: HOC para injetar propriedades de mensagens
- `<MessageProvider>`: Componente para injetar comportamentos de controle de mensagens no contexto

##### Uso

```jsx
class MessengerComponent {
  async componentDidMount() {
    this.props.addMessage(
      ERROR, // MessageType, pode ser INFO, SUCCESS, WARNING, ERROR
      "Mensagem a ser adicionada" // Texto da mensagem
    );
  }

  render() {
    return (
      <MessageProvider>
        {this.props.messages.map(message => (
          <div>
            {message.type}: {message.text}
          </div>
        ))}
        ;
      </MessageProvider>
    );
  }
}

export default withMessage(MessengerComponent);
```

Para entender melhor sobre a API de contextos visite: [https://reactjs.org/docs/context.html](https://reactjs.org/docs/context.html).
