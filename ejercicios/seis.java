package ejercicios;
import java.util.Scanner;;
public class seis {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese lado a");

        int LA = teclado.nextInt();

        System.out.println("el lado es" + LA);

          System.out.println("ingrese lado b");

        int LB = teclado.nextInt();

        System.out.println("el lado es" + LB);

          System.out.println("ingrese lado c");

        int LC = teclado.nextInt();

        System.out.println("el lado es" + LC);

        int LS = (LA + LB + LC)/2;

        System.out.println("la longitud del semiperimetro es" + LS);

        int AT = LS * (LS - LA) * (LS - LB) * (LS - LC);

        System.out.println("AREA TOTAL:" + AT);

        teclado.close();
        
    }
}
