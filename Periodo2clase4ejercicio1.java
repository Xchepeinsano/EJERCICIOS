package com.mycompany.periodo2clase4ejercicio1;
public class Periodo2clase4ejercicio9 {
    public static void main(String[] args) {
        // programa Java parademostrar switch case
        // con tipo de datos primitivos (int)
        int day = 5;
        String dayString;
        // instruccion de switch con tipo de datos int
        dayString = switch (day) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            case 4 -> "jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };   
        String dayType;
        
        dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "dia laborable";
            case 6, 7 -> "fin de semana";
            default -> "Tipo de dia invalido";
        }; //multiples cases sin declaraciones break
        System.out.println(dayString+ " es un " + dayType);
    }
}