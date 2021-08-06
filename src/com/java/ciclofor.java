package com.java;

public class ciclofor {
    private static int contador;

    public static void main(String[] args) {
//        for ( int contador = 1 ; contador <10 ; contador++) {
//            if( (contador & 2) != 0)
//            System.out.println("contador: " + contador );
//        }
        for (int contador = 0; contador < 10; contador++) {
            if (contador == 10) {
                break;
            }
            System.out.println(contador); }

    }
}
