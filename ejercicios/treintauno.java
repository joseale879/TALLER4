package ejercicios;

import java.util.Scanner;

public class treintauno {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Ingrese un número del 1 al 12: ");
        numero = teclado.nextInt();

        switch (numero) {
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septiembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
            default -> System.out.println("Número inválido. Debe estar entre 1 y 12.");
        }
        teclado.close();
    }
}
