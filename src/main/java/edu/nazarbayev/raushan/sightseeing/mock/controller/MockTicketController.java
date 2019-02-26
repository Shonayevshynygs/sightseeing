package edu.nazarbayev.raushan.sightseeing.mock.controller;

import edu.nazarbayev.raushan.sightseeing.model.Place;
import edu.nazarbayev.raushan.sightseeing.model.Ticket;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MockTicketController implements CrudHandler {
    public static List<Ticket> collection = new ArrayList<>();

    static {
        Ticket ticket1 = new Ticket(1,MockPlaceController.collection.get(0), 300);
        Ticket ticket2 = new Ticket(2,MockPlaceController.collection.get(1), 400);
        Ticket ticket3 = new Ticket(3,MockPlaceController.collection.get(2), 500);

        collection.add(ticket1);
        collection.add(ticket2);
        collection.add(ticket3);
    }

    @Override
    public void create(@NotNull Context context) {
        Ticket ticket = context.bodyAsClass(Ticket.class);
        collection.add(ticket);
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
        Ticket client = context.bodyAsClass(Ticket.class);
        collection.remove(index);
        collection.add(index, client);
        context.json(collection.get(index));
    }
}
