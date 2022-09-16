import java.util.Scanner;

/**
 *
 * @author Turcios 
 */
public class Unidad3Semana1Clase3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Unidad3_Semana1_Clase3_Ejercicio7");
        
        Scanner entrada = new Scanner (System.in);
        double nota;
        
        System.out.print("Ingresar un valor entre 1 y 10");
        nota=entrada.nextDouble();
        
        while (nota<1 | nota>10)
        {
            System.out.print("Lo siento mucho pero el valor proporcionado no es correcto");
            nota=entrada.nextDouble();
        }
  
    }//Fin codigo
    
}//Fin