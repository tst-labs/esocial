import React from "react";
import { Icon } from "semantic-ui-react";

export class OnflineStatus {
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

export default function OnflineIcon({ status }) {
  return <Icon name={status.icon} color={status.color} />;
}
