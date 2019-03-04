<template>
  <div>
    <div class="header">
      <div class="header__nav">
        <div class="header__nav_page">
          <nuxt-link class="nuxt" to="/">
            <p>
              Main
            </p>
          </nuxt-link>
        </div>
        <div class="header__nav_page">
          <nuxt-link class="nuxt" to="/Places">
            <p>
              Places
            </p>
          </nuxt-link>
        </div>
        <div class="header__nav_page">
          <nuxt-link class="nuxt" to="/about">
            <p>
              About
            </p>
          </nuxt-link>
        </div>
      </div>
      <div class="header__icons">
        <nuxt-link class="nuxt" to="/bucket">
          <img src="~static/icons/shopping-cart.svg" alt="shopping-cart">
        </nuxt-link>
        <img src="~static/icons/avatar.svg" alt="user" @click="showModal = true">
      </div>
    </div>
    <div v-if="showModal" class="modal">
      <div class="modal__wrapper">
        <div class="modal__wrapper-container">
          <div class="modal__wrapper-container__tab">
            <h3 class="login" :class="{active: login}" @click="log()">
              Log In
            </h3>
            <h3 class="signup" :class="{active: signup}" @click="sign()">
              Sign Up
            </h3>
          </div>
          <div v-if="signup" class="modal__wrapper-container__log">
            <input v-model="name" type="text" class="modal-input" placeholder="Full Name">
            <input v-model="email" type="text" class="modal-input" placeholder="Your Email">
            <input v-model="password" type="text" class="modal-input" placeholder="Password">
            <button class="modal-button">
              Sign Up
            </button>
          </div>
          <div v-if="login" class="modal__wrapper-container__log">
            <input v-model="email" type="text" class="modal-input" placeholder="Your Email">
            <input v-model="password" type="text" class="modal-input" placeholder="Password">
            <button class="modal-button">
              Log In
            </button>
          </div>
          <div @click="showModal = false">
            <img class="close" src="~static/icons/clean_icon_black.svg" alt="close">
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      showModal: false,
      name: "",
      email: "",
      password: null,
      login: true,
      signup: false
    };
  },
  methods: {
    sign() {
      this.login = false;
      this.signup = true;
    },
    log() {
      this.signup = false;
      this.login = true;
    }
  }
  // mounted() {
  //   this.$axios.get("http://localhost:6789/tickets").then(response => {
  //     console.log(response)
  //   })
  // }
};
</script>

<style scoped>
.header {
  padding: 40px 60px;
  height: 40px;
  background: #2f6adf;
  display: flex;
  justify-content: space-between;
  align-items: center;
  box-shadow: 0px 2px 21px rgba(0, 0, 0, 0.4);
}
.header__nav {
  display: flex;
  justify-content: space-between;
  width: 20%;
}
.header__nav_page p {
  padding: 0px 10px;
  font-size: 24px;
  font-weight: 200;
  cursor: pointer;
  color: white;
}
.header__nav_page p:hover {
  opacity: 0.5;
  transition: opacity 0.5s ease-out;
}
.header__icons {
  display: flex;
  justify-content: space-between;
  width: 10%;
}
.header__icons img {
  margin: 0px 10px;
  height: 32px;
  width: 32px;
  cursor: pointer;
}
.header__icons img:hover {
  opacity: 0.5;
  transition: opacity 0.5s ease-out;
}
.modal {
  position: fixed;
  z-index: 10;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.5);
  display: table;
  transition: opacity 0.3s ease;
  overflow: auto;
}
.modal__wrapper {
  display: table-cell;
  vertical-align: middle;
}
.modal__wrapper-container {
  position: relative;
  width: 650px;
  margin: 0px auto;
  background-color: #f9f9f9;
  border-radius: 10px;
  border: 1px solid #efefef;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.33);
  transition: all 0.3s ease;
}
.close {
  height: 24px;
  width: 24px;
  cursor: pointer;
  position: absolute;
  right: 0%;
  top: -12%;
}
.close:hover {
  opacity: 0.5;
}
.modal__wrapper-container__tab {
  display: flex;
  justify-content: space-around;
  background-color: #efefef;
  border-radius: 10px 10px 0px 0px;
  margin-bottom: 20px;
}
.login {
  border-width: 0px 0px 1px 0px;
  border-style: solid;
  border-color: #3faf7f;
  width: 50%;
  text-align: center;
  padding: 10px;
  cursor: pointer;
  font-weight: 300;
}
.signup {
  border-width: 0px 0px 1px 1px;
  border-style: solid;
  border-color: #3faf7f;
  width: 50%;
  text-align: center;
  padding: 10px;
  cursor: pointer;
  font-weight: 300;
}
.active {
  border-bottom: 2px solid #3faf7f;
  box-shadow: 0px 2px 10px 0px rgba(0, 0, 0, 0.8);
}
.modal__wrapper-container__log {
  padding: 20px;
  display: flex;
  flex-direction: column;
  align-items: center;
}
.modal__wrapper-container__log input {
  background-color: #f9f9f9;
}
.modal-input {
  width: 60%;
  margin: 5px 5px 30px 5px;
  border: none;
  border-bottom: 1px solid #dddddd;
  outline: none;
}
.modal-input:focus {
  border-bottom: 1px solid #2f6adf;
}
.modal-input[type="text"] {
  font-size: 18px;
  font-family: "Lato-Light";
  text-align: center;
  color: #666666;
  padding: 15px 5px 15px 5px;
}
.modal-input[type="email"] {
  font-size: 14px;
  text-align: center;
  color: #666666;
  padding: 15px 5px 15px 5px;
}
::placeholder {
  color: #aaa;
}
::-ms-input-placeholder {
  color: #aaaaaa;
}
.modal-button {
  font-family: "Lato-Light";
  cursor: pointer;
  border: none;
  margin: 25px 0px;
  font-size: 20px;
  color: white;
  width: 60%;
  height: 39px;
  border-radius: 10px;
  background-color: #2f6adf;
  text-align: center;
  outline: none;
  box-shadow: 0 5px 25px 0 rgba(0, 0, 0, 0.15);
}
.modal-button:hover {
  box-shadow: 0 10px 25px 0 rgba(0, 0, 0, 0.4);
}
.modal-button:focus {
  box-shadow: 0 10px 25px 0 rgba(0, 0, 0, 0.8);
}
</style>
