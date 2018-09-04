import React, { Component } from "react";
import { Popup } from "semantic-ui-react";

import OnflineIcon, {
  OnflineStatus
} from "../../../../shared/components/OnflineIcon";
import { statusEsocialJt } from "../../../api/esocial-jt";

const CHECK_STATUS_INTERVAL = 3000;

export default class StatusEsocialJt extends Component {
  state = {
    status: OnflineStatus.Fetching
  };

  __checkStatus = async () => {
    try {
      const response = await statusEsocialJt();
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
        jt
      </span>
    );
    return (
      <Popup
        inverted
        trigger={statusIcon}
        content={`Conexão sistema eSocial-jt: ${status.descricao}`}
      />
    );
  }
}
