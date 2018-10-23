import { object, bool } from "prop-types";

import React from "react";
import ReactJson from "react-json-view";

function VisualizadorJson({ json, collapsed }) {
  return (
    <ReactJson
      src={json}
      collapsed={collapsed}
      enableClipboard={false}
      displayDataTypes={false}
    />
  );
}

VisualizadorJson.propTypes = {
  json: object,
  collapsed: bool
};

export default VisualizadorJson;
