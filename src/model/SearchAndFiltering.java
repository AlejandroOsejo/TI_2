package model;

import ui.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchAndFiltering {
    Insert insert = new Insert();

    public void filter(int search){
        int filter;

        switch (search){
            case 1:
                System.out.println("Has seleccionado paises");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de paises");
                filter = Main.sc.nextInt();

                filterCountries(filter);
                break;

            case 2:
                System.out.println("Has seleccionado ciudades");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de ciudades");
                filter = Main.sc.nextInt();

                filterCities(filter, insert.cities);
                break;

            default:
                System.out.println("Ingrese un número válido");
        }
    }

    public int filterCountries(int requesPopulation){
        Country comparePopulation = new Country("", "", requesPopulation, "");
        //traer la lista --> también crear una lista temp para guardar los datos de la póblacion y repartirlos
        //buscar pais por poblacion

        Comparator<Country> p1 = new Insert();
        Collections.sort(insert.listGsonCountry, p1);//Organizados por poblacion

        //Se necesita hallar a un pais por su poblacion
        int left = 0;
        int right = insert.listGsonCountry.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (insert.listGsonCountry.get(mid).getPopulation()> requesPopulation){
                right = mid - 1;
            } else if (comparePopulation.compareTo(insert.listGsonCountry.get(mid))) { // Debe ser una lista de numeros porque lo esta preguntando por un numero exacto
                left = mid + 1;
            } else {
                return mid;
            }
            return -1;
        }

        return left;
    }

    public void filterCities(int requesPopulation, ArrayList<City> cities){

    }


}
