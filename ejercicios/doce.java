package ejercicios;
import java.util.Scanner;
public class doce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero uno");
        int N1 = teclado.nextInt();

        System.out.print("Ingrese el numero dos");
        int N2 = teclado.nextInt();

        System.out.print("Ingrese el numero tres");
        int N3 = teclado.nextInt();


        if(N1 > N2 && N1 > N3
        ){
           System.out.println("el numero uno mayor es" + N1);
        }else if(N2 > N3){
             System.out.println("el numero dos mayor es" + N2);
        }else{
              System.out.println("el numero tres mayor es" + N3);
        }

      teclado.close();  






    }
}
