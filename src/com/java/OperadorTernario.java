package com.java;

public class OperadorTernario {
    public static void main(String[] args) {
        String resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);

        int numero = 8;
        resultado = ((numero & 2) == 0) ? "numero par" : "numero impar";
        System.out.println("resultado =  " +resultado);


    }
}
