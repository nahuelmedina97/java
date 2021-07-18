package com.java;

public class ciclofor {
    private static int contador;

    public static void main(String[] args) {
        for ( int contador = 0 ; contador <3 ; contador++) {
            if( (contador & 2) != 0)
            System.out.println("contador: " + contador );
        }
    }
}
