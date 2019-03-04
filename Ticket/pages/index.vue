<template>
  <div>
    <c-header />
    <div class="container">
      <div class="slider">
        <c-slider />
      </div>
      <hr>
      <div class="info-block">
        <div class="info-block__container">
          <h1>SunTravel Company</h1>
          <p>"We are the touristic company, serving tourists primarily coming to visit the Almaty city and its touristic attractions. Established in 2011, we already served almost 2000 tourists from different parts of the world, who came to visit the Almaty city. Company specialized and focused on promoting and conducting specific touristic trips within and among the Almaty, specifically focusing on each tourist’s interests. We are glad to help you with choosing the ideal touristic trip for you and your close people. Do not hesitate to contact us for further information and details. Kind regards, SunTravel Company. "</p>
        </div>
      </div>
    </div>
    <c-footer />
  </div>
</template>

<script>
import CHeader from "~/components/Header";
import CSlider from "~/components/Slider";
import CFooter from "~/components/Footer";
export default {
  components: {
    CHeader,
    CSlider,
    CFooter
  },
  data() {
    return {};
  }
  // mounted() {
  //   this.$axios.get("http://localhost:6789/tickets").then(response => {
  //     console.log(response)
  //   })
  // }
};
</script>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  align-items: center;
}
.slider {
  max-width: 1200px;
  min-width: 700px;
  height: 50%;
  width: 70%;
  padding: 50px 50px;
}
.info-block {
  width: 100%;
  display: flex;
  justify-content: center;
  margin-bottom: 40px;
}
.info-block__container {
  width: 60%;
}
.info-block h1 {
  text-align: center;
  font-weight: 300;
  padding-bottom: 20px;
}
.info-block p {
  text-align: center;
  padding-bottom: 20px;
  font-size: 24px;
  font-weight: 100;
}
hr {
  width: 50%;
  margin-bottom: 40px;
  height: 1px;
  border: none;
  background: black;
}
</style>
