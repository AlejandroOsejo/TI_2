package model;

public class City{
    private String idCountry;
    private String idCity; // UUID
    private String nameCity;
    private int populationCity;

    // Constructor
    public City(String idCity,String nameCity, String idCountry,  int populationCity) {
        this.idCountry = idCountry;
        this.idCity = idCity; // UUID
        this.nameCity = nameCity;
        this.populationCity = populationCity;
    }

    //Getter n Setter
    public String getIdCountry(){return idCountry;}
    public void setIdCountry(String idCountry) {this.idCountry = idCountry;}

    public String getIdCity() {return idCity;}
    public void setIdCity(String idCity) {this.idCity = idCity;}

    public String getNameCity() {return nameCity;}
    public void setNameCity(String nameCity) {this.nameCity = nameCity;}

    public int getPopulationCity() {return populationCity;}
    public void setPopulationCity(int populationCity) {this.populationCity = populationCity;}
}
