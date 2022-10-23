package model;

public class Ordering {

    public void countryorCity(int order){
        switch (order){
            case 1://Pais
                System.out.println("Has seleccionado pais");


                break;

            case 2://Ciudad


                break;

            default:
                System.out.println("DEBE DE SELECCIONAR QUE TIPO DE DATO VA A INGRESAR");
        }
    }
}
