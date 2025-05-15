package ejercicios;

import java.util.Scanner;

public class veinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NE; 
        double SE; 
        double SS = 0; 
        double SP;

        
        System.out.print("Ingrese el número de empleados: ");
        NE = scanner.nextInt();

        
        for (int K = 1; K <= NE; K++) {
            System.out.print("Ingrese el sueldo del empleado " + K + ": ");
            SE = scanner.nextDouble();
            SS = SS + SE;
        }

        
        SP = SS / NE;

        System.out.println("El sueldo promedio es: " + SP);

        scanner.close();
    }
}
