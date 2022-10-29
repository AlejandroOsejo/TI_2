package model;

public class City implements Comparable <City>{
    private String idCountry;
    private String idCity; // UUID
    private String nameCity;
    private long populationCity;

    private City right;
    private City left;

    // Constructor
    public City(String idCity,String nameCity, String idCountry,  long populationCity) {
        this.idCountry = idCountry;
        this.idCity = idCity; // UUID
        this.nameCity = nameCity;
        this.populationCity = populationCity;
    }

    //Getter n Setter
    public City getRight() {return right;}
    public void setRight(City right) {this.right = right;}

    public City getLeft() {return left;}
    public void setLeft(City left) {this.left = left;}

    public String getIdCountry(){return idCountry;}
    public void setIdCountry(String idCountry) {this.idCountry = idCountry;}

    public String getIdCity() {return idCity;}
    public void setIdCity(String idCity) {this.idCity = idCity;}

    public String getNameCity() {return nameCity;}
    public void setNameCity(String nameCity) {this.nameCity = nameCity;}

    public long getPopulationCity() {return populationCity;}
    public void setPopulationCity(long populationCity) {this.populationCity = populationCity;}

    @Override
    public int compareTo(City o) {
        if (this.getPopulationCity() > o.getPopulationCity()){
            return 1;
        } else {
            return -1;
        }
    }
}
