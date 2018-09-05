import React, { Fragment } from "react";
import { Header, Segment } from "semantic-ui-react";

import VisualizadorJson from "../../shared/VisualizadorJson";

export default function({ ocorrencia }) {
  return (
    <Fragment>
      <Header as="h3" attached="top" inverted>
        Informações do evento
      </Header>
      <Segment attached style={{ overflow: "auto" }}>
        <VisualizadorJson json={ocorrencia.evento} collapsed={true} />
      </Segment>
    </Fragment>
  );
}
