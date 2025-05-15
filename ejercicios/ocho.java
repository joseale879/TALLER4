package ejercicios;

import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Leer coordenadas de A
        System.out.print("Ingrese la abscisa (x) de A: ");
        double AA = scanner.nextDouble();
        System.out.print("Ingrese la ordenada (y) de A: ");
        double OA = scanner.nextDouble();

        // Leer coordenadas de B
        System.out.print("Ingrese la abscisa (x) de B: ");
        double AB = scanner.nextDouble();
        System.out.print("Ingrese la ordenada (y) de B: ");
        double OB = scanner.nextDouble();

        // Calcular la distancia
        double D = Math.sqrt(Math.pow((AB - AA), 2) + Math.pow((OB - OA), 2));

        // Mostrar resultado
        System.out.println("La distancia entre A y B es: " + D);

        scanner.close();
    }
}


