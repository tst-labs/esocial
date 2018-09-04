import React, { Component } from "react";
import { func, arrayOf, object } from "prop-types";
import { Grid } from "semantic-ui-react";

import EstadoOcorrencia, {
  Estados
} from "../../../models/ocorrencia/EstadoOcorrencia";
import ItemSumarioOcorrenciaPorEstado from "./ItemSumarioOcorrenciaPorEstado";

class SumarioOcorrencias extends Component {
  state = {
    selectedEstadoSumario: null
  };

  __handleSelectSumario(estado) {
    let selectedEstadoSumario = estado;
    if (EstadoOcorrencia.compare(this.state.selectedEstadoSumario, estado)) {
      selectedEstadoSumario = null;
    }
    this.setState({ selectedEstadoSumario });
    this.props.onSelectSumario(selectedEstadoSumario);
  }

  render() {
    const { ocorrencias } = this.props;
    return (
      <Grid.Row>
        {Estados.map(estado => (
          <Grid.Column width={4} key={estado.id}>
            <ItemSumarioOcorrenciaPorEstado
              estado={estado}
              ocorrencias={ocorrencias}
              onClick={this.__handleSelectSumario.bind(this)}
              selected={EstadoOcorrencia.compare(
                this.state.selectedEstadoSumario,
                estado
              )}
            />
          </Grid.Column>
        ))}
      </Grid.Row>
    );
  }
}

SumarioOcorrencias.propTypes = {
  ocorrencias: arrayOf(object),
  onSelectSumario: func
};

export default SumarioOcorrencias;
