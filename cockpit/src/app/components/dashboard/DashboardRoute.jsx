import React, { Component } from "react";

import { listarOcorrencias } from "../../api/esocial-jt";

import Dashboard from "./Dashboard";
import { withLoader } from "../../../shared/components/loader/LoaderContext";
import { withMessages } from "../../../shared/components/message/MessageContext";

const LOAD_OCORRENCIAS_INTERVAL = 3000;
const LOADER_ID = "load-ocorrencias";

class DashboardRoute extends Component {
  state = {
    ocorrencias: null,
    filtroEstadoOcorrencia: null
  };

  __loadOcorrencias = async () => {
    this.props.setLoading(LOADER_ID, true, this.state.ocorrencias === null);
    try {
      const ocorrencias = await listarOcorrencias();
      this.setState({ ocorrencias });
    } catch (error) {
      console.error(error);
    } finally {
      this.props.setLoading(LOADER_ID, false);
    }
  };

  componentDidMount() {
    this.loadOcorrenciasInterval = setInterval(
      this.__loadOcorrencias,
      LOAD_OCORRENCIAS_INTERVAL
    );
    this.__loadOcorrencias();
  }

  componentWillUnmount() {
    clearInterval(this.loadOcorrenciasInterval);
  }

  render() {
    const { ocorrencias, filtroEstadoOcorrencia } = this.state;
    return (
      <Dashboard
        ocorrencias={ocorrencias}
        onSelectSumario={estado => {
          this.setState({ filtroEstadoOcorrencia: estado });
        }}
        filtroEstado={filtroEstadoOcorrencia}
      />
    );
  }
}

export default withMessages(withLoader(DashboardRoute));
