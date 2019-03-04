<template>
  <div>
    <carousel
      :autoplay="false"
      :navigation-enabled="true"
      :per-page="1"
      :autoplay-timeout="5000"
    >
      <slide class="slide">
        <img class="images" src="~assets/images/Medeo.jpg" alt="Medeo">
      </slide>
      <slide class="slide">
        <img class="images" src="~assets/images/Shymbulak.jpg" alt="Shymbulak">
      </slide>
      <slide class="slide">
        <img class="images" src="~assets/images/Zoo.jpg" alt="Zoo">
      </slide>
    </carousel>
  </div>
</template>

<script>
import { Carousel, Slide } from "vue-carousel";
export default {
  components: {
    Carousel,
    Slide
  },
  data() {
    return {
      slide: [
        '<div class="slide">Slide 1</div>',
        '<div class="slide">Slide 1</div>',
        '<div class="slide">Slide 1</div>'
      ]
    };
  }
};
</script>

<style>
.slide {
  height: 540px;
}
.images {
  width: 100%;
  height: 100%;
}
</style>
