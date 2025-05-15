package ejercicios;

import java.util.Scanner;

public class veinticinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

      String SEMAF = "V";
        String L;

        while (SEMAF.equalsIgnoreCase("V")) {
            System.out.print("Ingrese una letra: ");
            L = teclado.nextLine().toLowerCase(); 

            switch (L) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    SEMAF = "R";
                    break;
                default:
                    SEMAF = "";
                    break;
            }
        }

        System.out.println("Fin del programa. SEMAFORO cambió.");

        teclado.close();
            
            

       
    }
}
