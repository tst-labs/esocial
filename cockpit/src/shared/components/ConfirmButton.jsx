import React, { Component, Fragment } from "react";
import { func, string } from "prop-types";
import { Button, Confirm, Icon } from "semantic-ui-react";

export default class ConfirmButton extends Component {
  static propTypes = {
    onConfirm: func.isRequired,
    buttonText: string.isRequired,
    buttonIcon: string.isRequired,
    buttonColor: string,
    onError: func,
    cancelLabel: string,
    confirmLabel: string,
    confirmContent: string
  };

  static defaultProps = {
    confirmContent: "Tem certeza?",
    cancelLabel: "Cancelar",
    confirmLabel: "OK",
    buttonColor: undefined,
    buttonText: "Enviar",
    buttonIcon: "circle"
  };

  state = { displayConfirmDialog: false };

  __handleConfirm() {
    const { onConfirm, onError } = this.props;
    try {
      onConfirm();
    } catch (error) {
      onError(error);
    } finally {
      this.setState(() => ({
        displayConfirmDialog: false
      }));
    }
  }

  __handleCancel() {
    this.setState(state => ({
      ...state,
      displayConfirmDialog: false
    }));
  }

  __handleClick() {
    this.setState(state => ({
      ...state,
      displayConfirmDialog: true
    }));
  }

  render() {
    const {
      buttonText,
      buttonIcon,
      buttonColor,
      confirmContent,
      cancelLabel,
      confirmLabel,
      disabled,
      loading
    } = this.props;
    return (
      <Fragment>
        <Button
          onClick={this.__handleClick.bind(this)}
          icon
          labelPosition="left"
          color={buttonColor}
          style={this.props.style}
          disabled={disabled || loading}
          loading={loading}
        >
          <Icon name={buttonIcon} />
          <span>{buttonText}</span>
        </Button>
        <Confirm
          open={this.state.displayConfirmDialog}
          size="tiny"
          cancelButton={cancelLabel}
          confirmButton={confirmLabel}
          onCancel={this.__handleCancel.bind(this)}
          onConfirm={this.__handleConfirm.bind(this)}
          content={confirmContent}
        />
      </Fragment>
    );
  }
}
