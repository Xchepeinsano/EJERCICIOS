package com.mycompany.periodo2clase4ejercicio2;
public class Periodo2clase4ejercicio11 {
    public static void main(String[] args) {
        // Programa Java para demostrar el uso de un
        // string para controlar una declaracion switch
        String str = "dos";
        switch (str)
        {
            case "uno" -> System.out.println("uno");
            case "dos" -> System.out.println("dos");
            case "tres" -> System.out.println("tres");
            default -> {
            }       
        }
        System.out.println("no coincide");
    }
}