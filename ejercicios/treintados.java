package ejercicios;

import java.util.Scanner;

public class treintados {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int N;

       
        
         System.out.print("Ingrese un número entero distinto de cero: ");
         N = teclado.nextInt();
         while (N == 0);

        System.out.println("Los divisores de " + N + " son:");

       
        for (int K = 1; K <= Math.abs(N); K++) {
            if (N % K == 0) {
                System.out.println(K);
            }
        }
        teclado.close();
    }
}
