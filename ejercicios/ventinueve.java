package ejercicios;

import java.util.Scanner;

public class ventinueve {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        int C1 = 0, C2 = 0, C3 = 0, CB = 0;
        int VE;

        for (int k = 1; k <= 160; k++) {
            System.out.print("Ingrese el voto #" + k + " (1, 2, 3 para candidatos, otro para nulo/blanco): ");
            VE = teclado.nextInt();

            switch (VE) {
                case 1 -> C1++;
                case 2 -> C2++;
                case 3 -> C3++;
                default -> CB++;
            }
        }

        int ganador;
        if (C1 > C2 && C1 > C3) {
            ganador = 1;
        } else if (C2 > C1 && C2 > C3) {
            ganador = 2;
        } else if (C3 > C1 && C3 > C2) {
            ganador = 3;
        } else {
            ganador = 0; // Empate o sin mayoría clara
        }

        System.out.println("El ganador es: " + (ganador == 0 ? "Empate o Sin mayoría clara" : "Candidato " + ganador));
        System.out.println("Votos nulos o en blanco: " + CB);

        teclado.close();
    }
}
