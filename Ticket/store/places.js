export const state = () => ({
  places: null,
  tickets: [],
  price: {}
});

export const mutations = {
  LOAD_PLACES: (state, places) => {
    state.places = places;
  },
  SET_TICKET: (state, tickets) => {
    state.tickets.push(tickets);
  },
  LOAD_PRICE: (state, price) => {
    state.price = price;
  }
};

export const actions = {
  loadPlaces({ commit, state }) {
    return this.$axios.get("http://localhost:6789/places").then(response => {
      const data = response.data;
      return commit("LOAD_PLACES", data);
    });
  },
  loadPrice({ commit }) {
    return this.$axios.get("http://localhost:6789/tickets").then(response => {
      return commit("LOAD_PRICE", response.data);
    });
  }
  // loadTickets({ commit }, data) {
  //   return this.$axios
  //     .post("http://localhost:6789/tickets", data)
  //     .then(response => {
  //       console.log(response);
  //       return commit("SET_TICKET", response.data);
  //     });
  // }
};
