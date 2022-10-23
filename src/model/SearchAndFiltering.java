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

    public void filterCountries(int requesPopulation){
        //traer la lista --> también crear una lista temp para guardar los datos de la póblacion y repartirlos
        //buscar pais por poblacion

        Comparator<Country> p1 = new Insert();
        Collections.sort(insert.countries, p1);//Organizados por poblacion

        //Se necesita hallar a un pais por su poblacion
        ArrayList<Long> temp = new ArrayList<>();
        for (int i=0; i>insert.countries.size(); i++){
            temp = insert.countries
        }

        int left = 0;
        int right = insert.countries.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (insert.countries.get(mid)> requesPopulation){

            }
        }

    }

    public void filterCities(int requesPopulation, ArrayList<City> cities){

    }


}
