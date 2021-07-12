package com.java;

import java.util.Scanner;
public class comprobarMayuscula {
   public static void main(String[] args) {
        // Leer un caracter por teclado y comprobar si la letra es mayuscula
       Scanner scanner = new Scanner(System.in);
        char caracter;
        System.out.println("ingresar letra: ");
         caracter = scanner.next().charAt(0);
       System.out.println("letra introducida -> " + caracter);


    }
}

