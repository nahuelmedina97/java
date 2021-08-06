package com.java;

import java.util.ArrayList;
import java.util.List;

public class cicloWhile {
    private static Object Persona;

    public static void main(String[] args) {
          int i = 0;
          Persona miobjeto = new Persona("nahuel",23,45,179);
        Persona miobjeto2 = new Persona("nani",22,80,169);
        Persona miobjeto3 = new Persona("Santi",22,70,180);

         ArrayList<Persona> lista = new ArrayList<Persona>();
         lista.add(miobjeto);
         lista.add(miobjeto2);
         lista.add(miobjeto3);
        System.out.println(miobjeto.getNombre());
        System.out.println(miobjeto2.getNombre());
        System.out.println(miobjeto3.getNombre());
        while ( i < 3){

            System.out.println();
            i++;
        }











    }
}
