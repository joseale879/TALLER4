package ejercicios;
import java.util.Scanner;
public class dies {
    public static void main(String[] args) {
        
     
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese edad uno: ");
        int edad1 = teclado.nextInt();

        
        System.out.print("Ingrese la edad dos: ");
        int edad2 = teclado.nextInt();

        // Comparar edades
        if (edad1 > edad2) {
            System.out.println("La primera edad (" + edad1 + ") es mayor que la segunda (" + edad2 + ").");
        } else if (edad2 > edad1) {
            System.out.println("La segunda edad (" + edad2 + ") es mayor que la primera (" + edad1 + ").");
        } 

        teclado.close();
    }
}