package edu.nazarbayev.raushan.sightseeing.mock;

import edu.nazarbayev.raushan.sightseeing.mock.controller.MockBucketController;
import edu.nazarbayev.raushan.sightseeing.mock.controller.MockClientController;
import edu.nazarbayev.raushan.sightseeing.mock.controller.MockPlaceController;
import edu.nazarbayev.raushan.sightseeing.mock.controller.MockTicketController;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.crud;

public class MockAPI {
    public static void main(String[] args) {
        Javalin app = Javalin.create()
                .enableDebugLogging()
                .port(6789);

        app.routes(() -> {
            crud("/tickets/:id", new MockTicketController());
            crud("/clients/:id", new MockClientController());
            crud("/buckets/:id", new MockBucketController());
            crud("/places/:id", new MockPlaceController());
        });

        app.start();
    }
}