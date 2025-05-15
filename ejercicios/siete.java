package ejercicios;
import java.util.Scanner;
public class siete {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.println("leer los Gigabyts:");

        int GB = teclado.nextInt();

        System.out.println("los Gigabyts son :" + GB);

        System.out.println("las Megabyts son:");

        double MB =  GB *1.024;

        System.out.println("los megabyts son:" + MB);

        double CD = (int) (MB / 700)+1;

        System.out.println("el numero de CDs son :" + CD);

        teclado.close();
    }
}
