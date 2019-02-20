package edu.nazarbayev.raushan.sightseeing.mock.controller;

import edu.nazarbayev.raushan.sightseeing.model.Bucket;
import edu.nazarbayev.raushan.sightseeing.model.Client;
import edu.nazarbayev.raushan.sightseeing.model.Coordinates;
import edu.nazarbayev.raushan.sightseeing.model.Place;
import io.javalin.Context;
import io.javalin.apibuilder.CrudHandler;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MockBucketController implements CrudHandler {
    public static List<Bucket> collection = new ArrayList<>();

    static {
        Bucket bucket1 = new Bucket();
        Bucket bucket2 = new Bucket();
        Bucket bucket3 = new Bucket();

        collection.add(bucket1);
        collection.add(bucket2);
        collection.add(bucket3);
    }

    @Override
    public void create(@NotNull Context context) {
        Bucket bucket = context.bodyAsClass(Bucket.class);
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
        Bucket client = context.bodyAsClass(Bucket.class);
        collection.remove(index);
        collection.add(index, client);
        context.json(collection.get(index));
    }
}
