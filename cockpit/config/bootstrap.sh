#!/bin/sh
CONF="
window.env = { \
        ESOCIAL_SERVICE_URL: \"$ESOCIAL_SERVICE_URL\", 
        CONECTOR_ETL_SERVICE_URL: \"$CONECTOR_ETL_SERVICE_URL\" 
    };
"

echo $CONF > /var/www/public/config.js
nginx