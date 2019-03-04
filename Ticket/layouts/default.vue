<template>
  <div>
    <nuxt />
  </div>
</template>

<style>
@font-face {
  font-family: "Lato-Regular";
  src: url("~assets/fonts/Lato-Regular.woff");
}
@font-face {
  font-family: "Lato-Light";
  src: url("~assets/fonts/Lato-Light.woff");
}
.nuxt {
  text-decoration: none;
}
p,
h1,
h3 {
  font-family: "Lato-Light";
}
html {
  font-family: "Lato-Regular", -apple-system, BlinkMacSystemFont, "Segoe UI",
    Roboto, "Helvetica Neue", Arial, sans-serif;
  font-size: 16px;
  word-spacing: 1px;
  -ms-text-size-adjust: 100%;
  -webkit-text-size-adjust: 100%;
  -moz-osx-font-smoothing: grayscale;
  -webkit-font-smoothing: antialiased;
  box-sizing: border-box;
}
body {
  background-color: #f9f9f9;
}
html,
body {
  min-height: 100% !important;
  height: 100vh;
}
*,
*:before,
*:after {
  box-sizing: border-box;
  margin: 0;
}
</style>
