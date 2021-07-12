package com.java;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        int a = 11;
        int valorMinimo = 0;
        int valorMaximo = 10;


        boolean resultado = a >= 0 && a <= 10;
        if (resultado) {
            System.out.println("Dentro de rango");
        } else
            System.out.println("Fuera de rango");

        boolean vacaciones = true;
        boolean diDescanso= false;

        if( vacaciones || diDescanso ) {
            System.out.println("Padre puede asistir al juego");
        }
        else {
            System.out.println("El padre esta ocupado");
        }


    }
}
