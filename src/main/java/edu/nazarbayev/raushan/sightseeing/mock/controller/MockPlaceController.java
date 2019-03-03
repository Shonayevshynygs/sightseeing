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
        Place place1 = new Place(1,"Shymbulak", new Coordinates(76.45, 23.43), "Ski resort",
                "The largest ski resort in Central Asia. It is located in the upper part of the Medeu Valley\n" +
                        "in the Zaiilisky Alatau mountain range, at an elevation of 2,200 metres (7,200 ft) above sea level. The\n" +
                        "resort area is about 25 kilometres (16 mi) south of Almaty city by Medeo road. It is popular for its mild\n" +
                        "climate, large quantity of sunny days and great amount of snow through the winter. The ski season lasts\n" +
                        "from November to April.");
        Place place2 = new Place(2,"Medeo", new Coordinates(76.45, 23.43), "Skating place",
                "A picturesque valley located 15 km above Almaty. Besides beautiful nature there are some\n" +
                        "other attractions to see in Almaty, one of which is the world&#39;s largest speed skating rink known as Medeo.\n" +
                        "Soft climate in the gorge, optimal level of solar radiation, not high atmospheric pressure, gentle breeze\n" +
                        "and clean glacial water – all this provided high-mountain skating rink with wide popularity. Skating in\n" +
                        "days off during long years has already become a good tradition not only for city inhabitants but also for\n" +
                        "guests of Almaty.");
        Place place3 = new Place(3,"Zoo", new Coordinates(76.45, 23.43), "Animals and stuff",
                "Almaty Zoo covers an area of 21 hectares, and has, in its collection, examples of the\n" +
                        "unique and diverse wildlife of Kazakhstan, in particular, deer, wild ram, wolf, beaver, golden eagle, and\n" +
                        "others.The collection of animals also exibits animals from further afield including white and Himalayan\n" +
                        "bears, tigers, jaguars, Persian and Far Eastern leopards, elephants, zebras, markhor, American condors,\n" +
                        "vultures, horned crows, snakes, crocodiles. The total number of species is more than 350 and about 6,000\n" +
                        "different animals.The zoo is well attended and loved by the local people, particularly in holiday periods.");
        Place place4 = new Place(4,"Big Almaty Lake", new Coordinates(76.45, 23.43), "Lakes and Waterfalls",
                "Lake lies in a hollow like a gleaming mirror, surrounded on all sides by majestic\n" +
                        "peaks. Three main peaks tower above the lake and can be seen from the northern end of the dam: Sovetov\n" +
                        "(4,317 m) to the south-east, Ozyorny (4,110 m) to the south, further up the river valley, and the forested\n" +
                        "slopes of Turist (3,954 m) to the south-west. It considered as one of the most gorgeous places of the\n" +
                        "Almaty city.");
        Place place5 = new Place(5,"Kok-Tobe Hill", new Coordinates(76.45, 23.43), "City Attractions",
                "A popular tourist attraction in Almaty and also a favourite spot amongst locals. The\n" +
                        "small mountain-standing at 1130 meters above sea level and presiding 200 meters over the relative height\n" +
                        "of Almaty-is located on the southeast edge of Almaty. With its name translating to “Blue Hill”, a small\n" +
                        "amusement park, various monuments, a myriad of viewing platforms, and the Almaty TV Tower are just\n" +
                        "a few of the attractions at Kok-Tobe. There is a cable car to the top as well as a road for cars and foot\n" +
                        "traffic.");

        Place place6 = new Place(6,"Central State Museum of Kazakhstan", new Coordinates(76.45, 23.43), "Museums",
                "A reflection of the centuries-long history of Kazakhstan\n" +
                        "in tangible assets. It has a collection of unique archaeological findings from the pre-historic epoch up to\n" +
                        "present days. The richness of the museum includes exhibits since the times of the beginning of life on\n" +
                        "Earth and ending with the newest history. There are samples of the first tracks of the human life activity,\n" +
                        "fossils of the ancient plants and animals, evidence of tribal unions existence, intestine strives, emergence\n" +
                        "of urban civilization and its development kept here.");

        Place place7 = new Place(7,"Central State Museum of Kazakhstan", new Coordinates(76.45, 23.43), "Museums",
                "A reflection of the centuries-long history of Kazakhstan\n" +
                        "in tangible assets. It has a collection of unique archaeological findings from the pre-historic epoch up to\n" +
                        "present days. The richness of the museum includes exhibits since the times of the beginning of life on\n" +
                        "Earth and ending with the newest history. There are samples of the first tracks of the human life activity,\n" +
                        "fossils of the ancient plants and animals, evidence of tribal unions existence, intestine strives, emergence\n" +
                        "of urban civilization and its development kept here.");

        Place place8 = new Place(8,"Tabagan ski resort", new Coordinates(76.45, 23.43), "Ski resorts",
                "Here your head is spinning because of crystal air, you are dazzled because of\n" +
                        "the surrounding beauty and the heart starts beating more often because of the exciting adventures. In this\n" +
                        "place everyone will find the rest to his liking.You shall come here and admire the surrounding beauty.In\n" +
                        "winter – snow-white sparkling covering. In spring – many-colored carpet from motley and flowers. In\n" +
                        "summer – bright green and bee buzzing. In autumn – golden trees, red apples and leaves falling in the\n" +
                        "wind. Adventures and entertainments wait you all around. Be ready to receive impulse of vivacity, energy\n" +
                        "and good mood!");

        Place place9 = new Place(9,"Butakov Waterfall", new Coordinates(76.45, 23.43), "Lakes and Waterfalls",
                "Turgen Gorge in the Ili-Alatau National Park (90 km from Almaty) is an ideal\n" +
                        "place to enjoy the beauty of nature. The gorge has hot springs, a trout farm, waterfalls and thick forests.\n" +
                        "Rich in coniferous and mixed trees, alpine and sub-alpine meadows, lakes and springs, medicinal herbs\n" +
                        "and berries, the gorge plunges 44 km into the vast Assy plateau (2,560m). Long ago, caravans from\n" +
                        "Europe and Asia passed through the &quot;Royal Gates&quot; on their way to China and India. The broad valley\n" +
                        "stretches east for 60 km.");

        Place place10 = new Place(10,"First President’s Park", new Coordinates(76.45, 23.43), "Parks",
                "The Park is located in the southern part of Almaty and has a spectacular\n" +
                        "mountain backdrop. The park is the home of the annual music festival called “Almaty – my first love”.\n" +
                        "At the southern end of the park there is a viewing and seating area, with small shelters on raised mounds.\n" +
                        "There are no shops in the park, so you should take drinks etc. with you, particularly on hot days. Most of\n" +
                        "the tree planting is quite new, so little shelter against the sun when walking around the long curved\n" +
                        "pathways. Superb flower beds and plantings. No admission charge and entrance only through the\n" +
                        "colonnade at the north end of the park.");

        Place place11 = new Place(11,"Fantasy World Almaty", new Coordinates(76.45, 23.43), "Parks",
                "The park with the beautiful name &quot;Fantasy World&quot; was opened in 1997.\n" +
                        "A. Nazarbayev. In search of exciting new attractions. Adults can also relax in the park after work, visiting\n" +
                        "a coffee shop. Ticket price up to 90 cm free of charge, from 90 to 130 cm 2000 tenge, over 130 cm 3300\n" +
                        "tenge");
        collection.add(place1);
        collection.add(place2);
        collection.add(place3);
        collection.add(place4);
        collection.add(place5);
        collection.add(place6);
        collection.add(place8);
        collection.add(place9);
        collection.add(place10);
        collection.add(place11);
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
