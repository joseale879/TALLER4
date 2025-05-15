package ejercicios;
import java.util.Scanner;
public class diesinueve {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero");
        int N = teclado.nextInt();

        for (int K = 1; K <= 4; K++) {
            System.out.println(N);
            N = N + 2;
        }
        teclado.close();
    }
    
}
