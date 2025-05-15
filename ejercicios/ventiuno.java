package ejercicios;

import java.util.Scanner;

public class ventiuno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int MAYOR = 0;
        int MENOR = 0;
        

        int EP;

        for (int k = 1; k <= 200; k++) {
            System.out.println("Ingrese la edad:");

            EP = teclado.nextInt();

            if (EP < 18) {
                MENOR++;
                
            } else {
                MAYOR++;
               
            }
        }

        System.out.println("Los menores son: " + MENOR);
        System.out.println("Los mayores son: " + MAYOR);
        

        teclado.close();
    }
}
