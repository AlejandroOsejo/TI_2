package model;

public class InsertComand {
    Insert insert = new Insert();
    SearchAndFiltering sf = new SearchAndFiltering();
    Ordering order = new Ordering();
    Remove remove = new Remove();

    public void insertComandMenu(int comand){
        switch (comand){
            case 1: //Agregar datos
                System.out.println("Haz seleccionado la opcion INSERT INTO");

                break;

            case 2:// busqueda y filtracion

                break;

            case 3:// ordenamiento

                break;

            case 4://eliminacion

                break;

            case 5://SALIR DEL MENU DE COMANDO

                break;

            default:
                System.out.println("DEBE INGRESAR UN COMANDO YA EXISTENTE");
        }
    }
}
