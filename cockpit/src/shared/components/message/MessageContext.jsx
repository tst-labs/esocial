import { shape, string, number, func, arrayOf, oneOfType } from "prop-types";

import React, { Component } from "react";
import uniqid from "uniqid";
import produce from "immer";
import { messageTypeShape } from "./MessageType";
import { childrenDefaultPropType } from "../../../app/components/shared/PropTypesHelper";

export const messageShape = shape({
  id: oneOfType([string, number]),
  text: string,
  close: func,
  type: messageTypeShape
});

export const messagePropTypes = shape({
  messages: arrayOf(messageShape),
  addMessage: func
});

const MessageContext = React.createContext({
  messages: {},
  addMessage: () => {}
});

export function withMessages(Component) {
  return function MessagedComponent(props) {
    return (
      <MessageContext.Consumer>
        {context => <Component {...context} {...props} />}
      </MessageContext.Consumer>
    );
  };
}

export class MessageProvider extends Component {
  static propTypes = {
    children: childrenDefaultPropType
  };

  state = {
    messages: {}
  };

  __addMessage = (type, text) => {
    const id = uniqid();
    const close = () => {
      this.setState(
        produce(draft => {
          delete draft.messages[id];
        })
      );
    };
    this.setState(
      produce(draft => {
        draft.messages[id] = { id, type, text, close };
      })
    );
  };

  __createContextValue() {
    return {
      messages: this.state.messages,
      addMessage: this.__addMessage
    };
  }

  render() {
    return (
      <MessageContext.Provider value={this.__createContextValue()}>
        {this.props.children}
      </MessageContext.Provider>
    );
  }
}
