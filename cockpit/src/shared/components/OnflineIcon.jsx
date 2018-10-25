import { shape, string } from "prop-types";

import React from "react";
import { Icon } from "semantic-ui-react";

const statusShape = shape({
  id: string,
  color: string,
  icon: string,
  descricao: string
});

class OnflineStatus {
  static Offline = new OnflineStatus("offline", "red", "dont", "offline");
  static Online = new OnflineStatus("online", "green", "signal", "online");
  static Fetching = new OnflineStatus(
    "fetching",
    "grey",
    "refresh",
    "consultando"
  );
  static Unknown = new OnflineStatus(
    "unknown",
    "grey",
    "question",
    "desconhecido"
  );

  equals(status) {
    return this.id === status.id;
  }

  constructor(id, color, icon, descricao) {
    this.id = id;
    this.color = color;
    this.icon = icon;
    this.descricao = descricao;
  }
}

function OnflineIcon({ status }) {
  return <Icon name={status.icon} color={status.color} />;
}

OnflineIcon.propTypes = {
  status: statusShape
};

export { OnflineStatus };
export default OnflineIcon;
