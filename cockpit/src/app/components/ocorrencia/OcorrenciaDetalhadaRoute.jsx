import React, { Component } from "react";

import { obterOcorrencia } from "../../api/esocial-jt";

import OcorrenciaDetalhada from "./OcorrenciaDetalhada";
import { withLoader } from "../../../shared/components/loader/LoaderContext";
import { withMessages } from "../../../shared/components/message/MessageContext";
import { ERROR } from "../../../shared/components/message/MessageType";

class DashboardRoute extends Component {
  state = {
    ocorrencia: null
  };

  componentDidMount() {
    this.__loadOcorrencia(this.props.match.params.id);
  }

  __loadOcorrencia = async id => {
    const loaderId = `load-ocorrencia-${id}`;
    this.props.setLoading(loaderId, true, this.state.ocorrencia === null);
    try {
      const ocorrencia = await obterOcorrencia(id);
      this.setState({ ocorrencia });
    } catch (error) {
      let errorMessage = error;
      if (error.message) {
        errorMessage = error.message;
      }
      this.props.addMessage(ERROR, errorMessage);
    } finally {
      this.props.setLoading(loaderId, false);
    }
  };

  render() {
    if (this.state.ocorrencia) {
      return <OcorrenciaDetalhada ocorrencia={this.state.ocorrencia} />;
    } else {
      return <div />;
    }
  }
}

export default withMessages(withLoader(DashboardRoute));
