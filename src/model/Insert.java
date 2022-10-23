package model;

import com.google.gson.Gson;
import ui.Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;

public class Insert {
    ArrayList<Country> countries = new ArrayList<>();
    ArrayList<City> cities = new ArrayList<>();

    public void countryorCity(int option){
        switch (option){
            case 1://Pais

                System.out.println("------------------------------------");
                System.out.println("--- Ingrese los siguientes datos ---");
                System.out.println("------------------------------------\n");

                System.out.println("ID del pais");
                String id = UUID.randomUUID().toString();
                System.out.println(id);
                System.out.println("Ingrese el nombre");
                String a = Main.sc.nextLine();
                String name = Main.sc.nextLine();
                System.out.println("Ingrese la poblacion");
                long population = Main.sc.nextInt();
                System.out.println("Ingrese el indicativo del pais");
                String b = Main.sc.nextLine();
                String countryCode = Main.sc.nextLine();
                Country country = new Country(id, name, population, countryCode);

                countries.add(new Country(id, name, population, countryCode));
                insertCountry(country, countries);
                break;

            case 2://Ciudad

                System.out.println("------------------------------------");
                System.out.println("--- Ingrese los siguientes datos ---");
                System.out.println("------------------------------------\n");

                System.out.println("ID de la ciudad");
                String idCity = UUID.randomUUID().toString();
                System.out.println(idCity);
                System.out.println("Ingrese el nombre");
                String c = Main.sc.nextLine();
                String nameCity = Main.sc.nextLine();
                System.out.println("Ingrese la poblacion");
                long populationCity = Main.sc.nextInt();
                System.out.println("ID del pais que pertenece");
                String idCountry = UUID.randomUUID().toString();
                System.out.println(idCountry);
                City city = new City(idCity, nameCity, idCountry, populationCity);

                cities.add(new City(idCity, nameCity, idCountry, populationCity));
                insertCity(city, cities);
                break;

            default:
                System.out.println("DEBE DE SELECCIONAR QUE TIPO DE DATO VA A INGRESAR");
        }
    }

    public void insertCountry(Country country, ArrayList<Country> countries){
        ArrayList<Country> listGson = new ArrayList<>();

        //Guardar GSON
        Gson gson = new Gson();
        String data = gson.toJson(countries);
        for (Country c : listGson){
            data += c.getId() + ";" +
                    c.getName() + ";" +
                    c.getPopulation() + ";" +
                    c.getCountryCode();
        }

        try {
            FileOutputStream fos = new FileOutputStream("paises.json");
            fos.write(data.getBytes(StandardCharsets.UTF_8));
            fos.close();
        }catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("///////////////////////////////////////////");
        System.out.println("--- Datos guardados en la base de datos ---");
        System.out.println("INSERT INTO countries (id, nombre, poblacion y indicativo del pais) VALUES " +
                data);
        System.out.println("///////////////////////////////////////////\n");
    }

    public void insertCity(City city, ArrayList<City> cities){
        ArrayList<City> listGson = new ArrayList<>();

        Gson gson = new Gson();
        String data = gson.toJson(cities);
        for (City c : listGson){
            data += c.getIdCity() + ";" +
                    c.getNameCity() + ";" +
                    c.getIdCountry() + ";" +
                    c.getPopulationCity();
        }

        try {
            FileOutputStream fos = new FileOutputStream("ciudades.json");
            fos.write(data.getBytes(StandardCharsets.UTF_8));
            fos.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("///////////////////////////////////////////");
        System.out.println("--- Datos guardados en la base de datos ---");
        System.out.println("INSERT INTO cities (id, nombre, id del pais y poblacion) VALUES " +
                data);
        System.out.println("///////////////////////////////////////////\n");
    }
}
