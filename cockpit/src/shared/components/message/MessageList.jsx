import React, { Fragment } from "react";
import { Message } from "semantic-ui-react";

function MessageList({ messages }) {
  return (
    <Fragment>
      {Object.values(messages).map(message => (
        <Message
          key={message.id}
          icon={message.type.icon}
          header={message.type.title}
          color={message.type.color}
          content={message.text}
          onDismiss={message.close}
          size="tiny"
        />
      ))}
    </Fragment>
  );
}

export default MessageList;
