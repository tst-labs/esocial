import React from "react";
import ReactJson from "react-json-view";

export default ({ json, collapsed }) => (
  <ReactJson
    src={json}
    collapsed={collapsed}
    enableClipboard={false}
    displayDataTypes={false}
  />
);
