import React, { Component } from "react";
import { Popup } from "semantic-ui-react";

import OnflineIcon, {
  OnflineStatus
} from "../../../../shared/components/OnflineIcon";
import { statusConector } from "../../../api/conector";

const CHECK_STATUS_INTERVAL = 3000;

export default class StatusConector extends Component {
  state = {
    status: OnflineStatus.Fetching
  };

  __checkStatus = async () => {
    try {
      const response = await statusConector();
      this.setState({
        status:
          response.status === "UP"
            ? OnflineStatus.Online
            : OnflineStatus.Offline
      });
    } catch (error) {
      console.error(error);
      this.setState({ status: OnflineStatus.Offline });
    }
  };

  componentDidMount() {
    this.checkStatusInterval = setInterval(
      this.__checkStatus,
      CHECK_STATUS_INTERVAL
    );
    this.__checkStatus();
  }

  componentWillUnmount() {
    clearInterval(this.checkStatusInterval);
  }

  render() {
    const { status } = this.state;
    const statusIcon = (
      <span style={{ margin: "0 0.2rem" }}>
        <OnflineIcon status={status} />
        conector
      </span>
    );
    return (
      <Popup
        inverted
        trigger={statusIcon}
        content={`Conexão Conector ETL: ${status.descricao}`}
      />
    );
  }
}
