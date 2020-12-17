package nl.novi.dpcc.builder.domain;

public class HouseBuilder {

    private String streetName;
    private int houseNumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public HouseBuilder(String streetName, int houseNumber, String houseNumberAddition, String postalCode){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilder(){

    }

    public HouseBuilder withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilder withHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public HouseBuilder withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilder withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilder withProvince(String province){
        this.province = province;
        return this;
    }

    public HouseBuilder withHasGarden(Boolean hasGarden){
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(streetName, houseNumber, houseNumberAddition, postalCode, province, hasGarden);
    }

    public House buildWithEmptyCheck() {
        if (streetName == null || houseNumber == 0 ||postalCode == null){
            throw new RuntimeException("Please fill in the required information");
        } else
            return new House(streetName, houseNumber, houseNumberAddition, postalCode, province, hasGarden);
    }



}
