const fs = require("fs");
({ version } = require("./package.json"));
const publicDir = "./public";
if (!fs.existsSync(publicDir)) {
  fs.mkdirSync(publicDir);
}
const build = `window.info = {
  versao: "${version}",
  build: "${process.env.BUILD_NUMBER || "local"}",
  data: "${new Date().toISOString()}"
}`;
fs.writeFileSync(`${publicDir}/info.js`, build, "utf8", (err) => {
  console.log("Problemas gravando o arquivo", err);
});
