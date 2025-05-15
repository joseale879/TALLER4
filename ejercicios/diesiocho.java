package ejercicios;

import java.util.Scanner;

public class diesiocho {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        int NE; 
        int Q;
        int R; 
        String MSG;

        // Leer número entero distinto de cero
        System.out.print("Ingrese un número entero diferente de cero: ");
        NE = teclado.nextInt();

        Q = NE / 2;
        R = NE - (Q * 2);

    
        if (R == 0) {
            MSG = "Es Par";
         } else {
            MSG = "Es Impar";
         }

            // Mostrar mensaje
            System.out.println(MSG);
        

        teclado.close();
    }
}
