import Keycloak from "keycloak-js";
import { KEYCLOAK_URL, KEYCLOAK_REALM, KEYCLOAK_CLIENT_ID } from "./env";

const keycloak = new Keycloak({
  url: KEYCLOAK_URL,
  realm: KEYCLOAK_REALM,
  clientId: KEYCLOAK_CLIENT_ID
});

export const authRequired =
  KEYCLOAK_URL && KEYCLOAK_REALM && KEYCLOAK_CLIENT_ID ? true : false;
export const { login } = keycloak;
export const { logout } = keycloak;
export const getToken = () => keycloak?.token;

export function updateToken(minValidity = 5) {
  return keycloak?.updateToken(minValidity);
}

export function initKeycloak() {
  if (!authRequired) {
    return Promise.resolve();
  }

  return keycloak
    .init({
      onLoad: "login-required"
    })
    .then((authenticated) => {
      if (!authenticated) {
        console.warn(`Não autenticado!`);
        login();
      }
    })
    .catch((err) => {
      console.error("Falha ao iniciar o keycloak: ", err);
      throw err;
    });
}
