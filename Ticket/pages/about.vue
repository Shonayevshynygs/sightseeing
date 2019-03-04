<template>
  <div class="main">
    <c-header />
    <div class="about">
      <hr>
      <div class="about__container">
        <h1>SunTravel Company</h1>
        
        <p>
          We are the touristic company, serving tourists primarily coming to visit the Almaty city and its touristic
          attractions. Established in 2011, we already served almost 2000 tourists from different parts of the world,
          who came to visit the Almaty city. Company specialized and focused on promoting and conducting
          specific touristic trips within and among the Almaty, specifically focusing on each tourist’s interests. We
          are glad to help you with choosing the ideal touristic trip for you and your close people. Do not hesitate to
          contact us for further information and details. Kind regards, SunTravel Company.
        </p>
        <img src="~assets/images/sunlogo.png" height="250" width="760">
      </div>
      <hr>
    </div>
    <c-footer />
  </div>
</template>
<script>
import CHeader from "~/components/Header";
import CFooter from "~/components/Footer";
export default {
  components: {
    CHeader,
    CFooter
  }
};
</script>
<style scoped>
html,
body {
  min-height: 100% !important;
  height: 100vh;
}
.about {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-around;
  height: 100vh;
}
hr {
  width: 50%;
  margin: 40px;
  height: 1px;
  border: none;
  background: black;
}
.about__container {
  width: 50%;
  display: flex;
  flex-direction: column;
  text-align: center;
}
.about__container p {
  padding: 20px 0px;
  font-size: 18px;
}
</style>
