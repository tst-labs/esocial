import React, { Component } from "react";

import { bool } from "prop-types";
import { Button, Icon } from "semantic-ui-react";
import {
  withLoader,
  loaderPropTypes
} from "../../../../shared/components/loader/LoaderContext";
import { executarETL } from "../../../api/conector";
import { withMessages } from "../../../../shared/components/message/MessageContext";
import { ERROR } from "../../../../shared/components/message/MessageType";

const LOADER_ID = "carregar-dados";

class AcoesCarregarDados extends Component {
  static propTypes = {
    ...loaderPropTypes,
    disabled: bool
  };

  __handleClick = async () => {
    const { setLoading, addMessage } = this.props;
    setLoading(LOADER_ID, true);
    try {
      await executarETL();
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
      <Button
        icon
        labelPosition="left"
        color="green"
        style={{ marginRight: 10 }}
        disabled={disabled || getLoading(LOADER_ID).active}
        loading={getLoading(LOADER_ID).active}
        onClick={this.__handleClick}
      >
        <Icon name="sync" />
        <span>Carregar Dados</span>
      </Button>
    );
  }
}

export default withMessages(withLoader(AcoesCarregarDados));
