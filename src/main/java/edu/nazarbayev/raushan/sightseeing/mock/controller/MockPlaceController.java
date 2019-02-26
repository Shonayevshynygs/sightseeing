package edu.nazarbayev.raushan.sightseeing.mock.controller;

import edu.nazarbayev.raushan.sightseeing.model.Bucket;
import edu.nazarbayev.raushan.sightseeing.model.Coordinates;
import edu.nazarbayev.raushan.sightseeing.model.Place;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MockPlaceController implements CrudHandler  {
    public static List<Place> collection = new ArrayList<>();

    static {
        Place place1 = new Place(1,"Shymbulak", new Coordinates(76.45, 23.43), "Ski resort");
        Place place2 = new Place(2,"Medeo", new Coordinates(76.45, 23.43), "Skating place");
        Place place3 = new Place(3,"Zoo", new Coordinates(76.45, 23.43), "Animals and stuff");

        collection.add(place1);
        collection.add(place2);
        collection.add(place3);
    }

    @Override
    public void create(@NotNull Context context) {
        Place bucket = context.bodyAsClass(Place.class);
        collection.add(bucket);
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
        Place client = context.bodyAsClass(Place.class);
        collection.remove(index);
        collection.add(index, client);
        context.json(collection.get(index));
    }
}
