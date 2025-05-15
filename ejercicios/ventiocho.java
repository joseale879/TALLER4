package ejercicios;

import java.util.Scanner;

public class ventiocho {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int nv = 0; 
        int nc = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese una letra: ");
            char letra = teclado.next().toLowerCase().charAt(0);

            if (Character.isLetter(letra)) {
                switch (letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        nv++;
                        break;
                    default:
                        nc++;
                        break;
                }
            } else {
                System.out.println("Carácter no válido Intente de nuevo.");
            
            }
        }

        System.out.println("Número de vocales: " + nv);
        System.out.println("Número de consonantes: " + nc);
        teclado.close();
    }
}
