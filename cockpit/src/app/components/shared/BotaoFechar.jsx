import React from "react";
import { Button, Icon } from "semantic-ui-react";

export default function() {
  return (
    <Button animated onClick={() => window.open("", "_self").close()}>
      <Button.Content visible>Voltar</Button.Content>
      <Button.Content hidden>
        <Icon name="left arrow" />
      </Button.Content>
    </Button>
  );
}
