import React, { Fragment } from "react";
import { Header, Segment } from "semantic-ui-react";

import VisualizadorJson from "../../shared/VisualizadorJson";
import { ocorrenciaShape } from "../../../models/ocorrencia/Ocorrencia";

function DadosEvento({ ocorrencia }) {
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

DadosEvento.propTypes = {
  ocorrencia: ocorrenciaShape
};

export default DadosEvento;
