package model;

import ui.Main;

public class InsertComand {
    Insert insert = new Insert();
    SearchAndFiltering sf = new SearchAndFiltering();
    Ordering order = new Ordering();
    Remove remove = new Remove();
    int cc;

    public void insertComandMenu(int comand){
        switch (comand){
            case 1: //Agregar datos
                System.out.println("Has seleccionado la opción INSERT INTO");
                System.out.println("Que dato va a ingresar, va a ingresar un Pais o una ciudad");
                System.out.println("1. Pais");
                System.out.println("2. Ciudad");
                cc = Main.sc.nextInt();

                insert.countryorCity(cc);
                break;

            case 2:// busqueda y filtracion
                System.out.println("Haz seleccionado la opcion SELECT * FROM WHERE");
                System.out.println("SELECT * FROM WHERE consiste en imprimir todos " +
                        "los paises o ciudades con cierta cantidad de poblacion o buscar pur su nombre");
                System.out.println("Primero, ingresa por si quiere filtrar o buscar paises " +
                        "o ciudades");
                System.out.println("1. Filtrar Paises");
                System.out.println("2. Filtrar Ciudades");
                System.out.println("3. Buscar Paises");
                System.out.println("4. Buscar Ciudades");
                cc = Main.sc.nextInt();

                sf.filter(cc);
                break;

            case 3:// ordenamiento
                System.out.println("Has seleccionado la opcion SELECT * FROM WHERE ORDER BY");
                System.out.println("SELECT * FROM WHERE ORDER BY consite en imprimir todos " +
                        "los paises o ciudades en orden, de mayor a menor o en orden alfabético");
                System.out.println("1. Paises de mayor a menor");
                System.out.println("2. Ciudades de mayor a menor");
                System.out.println("3. Paises en orden alfabetico");
                System.out.println("4. Ciudades en orden alfabetico");
                cc = Main.sc.nextInt();

                order.countryorCity(cc);
                break;

            case 4://eliminacion
                System.out.println("Has seleccionado la opcion DELETE FROM");
                System.out.println("DELETE FROM consiste en eliminar un registro");
                System.out.println("Primero ingresa si quieres elminar un registro de paises o de ciudades o eliminarlos por su poblacion");
                System.out.println("1. Paises");
                System.out.println("2. Ciudades");
                System.out.println("3. Paises por poblacion");
                System.out.println("4. Ciudades por poblacion");
                cc = Main.sc.nextInt();

                remove.countryOrCity(cc);
                break;

            case 5://SALIR DEL MENU DE COMANDO
                System.out.println("SALIR DEL MENU DE COMANDO");
                break;

            default:
                System.out.println("DEBE INGRESAR UN COMANDO YA EXISTENTE");
        }
    }
}
