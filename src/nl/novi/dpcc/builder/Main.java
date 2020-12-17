package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.House;
import nl.novi.dpcc.builder.domain.HouseBuilder;

public class Main {

    public static void main(String[] args) {

        House huis1 = new House("Kerkstraat",
                1,
                "",
                "1234AD",
                "Utrecht",
                true);

        House huis2 = new HouseBuilder()
                .withStreetName("Janloop")
                .withHouseNumber(12)
                .withHouseNumberAddition("")
                .withPostalCode("1234DC")
                .withProvince("Limburg")
                .withHasGarden(false)
                .build();

        House huis3 = new HouseBuilder("Koperstraat", 12, "", "4567KL")
                .withStreetName("Koperstraat")
                .withHouseNumber(13)
                .withHouseNumberAddition("")
                .withPostalCode("4567KL")
                .withProvince("Limburg")
                .withHasGarden(false)
                .build();

        House huis4 = new HouseBuilder()
                .withStreetName("Koperstraat")
                .withHouseNumber(13)
                .withHouseNumberAddition("")
                .withPostalCode("4567KL")
                .withProvince("Limburg")
                .withHasGarden(false)
                .buildWithEmptyCheck();

        System.out.println(huis1);
        System.out.println(huis2);
        System.out.println(huis3);
        System.out.println(huis4);

    }
}
