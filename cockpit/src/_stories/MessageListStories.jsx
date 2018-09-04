import React from "react";
import { storiesOf } from "@storybook/react";
import { action } from "@storybook/addon-actions";

import {
  SUCCESS,
  INFO,
  WARNING,
  ERROR
} from "../shared/components/message/MessageType";
import MessageList from "../shared/components/message/MessageList";

const successMessage = {
  id: 1,
  type: SUCCESS,
  text: "Tudo certo!",
  close: action("Fecharia mensagem sucesso")
};

const warningMessage = {
  id: 2,
  type: WARNING,
  text: "Olhe com atenção!",
  close: action("Fecharia mensagem atenção")
};

const infoMessage = {
  id: 3,
  type: INFO,
  text: "Informe-se!",
  close: action("Fecharia mensagem informação")
};

const errorMessage = {
  id: 4,
  type: ERROR,
  text: "Algo deu errado!",
  close: action("Fecharia mensagem erro")
};

export default function messageListStories() {
  storiesOf("MessageList", module).add("with on of a kind message list", () => (
    <MessageList
      messages={{
        1: successMessage,
        2: warningMessage,
        3: infoMessage,
        4: errorMessage
      }}
    />
  ));
}
