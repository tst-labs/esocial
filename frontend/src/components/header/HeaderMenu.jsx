import { Icon, IconButton, Menu } from "@mui/material";
import { useState } from "react";
import { PRODUCAO_RESTRITA } from "../../shared/env";
import { authRequired } from "../../shared/keycloak";
import LimparProducaoRestrita from "./LimparProducaoRestrita";
import Logout from "./Logout";
import Status from "./Status";

const isProducaoRestrita = PRODUCAO_RESTRITA === "S";

function HeaderMenu() {
  const [anchorEl, setAnchorEl] = useState(null);
  const open = Boolean(anchorEl);
  const handleClick = (event) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };

  return (
    <>
      <IconButton
        sx={{
          color: "white",
          height: 40
        }}
        onClick={handleClick}
      >
        <Icon>menu</Icon>
      </IconButton>
      <Menu
        id="basic-menu"
        open={open}
        onClose={handleClose}
        anchorEl={anchorEl}
        anchorOrigin={{
          vertical: "bottom",
          horizontal: "right"
        }}
        transformOrigin={{
          vertical: "top",
          horizontal: "right"
        }}
      >
        {isProducaoRestrita && <LimparProducaoRestrita onClose={handleClose} />}
        <Status onClose={handleClose} />
        {authRequired && <Logout />}
      </Menu>
    </>
  );
}

export default HeaderMenu;
