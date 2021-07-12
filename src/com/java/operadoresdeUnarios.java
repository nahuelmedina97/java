package com.java;

public class operadoresdeUnarios {

    public static void main(String[] args) {
      int a = 3; 
      int b = -a; 
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 
        
        boolean c = true ; 
        boolean d = !c;  
        System.out.println("c = " + c); 
        System.out.println("d = " + d); 
        
        // incremento 
        // 1.preincremento ( simbolo antes de la variable ) 
        int e = 3; 
        int f = ++e; //primero se incrementa la variable y despues se usa su valor 
        System.out.println("e = " + e);
        System.out.println("f = " + f); 
        // 2.postincremnteo (simbolo despues de la variable) 
        int g = 5; 
        int h = g++; // primero se ultiza el valor y despues se incrementa 
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //decremento
        //1.predecremento
         int i = 2;
         int j = --i;
      System.out.println("i = " + i); // ya esta drecrementada
      System.out.println("j = " + j);

      //2.postdecremento
       int k = 4;
       int l = k--; //primero se ultiliza el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k); //tenia pendiente un decremento
        System.out.println("l = " + l);
        
        
        
    }   
    
}
