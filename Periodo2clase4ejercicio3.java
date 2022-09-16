package com.mycompany.periodo2clase4ejercicio3;

public class Periodo2clase4ejercicio3 {
    public static void main(String[] args) {
        // programa de Java para demostrar
        // declaraciones switch case anidadas
        String Branch = "CSE";
        int year = 2;
        
        switch(year)
        {
            case 1 :
                System.out.println("Curso electivos: Ingles,Calculo");
                break;
            case 2 :
                switch (Branch) // switch anidado
                {
                    case "CSE" -> System.out.println("Curso electivos : Machine Learning,Big Data");
                    case "ECE" -> System.out.println("Cursos electivos : programacion");
                            
                }       default:            
                System.out.println("Cursos electivos : Ingenieria de Software");
           }
       }
   }
