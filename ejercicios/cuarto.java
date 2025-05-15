package ejercicios;

import java.util.Scanner;

public class cuarto {
    
     public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);



    System.out.println("ingrese partidos ganados:");

    int PG = teclado.nextInt();

    System.out.println("los partidos ganados son:" + PG);

    System.out.println("ingrese partidos empatados:");

    int PE = teclado.nextInt();

    System.out.println("los partidos empatados son:" + PE);

    System.out.println("ingrese partidos perdidos:");

    int PP = teclado.nextInt();

    System.out.println("los partidos perdidos son:" + PP);

    int PPG = PG * 3;

    System.out.println("los puntos de los partidos ganados son:" + PPG);

    int PPE = PE + 1;

    System.out.println("los puntos de los partidos empatados son:" + PPE);

    System.out.println("los puntos finales son" + (PPG + PPE));


    teclado.close();
}
}
