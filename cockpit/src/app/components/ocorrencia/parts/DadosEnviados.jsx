import React, { Fragment } from "react";
import { Header, Segment } from "semantic-ui-react";

import VisualizadorJson from "../../shared/VisualizadorJson";
import { ocorrenciaShape } from "../../../models/ocorrencia/Ocorrencia";

function DadosEnviados({ ocorrencia }) {
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

DadosEnviados.propTypes = {
  ocorrencia: ocorrenciaShape
};

export default DadosEnviados;
