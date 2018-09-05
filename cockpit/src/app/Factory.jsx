import React from "react";
import { Router } from "react-router-dom";
import { createBrowserHistory } from "history";

import { MessageProvider } from "../shared/components/message/MessageContext";
import { LoaderProvider } from "../shared/components/loader/LoaderContext";

export const history = createBrowserHistory({
  basename: process.env.NODE_ENV === "production" ? "esocial-cockpit" : ""
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
