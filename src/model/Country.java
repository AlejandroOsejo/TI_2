package model;

public class Country {
    private String id; //UUID
    private String name;
    private int population;
    private String countryCode;

    // Constructor
    public Country(String id) {
        this.id = id; // 6ec3e8ec-3dd0-11ed-b878-0242ac120002
        this.name = name; // Colombia
        this.population = population; // 50.2
        this.countryCode = countryCode; // +57
    }

    //Getter n Setter
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getPopulation() {return population;}
    public void setPopulation(int population) {this.population = population;}

    public String getCountryCode() {return countryCode;}
    public void setCountryCode(String countryCode) {this.countryCode = countryCode;}
}
