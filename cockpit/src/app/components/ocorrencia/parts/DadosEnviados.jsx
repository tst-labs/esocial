import React, { Fragment } from "react";
import { Header, Segment } from "semantic-ui-react";

import VisualizadorJson from "../../shared/VisualizadorJson";

export default function({ ocorrencia }) {
  return (
    <Fragment>
      <Header as="h3" attached="top" inverted>
        Dados enviados
      </Header>
      <Segment attached style={{ overflow: "auto" }}>
        {ocorrencia.dados ? (
          <VisualizadorJson json={ocorrencia.dados} collapsed={false} />
        ) : (
          "Nenhum dado enviado"
        )}
      </Segment>
    </Fragment>
  );
}
