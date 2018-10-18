import { object } from "prop-types";

import React from "react";
import { Segment } from "semantic-ui-react";

function TipoNaoIdentificado({ dados }) {
  return <Segment>Tipo {dados ? dados.tipo : ""} não identificado</Segment>;
}

TipoNaoIdentificado.propTypes = {
  dados: object
};

export default TipoNaoIdentificado;
