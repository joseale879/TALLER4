package ejercicios;
import java.util.Scanner;
public class ventidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero2;

        int p = 0;

        System.out.println("ingrese numero uno");
        numero1 = teclado.nextInt();

        System.out.println("ingrese numero dos");
        numero2 = teclado.nextInt();

        for(int k = 1 ; k <= numero2 ; k++){
            p = p + numero1;
        }

        System.out.println("el producto es" + p);

        teclado.close();
    }
}
