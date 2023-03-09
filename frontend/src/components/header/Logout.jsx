import { MenuItem } from "@mui/material";
import { logout } from "../../shared/keycloak";

function Logout() {
  function handleLogout() {
    logout({
      redirectUri: window.location.origin
    });
  }
  return <MenuItem onClick={handleLogout}>Logout</MenuItem>;
}

export default Logout;
