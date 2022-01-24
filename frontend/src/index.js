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
import PostMessage from "./components/post-message/PostMessage";
import CustomQueryClientProvider from "./CustomQueryClientProvider";
import { NOME_APP } from "./shared/env";
import theme from "./shared/theme";

ReactDOM.render(
  <StyledEngineProvider injectFirst>
    <ThemeProvider theme={theme}>
      <DialogProvider>
        <SnackbarProvider maxSnack={1}>
          <LoadingProvider>
            <CustomQueryClientProvider>
              <CssBaseline />
              <PostMessage>
                <App />
              </PostMessage>
              <ReactQueryDevtools initialIsOpen={false} />
            </CustomQueryClientProvider>
          </LoadingProvider>
        </SnackbarProvider>
      </DialogProvider>
    </ThemeProvider>
  </StyledEngineProvider>,
  document.getElementById("root")
);

document.title = NOME_APP;
