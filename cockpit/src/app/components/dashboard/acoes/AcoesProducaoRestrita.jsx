import { bool } from "prop-types";
import React, { Component } from "react";

import ConfirmButton from "../../../../shared/components/ConfirmButton";
import {
  withLoader,
  loaderPropTypes
} from "../../../../shared/components/loader/LoaderContext";
import { withMessages } from "../../../../shared/components/message/MessageContext";
import { ERROR } from "../../../../shared/components/message/MessageType";

import { limparProducaoRestrita } from "../../../api/esocial-jt";
import { limpar, conectorUp } from "../../../api/conector";

const LOADER_ID = "limpar-producao-restrita";

class AcoesProducaoRestrita extends Component {
  static propTypes = {
    ...loaderPropTypes,
    disabled: bool
  };

  __limparProducaoRestrita = async () => {
    const { setLoading, addMessage } = this.props;
    setLoading(LOADER_ID, true);
    try {
      await limparProducaoRestrita();
      let up = await conectorUp();
      if (up) {
        await limpar();
      }
    } catch (error) {
      let errorMessage = error;
      if (error.message) {
        errorMessage = error.message;
      }
      addMessage(ERROR, errorMessage);
    } finally {
      setLoading(LOADER_ID, false);
    }
  };

  render() {
    const { disabled, getLoading } = this.props;
    return (
      <ConfirmButton
        buttonText="Limpar produção restrita"
        confirmLabel="Sim, apagar dados de produção restrita"
        confirmContent="TODOS os dados de PRODUÇÃO RESTRITA serão APAGADOS. Tem certeza?"
        buttonColor="red"
        buttonIcon="trash"
        onConfirm={this.__limparProducaoRestrita}
        disabled={disabled}
        loading={getLoading(LOADER_ID).active}
      />
    );
  }
}

export default withMessages(withLoader(AcoesProducaoRestrita));
