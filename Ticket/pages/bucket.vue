<template>
  <div class="main">
    <c-header />
    <div class="bucket">
      <div class="bucket__list__block">
        <div v-for="place in tickets" :key="place.id" class="bucket__list">
          {{ place.name }} - {{ place.info }}
        </div>
      </div>
      <div v-if="Object.keys(tickets).length !== 0" class="bucket__buy">
        <div class="bucket__buy__block">
          <div v-for="(place, index) in tickets" :key="place.id" class="bucket__buy__block__list">
            <p>{{ place.name }}</p>
            <p>{{ price[index].price }}</p>
          </div>
          <div class="bucket__buy__block__list total">
            <p>Total:</p>
            <p>1200 ₸</p>
          </div>
          <div class="bucket__buy__block__payment">
            <div class="attention">
              <strong>Attention:</strong>
              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ab tenetur voluptatem aperiam molestias dolores, magni fugit sunt. Voluptatibus, esse fugiat?</p>
            </div>
            <button class="bucket__buy__block__button">
              Pay 1200 ₸
            </button>
          </div>
        </div>
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
    tickets() {
      return this.$store.state.places.tickets;
    },
    price() {
      return this.$store.state.places.price;
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
.bucket {
  display: flex;
  height: 100vh;
}
.bucket__list {
  border-bottom: 1px solid #cccccc;
  padding: 20px 40px;
}
.bucket__list__block {
  height: 100%;
  width: 40%;
  display: flex;
  flex-direction: column;
}
.bucket__buy {
  width: 60%;
  border-left: 1px solid #cccccc;
  padding: 20px 80px;
  display: flex;
  align-items: center;
}
.bucket__buy__block {
  display: flex;
  flex-direction: column;
  width: 100%;
}
.bucket__buy__block__list {
  margin: 10px 0px;
  border-bottom: 2px dotted #cccccc;
  display: flex;
  justify-content: space-between;
}
.bucket__buy__block__list p {
  background: #f9f9f9;
  margin-bottom: -5px;
}
.total {
  margin: 40px 0px;
}
.attention {
  width: 60%;
}
.bucket__buy__block__payment {
  display: flex;
  justify-content: space-between;
  align-self: flex-end;
}
.bucket__buy__block__button {
  font-family: "Lato-Light";
  cursor: pointer;
  border: none;
  margin: 25px 0px;
  font-size: 20px;
  color: white;
  width: 160px;
  height: 45px;
  border-radius: 10px;
  background-color: #2f6adf;
  text-align: center;
  outline: none;
  box-shadow: 0 5px 25px 0 rgba(0, 0, 0, 0.15);
}
.bucket__buy__block__button:hover {
  box-shadow: 0 10px 25px 0 rgba(0, 0, 0, 0.3);
}
.bucket__buy__block__button:focus {
  box-shadow: 0 10px 25px 0 rgba(0, 0, 0, 0.5);
}
</style>
