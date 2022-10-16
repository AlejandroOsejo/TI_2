package model;

import ui.Main;

public class Menu {
    InsertComand insertComand = new InsertComand();

    public void Menu(int option){
        switch (option){
            case 1:
                System.out.println("------------------------------------------------");
                System.out.println("--- Haz seleccionado Insertar Comando ---");
                System.out.println("------------------------------------------------");
                int comand;

                do {
                    System.out.println("Selecciona la opcion que desea ejecutar escribiendo" +
                            " el numero correspondiente");
                    System.out.println("1. INSERT INTO");
                    System.out.println("2. SELECT * FROM WHERE");
                    System.out.println("3. SELECT * FROM WHERE ORDER BY");
                    System.out.println("4. DELETE FROM");
                    System.out.println("5. SALIR DEL MENU DE COMANDO");

                    comand = Main.sc.nextInt();
                    insertComand.insertComandMenu(comand);

                }while (comand != 5);
                break;

            case 2:
                System.out.println("Importo");

                break;

            case 3:
                System.out.println("SALIR");

                break;

            default:
                System.out.println("DEBE INSERTAR UNA DE LAS OPCIONES DEL MENU");
        }
    }


    //Metodo que consiste en la importacion de datos .SQL
    public void importdata(String url){

    }

}
