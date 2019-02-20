package edu.nazarbayev.raushan.sightseeing.controller;

import edu.nazarbayev.raushan.sightseeing.configuration.HibernateUtils;
import edu.nazarbayev.raushan.sightseeing.model.Client;
import edu.nazarbayev.raushan.sightseeing.model.Place;
import edu.nazarbayev.raushan.sightseeing.model.Ticket;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TicketController implements CrudHandler {
    private Class<?> clazz = Ticket.class;

    @Override
    public void create(@NotNull Context context) {
        Ticket ticket = context.bodyAsClass(Ticket.class);
        UniversalDAO.persist(ticket);
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {
        long id = Long.valueOf(s);
        UniversalDAO.deleteById(id, clazz);
        context.status(204);
    }

    @Override
    public void getAll(@NotNull Context context) {
        String hql = "FROM edu.nazarbayev.raushan.sightseeing.model.Ticket";
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        List<Client> clientList = session.createQuery(hql).list();
        context.json(clientList);

        transaction.commit();
        session.close();
    }

    @Override
    public void getOne(@NotNull Context context, @NotNull String s) {
        long id = Long.valueOf(s);
        String hql = "FROM edu.nazarbayev.raushan.sightseeing.model.Ticket s where s.id = :id";
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = (Client) session.createQuery(hql).setParameter("id", id).getSingleResult();
        context.json(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(@NotNull Context context, @NotNull String s) {
        long id = Long.valueOf(s);
        Client newClient = context.bodyAsClass(Client.class);
        newClient.setId(id);
        UniversalDAO.update(newClient);
    }
}
