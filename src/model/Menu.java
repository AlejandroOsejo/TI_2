package model;

import ui.Main;

import java.util.Scanner;

public class Menu {
    InsertComand insertComand = new InsertComand();

    public void Menu(int option){
        switch (option){
            case 1:
                System.out.println("Haz seleccionado Insertar Comando ");
                int num = Main.sc.nextInt();

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

    //Metodo que consiste en el almacenamiento de datos .SQL
    public void Storage(String list, String url){

    }

    //Metodo que consiste en la importacion de datos .SQL
    public void importdata(String url){

    }

}
