package model;

import ui.Main;

import java.util.ArrayList;
import java.util.Collections;

public class SearchAndFiltering {
    Insert insert = new Insert();

    public void filter(int search){
        int filter;

        switch (search){
            case 1:
                System.out.println("Has seleccionado paises");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de paises");
                filter = Main.sc.nextInt();

                filterCountries(filter, insert.countries);
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

    public int filterCountries(int requesPopulation, ArrayList<Country> countries){
        ArrayList<Country> temp = new ArrayList<>();

        int left = 0;
        int right = countries.size() - 1;

        for (Country c : temp){

        }

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (countries.get(mid) > requesPopulation){

            }
        }
        return -1;
    }

    public void filterCities(int requesPopulation, ArrayList<City> cities){

    }
}
