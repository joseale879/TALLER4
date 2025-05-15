package ejercicios;

import java.util.Scanner;

public class diesisiete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int NE; 
        int Q, R; 
        int D, U; 

        
        System.out.print("Ingrese un número entero de dos cifras: ");
        NE = teclado.nextInt();


        if (NE >= 10 && NE <= 99) {
            Q = NE / 10;
            R = NE - (Q * 10);

            D = Q;
            U = R;

            System.out.println("Decenas: " + D);
            System.out.println("Unidades: " + U);
        } else {
            System.out.println("El número ingresado no es de dos cifras.");
        }

        teclado.close();
    }
    
}
