class MessageType {
  constructor(type, color, title, icon) {
    this.type = type;
    this.color = color;
    this.title = title;
    this.icon = icon;
  }
}

export const INFO = new MessageType(
  "info",
  "blue",
  "Informação",
  "info circle"
);
export const SUCCESS = new MessageType(
  "success",
  "green",
  "Sucesso",
  "check circle"
);
export const WARNING = new MessageType(
  "warning",
  "yellow",
  "Atenção",
  "warning circle"
);
export const ERROR = new MessageType(
  "error",
  "red",
  "Erro",
  "exclamation triangle"
);
