package edu.nazarbayev.raushan.sightseeing.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Embedded
    private Coordinates coordinates;

    @Column(name = "info", nullable = true)
    private String info;

//    public Ticket getTicket() {
//        return ticket;
//    }
//
//    public void setTicket(Ticket ticket) {
//        this.ticket = ticket;
//    }
//
//    @OneToOne(mappedBy = "place")
//    private Ticket ticket;

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return id == place.id &&
                Objects.equals(name, place.name) &&
                Objects.equals(coordinates, place.coordinates) &&
                Objects.equals(info, place.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, info);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getInfo() {
        return info;
    }

    public Place() {
    }

    public Place(String name, Coordinates coordinates, String info) {
        this.name = name;
        this.coordinates = coordinates;
        this.info = info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
