import React from "react";
import { Route } from "react-router-dom";

import Factory from "./Factory";
import DashboardRoute from "./components/dashboard/DashboardRoute";
import OcorrenciaDetalhadaRoute from "./components/ocorrencia/OcorrenciaDetalhadaRoute";

export default function App() {
  return (
    <Factory>
      <Route exact path="/" component={DashboardRoute} />
      <Route path="/ocorrencia/:id" component={OcorrenciaDetalhadaRoute} />
    </Factory>
  );
}
