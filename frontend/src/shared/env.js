import { UserRoles } from "./roles";

export const PRIMARY_COLOR = getEnv("PRIMARY_COLOR", "#0067A0");
export const SECONDARY_COLOR = getEnv("SECONDARY_COLOR", "#19857b");
export const HABILITA_CABECALHO = getEnv("HABILITA_CABECALHO", "S");
export const PRODUCAO_RESTRITA = getEnv("PRODUCAO_RESTRITA", "S");
export const NOME_APP = getEnv("NOME_APP", "eSocial");
export const ESOCIAL_JT_SERVICE_URL = getEnv(
  "ESOCIAL_JT_SERVICE_URL",
  "http://localhost:8080/esocial-jt-service/"
);
export const KEYCLOAK_URL = getEnv("KEYCLOAK_URL", "");
export const KEYCLOAK_REALM = getEnv("KEYCLOAK_REALM", "");
export const KEYCLOAK_CLIENT_ID = getEnv("KEYCLOAK_CLIENT_ID", "");

// Definição das roles do Client para aplicação
export const KEYCLOAK_USER_ROLES = parseEnvRoles(
  getEnv("KEYCLOAK_USER_ROLES", UserRoles.USER)
);
export const KEYCLOAK_MANAGER_ROLES = parseEnvRoles(
  getEnv("KEYCLOAK_MANAGER_ROLES", UserRoles.MANAGER)
);
export const KEYCLOAK_ADMIN_ROLES = parseEnvRoles(
  getEnv("KEYCLOAK_ADMIN_ROLES", UserRoles.ADMIN)
);

// Mapeamento de roles para uso interno
export const KEYCLOAK_ROLES_CONFIG = {
  [UserRoles.USER]: KEYCLOAK_USER_ROLES,
  [UserRoles.MANAGER]: KEYCLOAK_MANAGER_ROLES,
  [UserRoles.ADMIN]: KEYCLOAK_ADMIN_ROLES
};

export { UserRoles };

function getEnv(envName, defaultValue) {
  if (!window.env) {
    window.env = {};
  }

  if (window.env[envName] == null) {
    window.env[envName] = defaultValue;
  }

  return window.env[envName];
}

function parseEnvRoles(value) {
  if (!value || typeof value !== "string") {
    return [];
  }

  return value
    .split(",") // separa por vírgula
    .map((role) => role.trim()) // remove espaços extras
    .filter((role) => role.length > 0); // remove entradas vazias
}
