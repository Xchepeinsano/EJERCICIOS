package ejerciciop3.pkg2;

import java.util.Scanner;
public class EjercicioP35 {

       public static void main(String[] args) {
       int a, b, respuesta;
       String accion;
       Scanner objeto;
       
       do {
           System.out.println("Ingresa el primer número");
           objeto = new Scanner(System.in);
           a = Integer.valueOf(objeto.nextLine());
           System.out.println("Ingrese el segundo numero");
           b = Integer.valueOf(objeto.nextLine());
           respuesta = a + b;
           System.out.println(String.valueOf(a) + " + " + String.valueOf(b) + " + " + String.valueOf(a+b));
           
           System.out.println("Quieres calcular la suma de otros dos numeros? (S/N)");
           Scanner teclado = new Scanner(System.in);
           accion = teclado.nextLine();
        } while (accion.equals("s")|| accion.equals("s"));
    }
    
}

