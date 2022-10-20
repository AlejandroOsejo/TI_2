package model;

import ui.Main;

public class SearchAndFiltering {

    public void filter(int search){
        int higherLower;
        int num = 0;

        switch (search){
            case 1:
                System.out.println("Has seleccionado paises");
                System.out.println("Ingrese si desea imprimir los datos mayor o menor a cierto numero");
                System.out.println("1. mayor");
                System.out.println("2. menor");
                higherLower = Main.sc.nextInt();

                if (higherLower == 1){
                    System.out.println("Ingresa el numero como base para imprimir todos los paises con una " +
                            "poblacion superior al numero");
                    num = Main.sc.nextInt();
                } else if (higherLower == 2){
                    System.out.println("Ingrese el numero como base paraimprimir todos los paises con una " +
                            "poblacion menor al numero");
                    num = Main.sc.nextInt();
                }else{
                    System.out.println("DEBES INGRESAR OBLIGATORIAMENTE SI ES MAYOR O MENOR");
                }


                filterCountries(num);
                break;

            case 2:
                System.out.println("Has seleccionado ciudades");
                System.out.println("Ingrese si desea imprimir los datos mayor o menor a cierto numero");
                System.out.println("1. mayor\n" +
                        "2. menor");
                higherLower = Main.sc.nextInt();

                if (higherLower == 1){
                    System.out.println("Ingresa el numero como base para imprimir todos los paises con una " +
                            "poblacion superior al numero");
                    num = Main.sc.nextInt();
                } else if (higherLower == 2){
                    System.out.println("Ingrese el numero como base paraimprimir todos los paises con una " +
                            "poblacion menor al numero");
                    num = Main.sc.nextInt();
                }else{
                    System.out.println("DEBES INGRESAR OBLIGATORIAMENTE SI ES MAYOR O MENOR");
                }

                filterCities(num);
                break;

            default:
                System.out.println("Ingrese un número válido");
        }
    }

    public void filterCountries(int requesPopulation){

    }

    public void filterCities(int requesPopulation){

    }
}
