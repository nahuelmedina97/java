package com.java;

public class EstaciondelañoconSwitch {
    public static void main(String[] args) {
        int mes = 12;
        String estacion = "Estacion desconocida";

        switch (mes) {
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "otonio";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;

        }
        System.out.println("estacion = " + estacion);
    }
}