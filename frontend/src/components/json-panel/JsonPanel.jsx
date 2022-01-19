import { Box, Paper } from "@mui/material";
import ReactJson from "react-json-view";
import PageHeader from "../page-header/PageHeader";

function JsonPanel({
  src,
  name = false,
  collapsed = false,
  primary,
  secondary
}) {
  return (
    <Box
      padding={2}
      paddingTop={primary || secondary ? 0 : 2}
      component={Paper}
    >
      {(primary || secondary) && (
        <PageHeader primary={primary} secondary={secondary} />
      )}
      <ReactJson
        src={src}
        name={name}
        collapsed={collapsed}
        enableClipboard={false}
        displayDataTypes={false}
      />
    </Box>
  );
}

export default JsonPanel;
