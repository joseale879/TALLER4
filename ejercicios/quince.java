package ejercicios;

import java.util.Scanner;

public class quince {
    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);

        double MV; 
        double TB; 


        System.out.print("Ingrese el monto de venta: ");
        MV = teclado.nextDouble();

        
        if (MV > 0 && MV <= 1000) {
            TB = MV * 0.03;
        } else if (MV > 1000 && MV <= 5000) {
            TB = MV * 0.05;
        } else if (MV > 5000 && MV <= 20000) {
            TB = MV * 0.08;
        } else if (MV > 20000) {
            TB = MV * 0.10;
        } else {
            TB = 0;
            System.out.println("El monto de venta debe ser mayor que 0.");
        }

        
        if (MV > 0) {
            System.out.println("La bonificación correspondiente es: " + TB);
        }

        teclado.close();
}
}