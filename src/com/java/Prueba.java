package com.java;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Primer cuatrimestre: ");
        int primer = scanner.nextInt();
        System.out.println("Segundo cuatrimestre: ");
        int segundo = scanner.nextInt();
        int notaFinal = (primer + segundo) / 2;
        System.out.println("La nota final:" + notaFinal);


        if (notaFinal >= 7) {
            System.out.println("Esta aprobado");
        } else {
            System.out.println("Esta desaprobado");

        }
    }

}