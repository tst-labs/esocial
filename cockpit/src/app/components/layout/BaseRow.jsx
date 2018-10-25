import { bool } from "prop-types";
import { childrenDefaultPropType } from "../shared/PropTypesHelper";

import React from "react";
import { Grid } from "semantic-ui-react";

function BaseRow({ strecthed = false, children }) {
  return (
    <Grid.Row>
      <Grid.Column stretched={strecthed}>{children}</Grid.Column>
    </Grid.Row>
  );
}

BaseRow.propTypes = {
  strecthed: bool,
  children: childrenDefaultPropType
};

export default BaseRow;
