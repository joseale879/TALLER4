package ejercicios;

import java.util.Scanner;

public class treinta {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double N1 = teclado.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double N2 = teclado.nextDouble();

        double suma = N1 + N2;
        double promedio = suma / 2;

        System.out.println("El promedio de ambos números es: " + promedio);
        teclado.close();
    }
}
