package com.mycompany.ejercicio1clase12;
import java.util.Scanner;
public class Ejercicio1clase12 {
 public static void main(String[] args) {
       Scanner Entrada = new Scanner (System.in);
       int reglas;
       double nota;
       System.out.println("Usted cumple las reglas de la universidad: ");
       System.out.println("Ingrese un numero: \n 1. siempre \n 2. Aveces \n 3. nunca");
       reglas = Entrada.nextInt();
       System.out.println("que nota obtuvo en el laboratorio: ") ;
       nota = Entrada.nextDouble();
       if (reglas == 1){
           if(nota >=8 & nota <=10){
               nota = 10;
           } else {
               System.out.println("Nota invalida");
           }
       } else if (reglas == 2) {
           if (nota <= 6) {
               nota = nota + 0.5;
           }else if (nota>= 6 & nota < 8){
               nota = nota + 0.7;
           }else {
               System.out.println("nota invalida");
           }
           }else{
               System.out.println("Usted debe cumplir las reglas") ;        
       }
        System.out.println("La nueva nota es: " + nota) ;
    }
}
