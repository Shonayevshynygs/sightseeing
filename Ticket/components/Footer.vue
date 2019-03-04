<template>
  <div class="footer">
    <div class="social_network">
      <a class="icons" href="https://www.facebook.com/"><img src="~assets/images/facebook-logo.svg"></a>
      <a class="icons" href="https://www.instagram.com/"><img src="~assets/images/instagram-logo.png"></a>
    </div>
    <p>@DM 2019</p>
  </div>
</template>
<style scoped>
.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px 0px 10px 0px;
  background: #2f6adf;
  box-shadow: 4px 0px 21px rgba(0, 0, 0, 0.4);
}
p {
  color: white;
}
.social_network {
  display: flex;
  justify-content: center;
  padding-bottom: 20px;
}
.icons {
  height: 34px;
  width: 34px;
  margin: 10px;
}
</style>
