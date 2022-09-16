package ejercicio6p3s3;

import java.util.Scanner;

public class Ejercicio6P3S3 {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        int contador;
        int fin;
        System.out.println("por favor ingrese el valor inicial (contador)");
        contador = Reader.nextInt();
        System.out.println("Por favor ahora ingrese el valor final");
        fin = Reader.nextInt();
        while(contador <= fin){
        System.out.println("Valor actual de la interación "+contador);
        contador++;
        }      
    }
    
}