package com.java;

public class Operadoresaritmeticos {

    public static void main(String[] args) {
       int a=3, b=2; 
       int resultado = a + b ; 
        System.out.println("resultado  suma = " + resultado); 
        
        resultado = a - b ; 
        System.out.println("resultado resta = " + resultado); 
        
        resultado = a * b ; 
        System.out.println("resultado multiplicacion = " + resultado); 
        
        //resultado = a / b ; 
        //System.out.println("resultado division = " + resultado);   
        
      
           double resultado2 = (double) (3f / b) ; 
        System.out.println("resultado division = " + resultado2);  
        
        //resultado = a % b ; 
        // System.out.println("resultado modulo = " + resultado modulo);
        
        if (a % 2 == 0 ) 
            System.out.print("Es numero par"); 
        else 
            System.out.println("Es numero impar"); 
        
        
    }
    
}
