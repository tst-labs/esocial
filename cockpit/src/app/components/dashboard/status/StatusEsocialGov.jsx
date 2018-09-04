import React, { Component } from "react";
import { Popup } from "semantic-ui-react";

import OnflineIcon, {
  OnflineStatus
} from "../../../../shared/components/OnflineIcon";
import { statusEsocialGov } from "../../../api/esocial-jt";

const CHECK_STATUS_INTERVAL = 1000 * 60 * 5; // 5 minutos

export default class StatusEsocialGov extends Component {
  state = {
    status: OnflineStatus.Fetching
  };

  __checkStatus = async () => {
    try {
      const response = await statusEsocialGov();
      this.setState({
        status:
          response.status === "UP"
            ? OnflineStatus.Online
            : OnflineStatus.Offline
      });
    } catch (error) {
      console.error(error);
      this.setState({ status: OnflineStatus.Unknown });
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
        gov
      </span>
    );
    return (
      <Popup
        inverted
        trigger={statusIcon}
        content={`Conexão sistema eSocial-gov: ${status.descricao}`}
      />
    );
  }
}
