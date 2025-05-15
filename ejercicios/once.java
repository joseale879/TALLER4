package ejercicios;
import java.util.Scanner;
public class once {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la produccion del lunes");
        int PL = teclado.nextInt();

        System.out.print("Ingrese la produccion del martes");
        int PMa = teclado.nextInt();

        System.out.print("Ingrese la produccion del miercoles");
        int PMi = teclado.nextInt();

        System.out.print("Ingrese la produccion del jueves");
        int PJ = teclado.nextInt();

        System.out.print("Ingrese la produccion del viernes");
        int PV = teclado.nextInt();

        System.out.print("Ingrese la produccion del sabado");
        int PS = teclado.nextInt();

        int PT = (PL + PMa + PMi + PJ + PV + PS);

        int PP = PT/6;

        if(PP >= 100){
            System.out.println("recibira incentivos");
        }else{
            System.out.println("no recibira incentivos");
        }


         teclado.close();
    }
}
