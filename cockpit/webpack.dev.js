const webpack = require("webpack");
const merge = require("webpack-merge");
const common = require("./webpack.common.js");
const process = require("process");

const urls = {
  development: "//localhost:8080"
};

module.exports = merge(common, {
  devtool: "inline-source-map",
  devServer: {
    contentBase: "./dist",
    host: "localhost",
    historyApiFallback: true
  },
  plugins: [
    new webpack.DefinePlugin({
      "process.env.BASE_URL": JSON.stringify(urls[process.env.NODE_ENV])
    })
  ]
});
