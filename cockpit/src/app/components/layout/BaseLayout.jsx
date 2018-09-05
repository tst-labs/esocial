import React from "react";
import { Grid } from "semantic-ui-react";

import BaseMenu from "./BaseMenu";
import BaseRow from "./BaseRow";
import MessageList from "../../../shared/components/message/MessageList";
import { withMessages } from "../../../shared/components/message/MessageContext";
import {
  BlockedLoader,
  Loader
} from "../../../shared/components/loader/Loader";

function mostrarListaMensagens(messages) {
  if (!messages || Object.values(messages).length === 0) {
    return null;
  } else {
    return (
      <BaseRow>
        <MessageList messages={messages} />
      </BaseRow>
    );
  }
}

function BaseLayout({ messages, children, menuItems }) {
  return (
    <Grid
      container
      padded="vertically"
      stackable
      style={{ marginBottom: "2rem" }}
    >
      <BaseMenu extraItems={menuItems} />
      {mostrarListaMensagens(messages)}
      {children}
      <BlockedLoader />
      <Loader />
    </Grid>
  );
}

export default withMessages(BaseLayout);
