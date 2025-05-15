package ejercicios;
import java.util.Scanner;
public class diesiseis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese numero del 1 al 5");
        int NE =teclado.nextInt();

        String V;

        switch (NE) {
            case 1: V = "A";break;
            case 2: V = "B";break;
            case 3: V = "c";break;
            case 4: V = "D";break;
            case 5: V = "E";break;
        
            default: V ="valor incorrecto";break;
        }
        System.out.println("Resultado: " + V);
        teclado.close();
    }
}
