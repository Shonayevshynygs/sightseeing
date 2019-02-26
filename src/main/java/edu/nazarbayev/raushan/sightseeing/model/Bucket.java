package edu.nazarbayev.raushan.sightseeing.model;

import edu.nazarbayev.raushan.sightseeing.mock.controller.MockPlaceController;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "buckets")
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "bucket")
    private List<Ticket> tickets;

//    @OneToOne(mappedBy = "bucket")
//    private Client client;
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Bucket() {
    }

    public Bucket(long id) {
        //mock bucket
        this.id = id;

        List<Ticket> tickets = new ArrayList<>();
        Ticket ticket1 = new Ticket(1, MockPlaceController.collection.get(0), 300);
        Ticket ticket2 = new Ticket(2,MockPlaceController.collection.get(1), 400);
        Ticket ticket3 = new Ticket(3,MockPlaceController.collection.get(2), 500);

        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);

        this.tickets = tickets;
    }
}
