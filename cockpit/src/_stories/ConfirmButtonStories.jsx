import React from "react";
import { storiesOf } from "@storybook/react";
import { action } from "@storybook/addon-actions";

import ConfirmButton from "../shared/components/ConfirmButton";

export default function confirmButtonStories() {
  storiesOf("ConfirmButton", module)
    .add("default", () => (
      <ConfirmButton onConfirm={action("default confirmar pressionado")} />
    ))
    .add("with green check icon", () => (
      <ConfirmButton
        onConfirm={action("confirmar pressionado")}
        buttonIcon="check"
        buttonText="Confirmar"
        buttonColor="green"
      />
    ))
    .add("with red trash icon and custom message text", () => (
      <ConfirmButton
        onConfirm={action("confirma limpeza produção restrita")}
        buttonIcon="trash"
        buttonText="Limpar produção restrita"
        buttonColor="red"
        confirmContent="Tem certeza que gostaria de apagar todos os dados de Produção Restrita?"
      />
    ))
    .add("disabled", () => (
      <ConfirmButton
        onConfirm={action("não deve ser possível executar esta ação")}
        disabled
      />
    ))
    .add("loading", () => (
      <ConfirmButton
        onConfirm={action("não deve ser possível executar esta ação")}
        loading
      />
    ));
}
