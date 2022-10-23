package model;

import java.util.Collections;
import java.util.Comparator;

public class Ordering {
    Insert insert = new Insert();

    public void countryorCity(int order){
        switch (order){
            case 1://Pais
                System.out.println("Has seleccionado pais");

                orderCountry();
                break;

            case 2://Ciudad


                break;

            default:
                System.out.println("DEBE DE SELECCIONAR QUE TIPO DE DATO VA A INGRESAR");
        }
    }

    public void orderCountry(){//metodo de organizar la lista por la poblacion, paises
        Comparator<Country> p1 = new Insert();
        Collections.sort(insert.listGsonCountry, p1);

        System.out.println("LISTA DE LOS PAISES DE MAYOR A MENOR POBLACION");
        for (int i=0; i>insert.listGsonCountry.size(); i++){
            System.out.println(insert.listGsonCountry.get(i).getPopulation() + " " +
                    insert.listGsonCountry.get(i).getName());
        }
    }

    public void orderCity(){ //Metodo de organizar la lista por poblacion, ciudades

    }
}
