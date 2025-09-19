import { jwtDecode } from "jwt-decode";
import { getToken } from "../shared/keycloak";
import { KEYCLOAK_CLIENT_ID } from "../shared/env";

export function getUserRoles(token = getToken()) {
  if (!token) return [];
  try {
    const decoded = jwtDecode(token);

    // Obtem as roles vindas do Realm
    const realmRoles = decoded.realm_access?.roles || [];

    // Obtem as roles vindas do Client
    const clientRoles =
      decoded.resource_access?.[KEYCLOAK_CLIENT_ID]?.roles || [];

    return [...realmRoles, ...clientRoles];
  } catch (error) {
    console.error("Error decoding token:", error);
    return [];
  }
}

export function hasAnyRole(requiredRoles, token = getToken()) {
  const rolesArray = Array.isArray(requiredRoles)
    ? requiredRoles
    : [requiredRoles];
  const userRoles = getUserRoles(token);
  return rolesArray.some((role) => userRoles.includes(role));
}
