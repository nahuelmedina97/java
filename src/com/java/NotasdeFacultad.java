package com.java;

import java.util.Scanner;

public class NotasdeFacultad {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
       float PrimerTrimestre;
       Float SegundoTrimestre;
        Float Notafinal;
        System.out.println("Ingrese nota del primer cuatrimestre: " );

        Scanner teclado = scanner;
        PrimerTrimestre= teclado.nextFloat();
        System.out.println("Ingresa nota del segundo cuatrimestre: ");
        SegundoTrimestre= teclado.nextFloat();
        Notafinal= (PrimerTrimestre + SegundoTrimestre) / 2;
        System.out.println("Nota final: " + Notafinal);
        System.out.println(Notafinal);

        if (Notafinal>=7) {
            System.out.println("Esta Aprobado");

        }else  {
            System.out.println("Esta Desaprobado");
        }

    }
}