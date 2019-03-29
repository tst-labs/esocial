import React from "react";
import { Router } from "react-router-dom";
import { createBrowserHistory } from "history";

import { MessageProvider } from "../shared/components/message/MessageContext";
import { LoaderProvider } from "../shared/components/loader/LoaderContext";
import { childrenDefaultPropType } from "./components/shared/PropTypesHelper";

export const history = createBrowserHistory({
  basename: process.env.NODE_ENV === ""
});

export default function Factory({ children }) {
  return (
    <Router history={history}>
      <LoaderProvider>
        <MessageProvider>{children}</MessageProvider>
      </LoaderProvider>
    </Router>
  );
}

Factory.propTypes = { children: childrenDefaultPropType };
