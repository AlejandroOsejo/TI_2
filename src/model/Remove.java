package model;

public class Remove {
    public void countryOrCity(int cc){
        switch (cc){
            case 1:
                System.out.println("Has seleccionado eliminar un registro de paises");

                break;

            case 2:
                System.out.println("Has seleccionado eliminar un registro de ciudades");

                break;

            default:
                System.out.println("Ingrese un número válido");
        }
    }

    public void deleteCountry(){
        //Debe recibir la lista de paises
        //eliminar un pais por el nombre

    }
    public void deleteVity(){
        //DEbe recibir la lista de ciudades
        //eliminar una ciudad ´por el nombre

    }
}
