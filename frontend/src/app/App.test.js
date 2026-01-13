import { render } from "@testing-library/react";
import { QueryClient, QueryClientProvider } from "react-query";
import App from "./App";
import { SnackbarProvider } from "notistack";

test("renders without crashing", () => {
  const queryClient = new QueryClient();
  render(
    <SnackbarProvider maxSnack={1}>
      <QueryClientProvider client={queryClient}>
        <App />
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
