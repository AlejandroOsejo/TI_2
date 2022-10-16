package model;

import ui.Main;

import java.util.UUID;

public class Insert {

    public void countryorCity(int option){
        switch (option){
            case 1://Pais
                System.out.println("Ingrese los siguientes datos ");
                System.out.println("ID del pais");
                String id = UUID.randomUUID().toString();
                System.out.println(id);
                System.out.println("Ingrese el nombre");
                String a = Main.sc.nextLine();
                String name = Main.sc.nextLine();
                System.out.println("Ingrese la poblacion");
                int population = Main.sc.nextInt();
                System.out.println("Ingrese el indicativo del pais");
                String b = Main.sc.nextLine();
                String countryCode = Main.sc.nextLine();
                Country country = new Country(id, name, population, countryCode);

                insertCountry(country);
                break;

            case 2://Ciudad
                System.out.println("Ingrese los siguientes datos de la ciudad");
                System.out.println("Ingrese los siguientes datos ");
                System.out.println("ID de la ciudad");
                String idCity = UUID.randomUUID().toString();
                System.out.println(idCity);
                System.out.println("Ingrese el nombre");
                String c = Main.sc.nextLine();
                String nameCity = Main.sc.nextLine();
                System.out.println("Ingrese la poblacion");
                int populationCity = Main.sc.nextInt();
                System.out.println("ID del pais que pertenece");
                String idCountry = UUID.randomUUID().toString();
                System.out.println(idCountry);
                City city = new City(idCity, nameCity, idCountry, populationCity);

                insertCity(city);
                break;

            default:
                System.out.println("DEBE DE SELECCIONAR QUE TIPO DE DATO VA A INGRESAR");
        }
    }

    public void insertCountry(Country country){
        System.out.println("Datos guardados en la base de datos");
    }

    public void insertCity(City city){
        System.out.println("Datos guardados en la base de datos");
    }
}
