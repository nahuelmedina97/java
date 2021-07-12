package com.java;

import java.util.Scanner;

public class Clase10scanner {  
    public static void main(String[] args) {
     // convertir tipo string a un tipo int 
     int edad= Integer.parseInt("20") ; 
      System.out.println("edad =  " + (edad + 1 )); 
      
      double valorPI= Double.parseDouble("3.1416"); 
      System.out.println("valorPI = " + valorPI); 
      //Pedir un valor 
        Scanner consola = new Scanner(System.in) ; 
      //System.out.println("Proporcionar tu edad:");
      //edad = Integer.parseInt (consola.nextLine() ) ; 
       // System.out.println("edad = " + edad); 
       
        String edadTexto = String.valueOf(10) ; 
       System.out.println("edadTexto = " + edadTexto) ; 
       
       char caracter = "Hola".charAt(0); 
       System.out.println("caracter = " + caracter); 
       
       System.out.println("Proporciona un caracter: "); 
       caracter = consola.nextLine().charAt(0); 
       System.out.println("caracter =  " + caracter); 
       
       
       
      

    }
    
 }
