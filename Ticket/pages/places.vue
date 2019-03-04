<template>
  <div class="main">
    <c-header />
    <div v-for="place in places" :key="place.id" class="places">
      <div class="places__image">
        <img v-if="place.name === 'Medeo'" class="images" src="~assets/images/Medeo.jpg" alt="Medeo">
        <img v-if="place.name === 'Shymbulak'" class="images" src="~assets/images/Shymbulak.jpg" alt="Shymbulak">
        <img v-if="place.name === 'Zoo'" class="images" src="~assets/images/Zoo.jpg" alt="Zoo">
        <img v-if="place.name === 'Big Almaty Lake'" class="images" src="~assets/images/bigalmaty.jpg" alt="lake">
        <img v-if="place.name === 'Kok-Tobe Hill'" class="images" src="~assets/images/koktobe.jpg" alt="koktobe">
        <img v-if="place.name === 'Central State Museum of Kazakhstan'" class="images" src="~assets/images/museum.jpg" alt="museum">
        <img v-if="place.name === 'Tabagan ski resort'" class="images" src="~assets/images/tabagan.jpg" alt="tabagan">
        <img v-if="place.name === 'Butakov Waterfall'" class="images" src="~assets/images/waterfall.jpg" alt="waterfall">
        <img v-if="place.name === 'First President’s Park'" class="images" src="~assets/images/park.png" alt="park">
        <img v-if="place.name === 'Fantasy World Almaty'" class="images" src="~assets/images/fantasy.jpg" alt="park">
      </div>
      <div class="places__info">
        <div class="places__info__text">
          <h3>{{ place.name }}</h3>
          <p class="sub">
            {{ place.info }}
          </p>
          <p>{{ place.description }}</p>
          <p class="tenge">
            2000 ₸
          </p>
        </div>
        <button class="places__info__button" @click="buyTicket(place)">
          Buy
        </button>
      </div>
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
  },
  data() {
    return {};
  },
  computed: {
    places() {
      return this.$store.state.places.places;
    },
    tickets() {
      return this.$store.state.places.tickets;
    }
  },
  beforeMount() {
    this.$store.dispatch("places/loadPlaces");
  },
  methods: {
    buyTicket(data) {
      this.$store.commit("places/SET_TICKET", data);
      this.$store.dispatch("places/loadPrice");
    }
  }
};
</script>
<style scoped>
html,
body {
  min-height: 100% !important;
  height: 100vh;
}
.main {
  height: 100vh;
  display: grid;
}
.places {
  display: flex;
}
.places__image {
  width: 40%;
  height: 300px;
  margin: 20px;
  padding-right: 20px;
}
.places__info {
  width: 60%;
  border-left: 1px solid #cccccc;
  margin: 20px 0px;
  display: flex;
  justify-content: space-around;
  align-items: center;
}
.places__info__text {
  width: 60%;
  margin-left: 20px;
}
.places__info__text h3 {
  margin: 10px 0px;
}
.places__info__text .sub {
  margin-bottom: 10px;
  font-weight: bold;
  font-size: 16px;
}
.places__info__text .tenge {
  font-weight: bold;
  margin: 20px 0px;
}
.places__info__button {
  font-family: "Lato-Light";
  cursor: pointer;
  border: none;
  margin: 25px 0px;
  font-size: 20px;
  color: white;
  width: 120px;
  height: 39px;
  border-radius: 10px;
  background-color: #2f6adf;
  text-align: center;
  outline: none;
  box-shadow: 0 5px 25px 0 rgba(0, 0, 0, 0.15);
}
.places__info__button:hover {
  box-shadow: 0 10px 25px 0 rgba(0, 0, 0, 0.3);
}
.places__info__button:focus {
  box-shadow: 0 10px 25px 0 rgba(0, 0, 0, 0.5);
}
</style>
