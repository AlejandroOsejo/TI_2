package ui;

import model.Menu;

import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        int option;

        System.out.println("------------------------------------------------");
        System.out.println("Bienvenidos al SISTEMA DE INFORMACION GEOGRAFICA");
        System.out.println("------------------------------------------------");

        do {
            System.out.println("Selecciona la opcion que desea ejecutar escribiendo" +
                    "el numero correspondiente");
            System.out.println("1. Insertar Comando");
            System.out.println("2. Importar datos desde archivo .SQL");
            System.out.println("3. Salir");

            option = sc.nextInt();
            menu.Menu(option);

        }while (option != 3);

    }
}
