package model;

import ui.Main;

import java.util.ArrayList;

public class Remove {
    Insert insert = new Insert();
    public void countryOrCity(int cc){
        String name;
        switch (cc){
            case 1:
                System.out.println("Has seleccionado eliminar un registro de paises");
                System.out.println("Ingrese el nombre del pais que quiere eliminar");
                name = Main.sc.nextLine();

                deleteCountry(name);
                break;

            case 2:
                System.out.println("Has seleccionado eliminar un registro de ciudades");
                System.out.println("Ingrese el nombre de la ciudad que quiere eliminar");
                name = Main.sc.nextLine();

                deleteCity(name);
                break;

            default:
                System.out.println("Ingrese un número válido");
        }
    }

    public void deleteCountry(String name){
        //Debe recibir la lista de paises
        //eliminar un pais por el nombre
        ArrayList<Country> temp = new ArrayList<>();

        ArrayList<Country> country = new ArrayList<>();
        for (Country c :temp){
            country.add((Country)c);
        }
        insert.countries.remove(country);
        return;

    }

    public void deleteCity(String name){
        //DEbe recibir la lista de ciudades
        //eliminar una ciudad ´por el nombre
        ArrayList<City> temp = new ArrayList<>();

        ArrayList<City> city = new ArrayList<>();
        for (City c :temp){
            city.add((City)c);
        }
        insert.cities.remove(city);
        return;
    }
}
