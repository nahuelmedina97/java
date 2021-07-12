package com.java;

import java.util.Scanner;

public class ejercicioHorario {
    public static void main(String[] args) {
        // insertar un horario y determinar si es mañana tarde o noche
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insertar horario: ");
        int horario = scanner.nextInt();

        if (horario <= 12) {
            System.out.println("Es mañana ");
        } else if (horario > 12 && horario < 20) {
            System.out.println("Es tarde ");
        } else if (horario >= 20) {
            System.out.println("Es de noche ");


        }


    }


}