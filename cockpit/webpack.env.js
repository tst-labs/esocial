module.exports = {
  ESOCIAL_SERVICE_URL:
    process.env.ESOCIAL_SERVICE_URL ||
    "http://localhost:8080/esocial-jt-service",
  CONECTOR_ETL_SERVICE_URL:
    process.env.CONECTOR_ETL_SERVICE_URL ||
    "http://localhost:8888/esocial-pentaho-server"
};
