package com.java;

import javax.swing.*;

// encapsular con get
public class inicio<altura, peso, edad, nombre> {
    public static void main(String[] args) {

        // Persona = objeto ; objetoPersona= nombre del objeto; new Persona= constructor

        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");

        Integer edad = Integer.parseInt( JOptionPane.showInputDialog("Introduce tu Edad:"));

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso:"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu Altura:"));
        Persona objetoPersona = new Persona(nombre,edad,peso,altura);


        JOptionPane.showMessageDialog(null,objetoPersona.datos() + "\n"
        + objetoPersona.calcularIMC() + "\n" + mayorDeEdad(objetoPersona));


    }
    public static String mayorDeEdad(Persona p) {
        if(p.esMayorDeEdad()) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

   }

