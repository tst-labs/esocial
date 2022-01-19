import { QueryClient, QueryClientProvider, QueryCache } from "react-query";
import useFeedback from "./components/feedback/useFeedback";

function CustomQueryClientProvider({ children }) {
  const { showError } = useFeedback();

  function onError(error) {
    error.isRequestError &&
      showError(error, { persist: false, preventDuplicate: true });
  }

  const queryClient = new QueryClient({
    queryCache: new QueryCache({ onError })
  });

  return (
    <QueryClientProvider client={queryClient}>{children}</QueryClientProvider>
  );
}

export default CustomQueryClientProvider;
