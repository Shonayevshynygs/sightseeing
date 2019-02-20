package edu.nazarbayev.raushan.sightseeing.controller;

import edu.nazarbayev.raushan.sightseeing.configuration.HibernateUtils;
import edu.nazarbayev.raushan.sightseeing.model.Bucket;
import edu.nazarbayev.raushan.sightseeing.model.Client;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BucketController implements CrudHandler {
    Class<?> clazz = Bucket.class;
    @Override
    public void create(@NotNull Context context) {
        Bucket bucket = context.bodyAsClass(Bucket.class);
        UniversalDAO.persist(bucket);
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {
        long id = Long.valueOf(s);
        UniversalDAO.deleteById(id, clazz);
        context.status(204);
    }

    @Override
    public void getAll(@NotNull Context context) {
        String hql = "FROM edu.nazarbayev.raushan.sightseeing.model.Bucket";
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
        String hql = "FROM edu.nazarbayev.raushan.sightseeing.model.Bucket s where s.id = :id";
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
