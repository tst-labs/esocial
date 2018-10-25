import { oneOfType, arrayOf, node } from "prop-types";

export const childrenDefaultPropType = oneOfType([arrayOf(node), node]);
