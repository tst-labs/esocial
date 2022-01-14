const fs = require("fs");
require("dotenv").config();

const publicDir = "./public";
const prefix = "FRONTEND_ENV_";

const env = Object.entries(process.env)
  .filter(([key]) => key.startsWith(prefix))
  .reduce((accumulator, [key, value]) => {
    const parsedKey = key.substring(prefix.length);
    accumulator[parsedKey] = value;
    return accumulator;
  }, {});

const output = `window.env = ${JSON.stringify(env)}`;

fs.writeFileSync(`${publicDir}/__env.js`, output, "utf8", (err) => {
  console.log("Problemas gravando o arquivo", err);
});
