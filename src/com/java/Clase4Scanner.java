package com.java;//SCANNER
import java.util.Scanner;

class Clase4Scanner  {
    public static void main(String[] args) {  
      Scanner scanner = new Scanner(System.in);

  System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);

    }
}