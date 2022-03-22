import { Grid, Typography } from "@mui/material";
import PropTypes from "prop-types";
import React from "react";
import LoadingSkeleton from "../loading/LoadingSkeleton";

function PageHeader({ primary, secondary, commands, loading, sx }) {
  return (
    <Grid sx={sx} container justifyContent="space-between" alignItems="center">
      <Grid item xs>
        <Grid sx={{ paddingY: 2 }} container>
          <Grid container alignItems="center" spacing={2} wrap="nowrap">
            <Grid item>
              <Grid
                container
                direction="column"
                justifyContent="space-between"
                alignItems="stretch"
              >
                <Grid item>
                  <Typography variant="h6" component="h1">
                    <LoadingSkeleton loading={loading} width={200}>
                      {primary}
                    </LoadingSkeleton>
                  </Typography>
                </Grid>
                {secondary && (
                  <Grid item>
                    <Typography
                      variant="body2"
                      sx={(theme) => ({
                        color: theme.palette.grey[600]
                      })}
                    >
                      <LoadingSkeleton loading={loading}>
                        {secondary}
                      </LoadingSkeleton>
                    </Typography>
                  </Grid>
                )}
              </Grid>
            </Grid>
          </Grid>
        </Grid>
      </Grid>
      <Grid item>
        <Grid container spacing={2} alignItems="center">
          {!loading &&
            commands.map((command, index) => (
              // eslint-disable-next-line react/no-array-index-key
              <Grid item key={index}>
                {command}
              </Grid>
            ))}
        </Grid>
      </Grid>
    </Grid>
  );
}

PageHeader.propTypes = {
  primary: PropTypes.string.isRequired,
  secondary: PropTypes.oneOfType([PropTypes.string, PropTypes.object]),
  loading: PropTypes.bool,
  avatar: PropTypes.element,
  commands: PropTypes.arrayOf(PropTypes.element)
};

PageHeader.defaultProps = {
  commands: []
};

export default PageHeader;
