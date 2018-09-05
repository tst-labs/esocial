const path = require("path");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const CleanWebpackPlugin = require("clean-webpack-plugin");
const WebpackPwaManifest = require("webpack-pwa-manifest");

const HtmlWebpackPluginConfig = new HtmlWebpackPlugin({
  template: "./src/index.html",
  inject: "body"
});

const WebpackPwaManifestConfig = new WebpackPwaManifest({
  name: "Cockpit do eSocial",
  short_name: "esocial",
  description: "Uma interface simples pra acompanhar o eSocial-JT",
  background_color: "#01579b",
  theme_color: "#01579b",
  "theme-color": "#01579b",
  start_url: "/esocial-cockpit/"
});

module.exports = {
  entry: ["babel-polyfill", "./src/index.js"],
  output: {
    filename: "[name].bundle.[chunkhash].js",
    path: path.resolve(__dirname, "dist"),
    publicPath: "/"
  },
  module: {
    rules: [
      { test: /\.(js|jsx)$/, exclude: /node_modules/, loader: "babel-loader" },
      { test: /\.css$/, use: ["style-loader", "css-loader"] },
      { test: /\.(woff|woff2|eot|ttf|otf)$/, use: ["file-loader"] },
      { test: /\.(png|svg|jpg|gif|ico)$/, use: ["file-loader"] }
    ]
  },
  resolve: {
    extensions: [".js", ".jsx"]
  },
  plugins: [
    new CleanWebpackPlugin(["dist"]),
    HtmlWebpackPluginConfig,
    WebpackPwaManifestConfig
  ]
};
