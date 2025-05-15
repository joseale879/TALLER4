package ejercicios;
import java.util.Scanner;
public class tercero {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    
    System.out.println("ingrese respuestas gandas:");

    int RC = teclado.nextInt();

    System.out.println("las respuestas ganadas son: "+ RC);

    System.out.println("ingrese respuestas incorrectas:");

    int RI = teclado.nextInt();

    System.out.println("las respuestas incorrectas son:" + RI);

    System.out.println("ingrese respuestas en blanco:");

    int RB = teclado.nextInt();

    System.out.println("las respuestas en blanco son son:" + RB);

    int PRC = RC * 4;

    System.out.println("los puntos de las respuestas correctas son:" + PRC);

    int PRI = RI *- 1;

    System.out.println("las respuestas incorrectas son:" + PRI);

    System.out.println("las respuestas finales son" + (PRC + PRI));

    

    teclado.close();
    }

   
    
}
