package ejercicios;
    import java.util.Scanner;
public class primero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("la velocidad ingresada es:");

        int velocidad = teclado.nextInt();

        System.out.println("la velocidad es " + velocidad);

        System.out.println("el tiempo ingresado es:");

        int tiempo = teclado.nextInt();

        System.out.println("el tiempo es:" + tiempo);

        int distancia = velocidad * tiempo;

        System.out.println("la distancia calculada es:" + distancia);

        teclado.close();
    }
    
}
