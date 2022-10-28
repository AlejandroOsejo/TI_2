package model;

public class Country implements Comparable<Country> {
    private String id; //UUID
    private String name;
    private long population;
    private String countryCode;



    private Country right;
    private Country left;

    // Constructor
    public Country(String id, String name, long population, String countryCode) {
        this.id = id; // 6ec3e8ec-3dd0-11ed-b878-0242ac120002
        this.name = name; // Colombia
        this.population = population; // 50.2
        this.countryCode = countryCode; // +57
    }


    //Getter n Setter
    public Country getRight() {return right;}
    public void setRight(Country right) {this.right = right;}

    public Country getLeft() {return left;}
    public void setLeft(Country left) {this.left = left;}

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public long getPopulation() {return population;}
    public void setPopulation(long population) {this.population = population;}

    public String getCountryCode() {return countryCode;}
    public void setCountryCode(String countryCode) {this.countryCode = countryCode;}


    @Override
    public int compareTo(Country o) {
        if (this.getPopulation() > o.getPopulation()){
            return 1;
        } else {
            return -1;
        }
    }
}
