package model;

public class City extends Country{
    private String idCity; // UUID
    private String nameCity;
    private int populationCity;

    // Constructor
    public City(String id) {
        super(id); // Country ID UUID
        this.idCity = idCity; // UUID
        this.nameCity = nameCity;
        this.populationCity = populationCity;
    }

    //Getter n Setter

    public String getIdCity() {return idCity;}
    public void setIdCity(String idCity) {this.idCity = idCity;}

    public String getNameCity() {return nameCity;}
    public void setNameCity(String nameCity) {this.nameCity = nameCity;}

    public int getPopulationCity() {return populationCity;}
    public void setPopulationCity(int populationCity) {this.populationCity = populationCity;}
}
