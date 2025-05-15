package ejercicios;
import java.util.Scanner;
public class nueve {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("el año actual  es");

        int AA = teclado.nextInt();

        System.out.println("el año actual es:" + AA);

        System.out.println("el año de nacimiento es");

        int AN = teclado.nextInt();

        System.out.println("el año ingresado es:" + AN);

        
        

        int E = AA - AN;

        System.out.println("su edad es: " + E);

        if (E > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aún");
        }



        teclado.close();
    }
}
