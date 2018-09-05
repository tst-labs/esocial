import { configure } from "@storybook/react";

import "babel-polyfill";
import "semantic-ui-css/semantic.min.css";

function loadStories() {
  require("../src/_stories/index.js");
}

configure(loadStories, module);
