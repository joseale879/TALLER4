package ejercicios;
import java.util.Scanner;
public class ventitres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

      

    for (int k = 1 ; k < 10; k++ ){
     int cociente = k/2;
     int residuo = k - (cociente*2);
     if (residuo  != 0 ){
          System.out.print("El residuo es: " + residuo);
     }
}

        teclado.close();
    }
}
