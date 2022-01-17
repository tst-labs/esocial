import {
  CssBaseline,
  StyledEngineProvider,
  ThemeProvider
} from "@mui/material";
import { DialogProvider } from "muibox";
import { SnackbarProvider } from "notistack";
import React from "react";
import ReactDOM from "react-dom";
import { ReactQueryDevtools } from "react-query/devtools";
import App from "./app/App";
import { LoadingProvider } from "./components/loading/LoadingProvider";
import CustomQueryClientProvider from "./CustomQueryClientProvider";
import theme from "./shared/theme";

ReactDOM.render(
  <StyledEngineProvider injectFirst>
    <ThemeProvider theme={theme}>
      <DialogProvider>
        <SnackbarProvider maxSnack={1}>
          <LoadingProvider>
            <CustomQueryClientProvider>
              <CssBaseline />
              <App />
              <ReactQueryDevtools initialIsOpen={false} />
            </CustomQueryClientProvider>
          </LoadingProvider>
        </SnackbarProvider>
      </DialogProvider>
    </ThemeProvider>
  </StyledEngineProvider>,
  document.getElementById("root")
);
