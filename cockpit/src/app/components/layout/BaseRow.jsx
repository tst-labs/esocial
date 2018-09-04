import React from "react";
import { Grid } from "semantic-ui-react";

function BaseRow({ strecthed = false, children }) {
  return (
    <Grid.Row>
      <Grid.Column stretched={strecthed}>{children}</Grid.Column>
    </Grid.Row>
  );
}

export default BaseRow;
