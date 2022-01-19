import React from "react";
import { Route, Routes as Switch } from "react-router-dom";
import NotFound from "./error/NotFound";
import EventoDetalhePage from "./eventos-detalhes/EventoDetalhePage";
import EventosPage from "./eventos/EventosPage";

function Routes() {
  return (
    <Switch>
      <Route path="*" element={<NotFound />} />
      <Route path="/" element={<EventosPage />} />
      <Route path="/eventos/:id" element={<EventoDetalhePage />} />
    </Switch>
  );
}

export default Routes;
