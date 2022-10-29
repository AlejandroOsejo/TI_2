package model;

public class Ordering {
    Insert insert = new Insert();

    public void countryorCity(int order){
        switch (order){
            case 1://Pais
                System.out.println("Has seleccionado pais");

                orderCountry();
                break;

            case 2://Ciudad
                System.out.println("Has seleccionado ciudad");

                orderCity();
                break;

            default:
                System.out.println("DEBE DE SELECCIONAR QUE TIPO DE DATO VA A INGRESAR");
        }
    }

    public void orderCountry(){//metodo de organizar la lista por la poblacion, paises
        //Comparator<Country> p1 = new Insert();
        //Collections.sort(insert.countries, p1);

        System.out.println("LISTA DE LOS PAISES DE MAYOR A MENOR POBLACION");
        for (int i=0; i>insert.countries.size(); i++){ // coge la lista donde se guardan los paises pero esta vacía, no sé como solucionarlo
            System.out.println(insert.countries.get(i).getPopulation() + " " +
                    insert.countries.get(i).getName());
        }
    }

    public void orderCity(){ //Metodo de organizar la lista por poblacion, ciudades
        System.out.println("LISTA DE LOS PAISES DE MAYOR A MENOR POBLACION");
        for (int i=0; i>insert.cities.size(); i++){ // coge la lista donde se guardan los paises pero esta vacía, no sé como solucionarlo
            System.out.println(insert.cities.get(i).getPopulationCity() + " " +
                    insert.cities.get(i).getNameCity());
        }
    }
}
