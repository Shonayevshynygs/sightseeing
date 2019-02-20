package edu.nazarbayev.raushan.sightseeing.model;

import javax.persistence.*;
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
}
