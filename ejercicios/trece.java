package ejercicios;
import java.util.Scanner;
public class trece {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String TT;

        System.out.print("Ingrese el primer lado: ");
        int L1 = teclado.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int L2 = teclado.nextInt();

        System.out.print("Ingrese el tercer lado: ");
        int L3 = teclado.nextInt();

        if(L1 != L2 && L2 != L3 && L1 != L3){
            TT = "escaleno";
        }else if(L1 == L2 && L2 == L3){
            TT = "equilatero";
        }else{
            TT ="isoseles";
        }

        System.out.println("el tipo de triangulo es " + TT);

        teclado.close();
    }
}
