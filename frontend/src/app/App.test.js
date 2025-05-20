import { render } from "@testing-library/react";
import { QueryClient, QueryClientProvider } from "react-query";
import App from "./App";

test("renders without crashing", () => {
  const queryClient = new QueryClient();
  render(
    <QueryClientProvider client={queryClient}>
      <App />
    </QueryClientProvider>
  );
});

jest.mock("keycloak-js", () => {
  return jest.fn().mockImplementation(() => ({
    init: jest.fn(),
    login: jest.fn(),
    logout: jest.fn()
  }));
});
