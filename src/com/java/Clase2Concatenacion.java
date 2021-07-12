package com.java;

//CONCATENACION
public class Clase2Concatenacion { 
    public static void main(String[] args) {
      String usuario = "Juan"; 
        String titula = "Ingeniero" ; 
        
        String union = titula + " " + usuario; 
        System.out.println("union =  " +  union); 
        
        int  i = 3; 
        int  j = 4;  
        
        System.out.println(i + j); //se realiza la suma
        System.out.println(i + j + usuario); // evaluacion de izq a der
        System.out.println(usuario + i + j ) ; // contexto cadena,todo es una cadena
        System.out.println(usuario + (i + j )) ; // uso de parentesis modifica la prioridad en la evaluacion 
    }
     
}
