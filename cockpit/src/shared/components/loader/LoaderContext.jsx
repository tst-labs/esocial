import React, { Component } from "react";
import produce from "immer";

const LoaderContext = React.createContext({
  loading: {
    active: false,
    blockui: false,
    id: null
  },
  setLoading: () => {}
});

export function withLoader(Component) {
  return function LoaderComponent(props) {
    return (
      <LoaderContext.Consumer>
        {context => <Component {...context} {...props} />}
      </LoaderContext.Consumer>
    );
  };
}

export class LoaderProvider extends Component {
  state = {
    loading: {}
  };

  __setLoading = (id, active, blockui = false) => {
    this.setState(
      produce(draft => {
        if (active) {
          draft.loading[id] = { active, blockui };
        } else {
          delete draft.loading[id];
        }
      })
    );
  };

  __getLoading = id => {
    const currentLoading = this.state.loading[id];
    if (currentLoading) {
      return currentLoading;
    } else {
      return {
        active: false,
        blockui: false
      };
    }
  };

  __createContextValue() {
    return {
      loading: this.state.loading,
      setLoading: this.__setLoading,
      getLoading: this.__getLoading
    };
  }

  render() {
    return (
      <LoaderContext.Provider value={this.__createContextValue()}>
        {this.props.children}
      </LoaderContext.Provider>
    );
  }
}
