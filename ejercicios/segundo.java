package ejercicios;
import java.util.Scanner;
public class segundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese su primer nota");

        int nota1 = teclado.nextInt();

        System.out.println("su nota es:" + nota1);

        
        System.out.println("ingrese su seguna nota");

        int nota2 = teclado.nextInt();

        System.out.println("su nota es:" + nota2);

        
        System.out.println("ingrese su tercer nota");

        int nota3 = teclado.nextInt();

        System.out.println("su nota es:" + nota3);

        int promedio = (nota1 + nota2 + nota3)/3;

        System.out.println("su promedio es:" + promedio);
        
        teclado.close();
    }
}
