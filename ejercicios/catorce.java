package ejercicios;
import java.util.Scanner;
public class catorce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int NE; 
        String ER; 

        
        System.out.print("Ingrese un número entero del 1 al 10: ");
        NE =teclado.nextInt();

        
        switch (NE) {
            case 1:ER = "I";break;

            case 2:ER = "II"; break;

            case 3:ER = "III";break;

            case 4:ER = "IV";break;

            case 5:ER = "V";break;

            case 6:ER = "VI";break;

            case 7:ER = "VII";break;

            case 8:ER = "VIII";break;

            case 9:ER = "IX";break;

            case 10:ER = "X";break;

            default:ER = "Número fuera de rango (1-10)";break;
        }

        
        System.out.println("Equivalente en romano: " + ER);

        teclado.close();
    }
}
