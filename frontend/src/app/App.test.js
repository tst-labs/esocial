import { render } from "@testing-library/react";
import { QueryClient, QueryClientProvider } from "react-query";
import App from "./App";
import { SnackbarProvider } from "notistack";
import { AdapterDateFns } from "@mui/x-date-pickers/AdapterDateFns";
import { ptBR } from "date-fns/locale";
import { LocalizationProvider } from "@mui/x-date-pickers";

test("renders without crashing", () => {
  const queryClient = new QueryClient();
  render(
    <SnackbarProvider maxSnack={1}>
      <QueryClientProvider client={queryClient}>
        <LocalizationProvider dateAdapter={AdapterDateFns} adapterLocale={ptBR}>
          <App />
        </LocalizationProvider>
      </QueryClientProvider>
    </SnackbarProvider>
  );
});

jest.mock("keycloak-js", () => {
  return jest.fn().mockImplementation(() => ({
    init: jest.fn(),
    login: jest.fn(),
    logout: jest.fn()
  }));
});
