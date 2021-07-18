package com.java;

import javax.swing.*;

public class Persona {

    private String nombre ;
    private int edad;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double altura;

    public Persona() {

    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        JOptionPane.showMessageDialog(null, "Hola" + getNombre());
    }

    public String calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return "Peso ideal";

        } else if (pesoActual < 20) {
            return "Debajo de su peso ideal";

        } else {
            return "Encima de su peso ideal";
        }
    }
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if(edad >= 18) {
            mayor= true;
        }
        return mayor;
    }
    public String datos() {
        String informacion = "Informacion de la persona \n"
                 + "Nombre:  " + nombre + "\n"
                 + "Edad: " + edad + "\n"
                 + "Peso:  " + peso + "\n"
                 + "Altura:  " + altura + "\n";
        return informacion;
    }
}
