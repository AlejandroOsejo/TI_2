package model;

import ui.Main;

import java.util.ArrayList;

public class SearchAndFiltering {
    Insert insert = new Insert();

    public void filter(int i){
        int filter;
        String search;

        switch (i){
            case 1:
                System.out.println("Has seleccionado filtrar paises");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de paises");
                filter = Main.sc.nextInt();

                filterCountries(filter);
                break;

            case 2:
                System.out.println("Has seleccionado filtrar ciudades");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de ciudades");
                filter = Main.sc.nextInt();

                filterCities(filter);
                break;

            case 3:
                System.out.println("Has seleccionado buscar paises");
                System.out.println("Ingrese el nombre que desea buscar dentro de la lista de paises");
                search = Main.sc.next();

                String index = searchCountryByName(insert.countries,search);
                System.out.println(index);
                break;
            case 4:
                System.out.println("Has seleccionado buscar ciudades");
                System.out.println("Ingrese el nombre que desea buscar dentro de la lista de ciudades");
                search = Main.sc.next();

                String index2 = searchCityByName(insert.cities,search);
                System.out.println(index2);
                break;


            default:
                System.out.println("Ingrese un número válido");
        }
    }


    public int filterCountries(int requesPopulation){
        //traer la lista --> también crear una lista temp para guardar los datos de la póblacion y repartirlos
        //buscar pais por poblacion



        //Se necesita hallar a un pais por su poblacion
        int left = 0;
        int right = insert.countries.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (insert.countries.get(mid).getPopulation() < requesPopulation){
                right = mid - 1;
            } else if (requesPopulation > insert.countries.get(mid).getPopulation()) { // Debe ser una lista de numeros porque lo esta preguntando por un numero exacto
                left = mid + 1;
            } else {
                return mid;
            }
            return -1;
        }

        return left;
    }

    public int filterCities(int requesPopulation){

        //Se necesita hallar a un pais por su poblacion
        int left = 0;
        int right = insert.cities.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (insert.cities.get(mid).getPopulationCity() > requesPopulation){
                right = mid - 1;
            } else if (requesPopulation > insert.cities.get(mid).getPopulationCity()) { // Debe ser una lista de numeros porque lo esta preguntando por un numero exacto
                left = mid + 1;
            } else {
                return mid;
            }
            return -1;
        }

        return left;
    }

    static public String searchCountryByName (ArrayList<Country> temp,String wantedCountry ){

        int left = 0;
        int right = temp.size() - 1;
        String message = "";
        while(left <= right) {
            int mid = (left + right) / 2;
            String wantedCountrymid = String.valueOf(temp.get(mid).getName());
            if (wantedCountry.compareTo(wantedCountrymid)<0) {
                right = mid - 1;
            } else if (wantedCountry.compareTo(wantedCountrymid)>0) {
                left = mid + 1;
            } else {

                message = "El nombre del pais si se encuentra en la lista de pises "+wantedCountry;

                return message;
            }

        }
        message ="El nombre del pais que busca " + wantedCountry+" no se encontró";
        return message;
    }

    static public String searchCityByName (ArrayList<City> temp,String wantedCity ){
        String message = "";
        int left = 0;
        int right = temp.size() - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            String wantedCityymid = String.valueOf(temp.get(mid).getNameCity());
            if (wantedCity.compareTo(wantedCityymid)<0) {
                right = mid - 1;
            } else if (wantedCity.compareTo(wantedCityymid)>0) {
                left = mid + 1;
            } else {
                message = "El nombre de la ciudad si se encuentra en la lista de pises " +wantedCity;
                return message;
            }

        }
        message = "El nombre de la ciudad que busca " + wantedCity+" no se encontró";
        return message;
    }

}
