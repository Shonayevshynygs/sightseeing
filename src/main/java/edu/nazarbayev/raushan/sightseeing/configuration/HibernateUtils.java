package edu.nazarbayev.raushan.sightseeing.configuration;

import edu.nazarbayev.raushan.sightseeing.model.Bucket;
import edu.nazarbayev.raushan.sightseeing.model.Client;
import edu.nazarbayev.raushan.sightseeing.model.Place;
import edu.nazarbayev.raushan.sightseeing.model.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    static {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        MetadataSources sources = new MetadataSources(registry);

        sources.addAnnotatedClass(Bucket.class);
        sources.addAnnotatedClass(Client.class);
        sources.addAnnotatedClass(Place.class);
        sources.addAnnotatedClass(Ticket.class);
//        sources.addAnnotatedClass()
//        sources.addResource("resoursces/hibernate.cfg.xml");

        Metadata metadata = sources.buildMetadata();
        sessionFactory = metadata.buildSessionFactory();
    }

    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static void closeFactroy() {
        sessionFactory.close();
    }


    private HibernateUtils() {}
}
