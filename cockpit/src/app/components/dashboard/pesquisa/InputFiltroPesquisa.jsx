import React, { Component } from "react";
import { func } from "prop-types";
import { Input } from "semantic-ui-react";

class InputFiltroPesquisa extends Component {
  static propTypes = {
    filtrar: func.isRequired
  };

  state = {
    filtro: ""
  };

  __filtrar(event) {
    const filtro = event.target.value;
    this.setState({ filtro });
    this.props.filtrar(filtro);
  }

  render() {
    const { filtro } = this.state;
    return (
      <Input
        icon="search"
        iconPosition="left"
        placeholder="Localizar ocorrências..."
        fluid
        value={filtro}
        onChange={this.__filtrar.bind(this)}
      />
    );
  }
}

export default InputFiltroPesquisa;
