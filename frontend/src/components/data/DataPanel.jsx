import { Box, LinearProgress, Paper, Typography } from "@mui/material";

function DataPanel({
  children,
  loading,
  isEmpty,
  emptyMessage = "Nenhum dado para exibir",
  paperEmptyPanel
}) {
  if (loading) {
    return <LinearProgress />;
  }
  if (!isEmpty) {
    return children;
  }

  return (
    <EmptyPanel emptyMessage={emptyMessage} paperEmptyPanel={paperEmptyPanel} />
  );
}

function EmptyPanel({ emptyMessage, paperEmptyPanel }) {
  return (
    <Box
      padding={2}
      component={paperEmptyPanel ? Paper : undefined}
      sx={(theme) => ({
        color: theme.palette.grey[600],
        fontStyle: "italic"
      })}
      justifyContent="center"
      textAlign="center"
    >
      <Typography sx={{ fontSize: "1.5em" }}>{emptyMessage}</Typography>
    </Box>
  );
}

export default DataPanel;
