import { red } from "@mui/material/colors";
import { ptBR } from "@mui/material/locale";
import { createTheme } from "@mui/material/styles";
import { PRIMARY_COLOR, SECONDARY_COLOR } from "./env";

// A custom theme for this app
const white = "#FFF";
const black = "#000";
const theme = createTheme(
  {
    palette: {
      white,
      black,
      primary: {
        main: PRIMARY_COLOR
      },
      secondary: {
        main: SECONDARY_COLOR
      },
      error: {
        main: red.A400
      },
      background: {
        default: "#F4F6F8",
        paper: white
      }
    },
    mixins: {
      toolbar: {
        minHeight: 40
      }
    }
  },
  ptBR
);

export default theme;
