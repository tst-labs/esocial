import { Skeleton } from "@mui/material";
import PropTypes from "prop-types";

function LoadingSkeleton({ children, loading, width, height }) {
  return loading ? <Skeleton width={width} height={height} /> : children;
}

LoadingSkeleton.propTypes = {
  children: PropTypes.node.isRequired,
  loading: PropTypes.bool,
  width: PropTypes.number,
  height: PropTypes.number
};

LoadingSkeleton.defaultProps = {
  loading: false
};

export default LoadingSkeleton;
