import { Backdrop, CircularProgress } from "@mui/material";
import React, { createContext, useContext, useState } from "react";

export const LoadingContext = createContext();

export function LoadingProvider({ children }) {
  const [loading, setLoading] = useState(false);

  return (
    <LoadingContext.Provider value={setLoading}>
      <Backdrop
        sx={(theme) => ({
          zIndex: theme.zIndex.modal + 1,
          color: "#fff"
        })}
        open={loading}
      >
        <CircularProgress color="inherit" />
      </Backdrop>
      {children}
    </LoadingContext.Provider>
  );
}

export const useLoading = () => useContext(LoadingContext);
