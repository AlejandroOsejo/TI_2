package model;

import ui.Main;

import java.util.ArrayList;

public class Remove {
    Insert insert = new Insert();
    public void countryOrCity(int cc){
        String name;
        int population;
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
            case 3:
                System.out.println("Has seleccionado eliminar paises por su poblacion");
                System.out.println("Ingrese el minimo de poplacion  que debe tener un pais para no ser eliminado");
                population = Main.sc.nextInt();

                filterDelateCountries(population);
                break;
            case 4:
                System.out.println("Has seleccionado eliminar ciudades por su poblacion");
                System.out.println("Ingrese el minimo de poplacion  que debe tener una ciudad para no ser eliminada");
                population = Main.sc.nextInt();

                filterDelateCities(population);
            default:
                System.out.println("Ingrese un número válido");
        }
    }

    public void deleteCountry(String remoCountries){
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

    public void deleteCity(String remoCities){
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

    public void filterDelateCountries(int requesPopulation){
        ArrayList<Country> temp = new ArrayList<>();
        for (int i = 0; i < insert.countries.size(); i++) {
            if (insert.countries.get(i).getPopulation() > requesPopulation) {
                temp.add(insert.countries.get(i));
            }
        }
        insert.countries = temp;
    }

    public void filterDelateCities(int requesPopulation){
        ArrayList<City> temp = new ArrayList<>();
        for (int i = 0; i < insert.cities.size(); i++) {
            if (insert.cities.get(i).getPopulationCity() > requesPopulation) {
                temp.add(insert.cities.get(i));
            }
        }
        insert.cities = temp;
    }
}
