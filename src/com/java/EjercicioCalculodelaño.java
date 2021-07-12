
package com.java;
import java.util.Scanner;

public class EjercicioCalculodelaño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estacion del año:");
         int mes = scanner.nextInt();
        String estacion = "Estacion desconcida";

        if (mes >= 1 && mes <= 3 ) {
            estacion = "verano";
        } else if (mes >=4 && mes <= 6) {
            estacion = "otonio";
        } else if (mes >=7 && mes <= 8 ) {
            estacion = "Invierno";
        } else if (mes >=9 && mes <=12) {
            estacion = "Primavera";
        }
        System.out.println("estacion = " + estacion);
    }
}