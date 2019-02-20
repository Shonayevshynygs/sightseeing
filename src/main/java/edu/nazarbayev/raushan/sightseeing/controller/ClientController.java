package edu.nazarbayev.raushan.sightseeing.controller;

import edu.nazarbayev.raushan.sightseeing.configuration.HibernateUtils;
import edu.nazarbayev.raushan.sightseeing.model.Client;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ClientController implements CrudHandler {
    private Class clazz = Client.class;

    @Override
    public void create(@NotNull Context context) {
        Client client = context.bodyAsClass(Client.class);
        UniversalDAO.persist(client);
        context.status(201);
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {
        long id = Long.valueOf(s);
        UniversalDAO.deleteById(id, clazz);
        context.status(204);
    }

    @Override
    public void getAll(@NotNull Context context) {
        String hql = "FROM edu.nazarbayev.raushan.sightseeing.model.Client";
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
        String hql = "FROM edu.nazarbayev.raushan.sightseeing.model.Client s where s.id = :id";
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
