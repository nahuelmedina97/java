package com.java;

import java.util.Scanner;

public class claseEquals {
    public static void main(String[] args) {
        //Leer dos caracteres de teclado y comprobar si son iguales
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.println("Ingrese otra palabra: ");
        String palabra2 = scanner.nextLine();

        if (palabra.equals(palabra2)) {
            System.out.println("Son iguales");

        } else {
            System.out.println("no son iguales");

        }


    }
}
