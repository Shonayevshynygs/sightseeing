package edu.nazarbayev.raushan.sightseeing;

import edu.nazarbayev.raushan.sightseeing.model.Coordinates;
import edu.nazarbayev.raushan.sightseeing.configuration.HibernateUtils;
import edu.nazarbayev.raushan.sightseeing.model.Place;
import edu.nazarbayev.raushan.sightseeing.model.Ticket;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class DDLTest {

    @Test
    public void testDDL() {
        Place place = new Place();
        place.setId(0);
        place.setCoordinates(new Coordinates(74.34, 42.36));

        place.setInfo("Dumb shit");
        place.setName("Almaty");

        Ticket ticket = new Ticket();
        ticket.setId(0);
        ticket.setPlace(place);
        ticket.setPrice(2000);



        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(ticket);

        transaction.commit();
        session.close();
    }
}
