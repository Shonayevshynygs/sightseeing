package edu.nazarbayev.raushan.sightseeing;

import edu.nazarbayev.raushan.sightseeing.controller.BucketController;
import edu.nazarbayev.raushan.sightseeing.controller.ClientController;
import edu.nazarbayev.raushan.sightseeing.controller.PlaceController;
import edu.nazarbayev.raushan.sightseeing.controller.TicketController;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.crud;

public class API {
    public static void main(String[] args) {
        Javalin app =  Javalin.create()
                .enableCorsForAllOrigins()
                .enableDebugLogging();

        app.routes(() -> {
            crud("/buckets/:id", new BucketController());
            crud("/clients/:id", new ClientController());
            crud("/places/:id", new PlaceController());
            crud("/tickets/:id", new TicketController());
        });

        app.start(6789);
    }
}
