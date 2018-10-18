import React from "react";
import { Loader as SemanticLoader, Dimmer } from "semantic-ui-react";
import { withLoader, loaderPropTypes } from "./LoaderContext";

export function generalLoadingState(loading) {
  return Object.values(loading).reduce(
    (final, current) => ({
      active: final.active || current.active,
      blockui: final.blockui || current.blockui
    }),
    { active: false, blockui: false }
  );
}

function PureBlockedLoader({ loading }) {
  const generalLoading = generalLoadingState(loading);
  if (!generalLoading.blockui) return null;
  return (
    <Dimmer active={generalLoading.active}>
      <SemanticLoader />
    </Dimmer>
  );
}

PureBlockedLoader.propTypes = {
  ...loaderPropTypes
};

function PureLoader({ loading }) {
  const generalLoading = generalLoadingState(loading);
  if (generalLoading.blockui) return null;
  return (
    <div style={{ position: "absolute", top: "0.2rem", right: "0.2rem" }}>
      <SemanticLoader active={generalLoading.active} size="tiny" inline />
    </div>
  );
}

PureLoader.propTypes = {
  ...loaderPropTypes
};

export const Loader = withLoader(PureLoader);
export const BlockedLoader = withLoader(PureBlockedLoader);
