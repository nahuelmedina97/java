package com.java;

public class OperadoresRelacionales {
    public static void main(String[] args) {
    int a = 3;
    int b = 2;


    boolean c = (a == b);
        System.out.println("c - " + c);

    boolean d = a != b;
        System.out.println("d - " + d);

    String cadena = "Hola";
    String cadena2 = "Adios";
    boolean e = cadena == cadena2; //compara referencias de objetos
        System.out.println("e = " + e);

    boolean f = cadena.equals(cadena2); //comparamos contedios de cadenas
        System.out.println("f = " + f);
   // operadores relacionales

        boolean g = a >= b; //mayor que > o el mayor o igual >=
        System.out.println("g = " + g);

        if ((a & 2) == 0 ) {
            System.out.println("Es numero par ");
        } else {
            System.out.println("Es numero impar");
        }
           int edad = 30;
           int adulto = 18;
           if (edad >= adulto) {
               System.out.println("Es un adulto");
           }
           else {
               System.out.println("Es menor de edad");
           }
  }

}

