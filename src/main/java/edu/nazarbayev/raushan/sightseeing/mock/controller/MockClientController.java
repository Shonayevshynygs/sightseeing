package edu.nazarbayev.raushan.sightseeing.mock.controller;

import edu.nazarbayev.raushan.sightseeing.model.Client;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MockClientController implements CrudHandler  {
    public static List<Client> collection = new ArrayList<>();

    static {
        Client client1 = new Client("Doe", "John", 2000, "johndoe@example.com", "password", MockBucketController.collection.get(0));
        Client client2 = new Client("Doe", "Jane", 3000, "janedoe@example.com", "password", MockBucketController.collection.get(1));
        Client client3 = new Client("Doe", "Johny", 4000, "johnydoe@example.com", "password", MockBucketController.collection.get(2));

        collection.add(client1);
        collection.add(client2);
        collection.add(client3);
    }

    @Override
    public void create(@NotNull Context context) {
        Client client = context.bodyAsClass(Client.class);
        collection.add(client);
        context.status(201);
    }

    @Override
    public void delete(@NotNull Context context, @NotNull String s) {
        int index = Integer.valueOf(s);
        collection.remove(index);
        context.status(204);
    }

    @Override
    public void getAll(@NotNull Context context) {
        context.json(collection);
    }

    @Override
    public void getOne(@NotNull Context context, @NotNull String s) {
        int index = Integer.valueOf(s);
        context.json(collection.get(index));
    }

    @Override
    public void update(@NotNull Context context, @NotNull String s) {
        int index = Integer.valueOf(s);
        Client client = context.bodyAsClass(Client.class);
        collection.remove(index);
        collection.add(index, client);
        context.json(collection.get(index));
    }
}
