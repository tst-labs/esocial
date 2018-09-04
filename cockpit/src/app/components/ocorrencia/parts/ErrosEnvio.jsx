import React, { Fragment } from "react";
import { Header, Segment, List } from "semantic-ui-react";

function Erro({ erro }) {
  return (
    <List.Item>
      <List.Content>
        <List.Header>{erro.titulo}</List.Header>
        <List.Description>
          {erro.descricao}{" "}
          {erro.localizacao ? (
            <div
              style={{
                marginTop: "1rem",
                fontSize: "0.9em",
                fontWeight: "bold"
              }}
            >
              {erro.localizacao}
            </div>
          ) : null}
        </List.Description>
      </List.Content>
    </List.Item>
  );
}

export default function ErrosEnvio({ erros }) {
  return (
    <Fragment>
      <Header
        as="h3"
        attached="top"
        inverted
        style={{ backgroundColor: "#db2828" }}
      >
        Erros de envio
      </Header>
      <Segment attached style={{ overflow: "auto" }}>
        <List divided relaxed>
          {erros.map(erro => (
            <Erro key={erro.id} erro={erro} />
          ))}
        </List>
      </Segment>
    </Fragment>
  );
}
