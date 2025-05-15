package ejercicios;

import java.util.Scanner;

public class cinco {
    
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese las horas laboradas:");

        int HL = teclado.nextInt();

        System.out.println("las horas son " + HL);

        System.out.println("las horas taeifadas son:");

        int TH = teclado.nextInt();

        System.out.println("la tarifa por hora es:" + TH);

        

        System.out.println("la planilla de sus horas son:" + (HL * TH));

        teclado.close();
}
}