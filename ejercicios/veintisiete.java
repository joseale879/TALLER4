package ejercicios;
import java.util.Scanner;
public class veintisiete {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

       
        System.out.print("Ingrese el primer número: ");
        int n1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n2 = teclado.nextInt();
        teclado.nextLine(); // Limpia el buffer

        System.out.print("Ingrese la operación (+, -, *, ^): ");
        String op = teclado.nextLine();  

        double r;

        switch (op) {
            case "+":
                r = n1 + n2;
                break;
            case "-":
                r = n1 - n2;
                break;
            case "*":
                r = n1 * n2;
                break;
            case "^":
                r = Math.pow(n1, n2);
                break;
            default:
                r = 0;
                System.out.println("Operación no válida.");
        }

        System.out.println("La respuesta es: " + r);

        teclado.close();
    }
}
