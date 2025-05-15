package ejercicios;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

     Scanner teclado = new Scanner(System.in);
        int opcion,a,b,c,d,e,f,g,h;
        String i;

        System.out.println("Digite un número del 1 al 20:");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
            {
                System.out.println("Ejercicio 1 seleccionado");
                System.out.println("la velocidad ingresada es:");
                a= teclado.nextInt();
                System.out.println("el tiempo ingresado es:");
                b = teclado.nextInt();
                c = a * b;
                System.out.println("la distancia calculada es:" + c);
            }
                break;

            case 2:
            {
                System.out.println("Ejercicio 2 seleccionado");
                System.out.println("ingrese su primer nota");
                a= teclado.nextInt();
                System.out.println("ingrese su seguna nota");
                b= teclado.nextInt();
                System.out.println("ingrese su tercer nota");
                c = teclado.nextInt();
                d = (a + b + c)/3;
                System.out.println("su promedio es:" + d);
            }
                break;
            case 3:
            {
                System.out.println("Ejercicio 3 seleccionado");
                System.out.println("ingrese respuestas gandas:");
                a = teclado.nextInt();
                System.out.println("ingrese respuestas incorrectas:");
                b = teclado.nextInt();
                System.out.println("ingrese respuestas en blanco:");
                c = teclado.nextInt();
                System.out.println("las respuestas en blanco son son:" + c);
                d = a * 4;
                System.out.println("los puntos de las respuestas correctas son:" + d);
                e = b *- 1;
                System.out.println("las respuestas incorrectas son:" + e);
                System.out.println("las respuestas finales son" + (e + d));
            }
                break;
            case 4:
            {
                System.out.println("Ejercicio 4 seleccionado");
                System.out.println("ingrese partidos ganados:");
                a = teclado.nextInt();
                System.out.println("ingrese partidos empatados:");
                b = teclado.nextInt();
                System.out.println("ingrese partidos perdidos:");
                c = teclado.nextInt();
                d = a * 3;
                System.out.println("los puntos de los partidos ganados son:" + d);
                e = b + 1;
                System.out.println("los puntos de los partidos empatados son:" + e);
                System.out.println("los puntos finales son" + (d + e));
            }
                break;
            case 5:
            {
                System.out.println("Ejercicio 5 seleccionado");
                System.out.println("ingrese las horas laboradas:");
                a = teclado.nextInt();
                 System.out.println("las horas taeifadas son:");
                b = teclado.nextInt();
                System.out.println("la planilla de sus horas son:" + (a * b));
            }
                break;
            case 6:
            {
                System.out.println("Ejercicio 6 seleccionado");
                System.out.println("ingrese lado a");
                a = teclado.nextInt();
                System.out.println("ingrese lado b");
                b = teclado.nextInt();
                System.out.println("ingrese lado c");
                c = teclado.nextInt();
                d = (a + b + c)/2;
                System.out.println("la longitud del semiperimetro es" + d);
                e = d * (d - a) * (d - b) * (d - c);
                System.out.println("AREA TOTAL:" + e);
                }
                break;
            case 7:
            {
                System.out.println("Ejercicio 7 seleccionado");
                    System.out.println("leer los Gigabyts:");
                    a = teclado.nextInt();
                    System.out.println("las Megabyts son:");
                    double z =  a *1.024;
                    System.out.println("los megabyts son:" + z);
                    b = (int) (z / 700)+1;
                    System.out.println("el numero de CDs son :" + b);
            }
                break;
            case 8:
            {
                System.out.println("Ejercicio 8 seleccionado");
                System.out.print("Ingrese la abscisa (x) de A: ");
                a = teclado.nextInt();
                System.out.print("Ingrese la ordenada (y) de A: ");
                b = teclado.nextInt();
                System.out.print("Ingrese la abscisa (x) de B: ");
                c = teclado.nextInt();
                System.out.print("Ingrese la ordenada (y) de B: ");
                d = teclado.nextInt();
                double D = Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));
                System.out.println("La distancia entre A y B es: " + D);
            }
                break;
            case 9:
            {
                System.out.println("Ejercicio 9 seleccionado");
                System.out.println("el año actual  es");
                a = teclado.nextInt();
                System.out.println("el año de nacimiento es");
                b= teclado.nextInt();
                c = a - b;
                System.out.println("su edad es: " + c);
                if (c > 17) {
                System.out.println("Debe solicitar su CUIL");
            } else {
                System.out.println("No debe solicitar su CUIL aún");
            }
            }
                break;
            case 10:
            {
                System.out.println("Ejercicio 10 seleccionado");
                System.out.print("Ingrese edad uno: ");
                a = teclado.nextInt();
                System.out.print("Ingrese la edad dos: ");
                b = teclado.nextInt();
                if (a > b) {
                System.out.println("La primera edad (" + a + ") es mayor que la segunda (" + b + ").");
            } else if (b > a) {
                System.out.println("La segunda edad (" + b + ") es mayor que la primera (" + a + ").");
            } 
            }
                break;
            case 11:
            {
                System.out.println("Ejercicio 11 seleccionado");
                System.out.print("Ingrese la produccion del lunes");
                a= teclado.nextInt();
                System.out.print("Ingrese la produccion del martes");
                b = teclado.nextInt();
                System.out.print("Ingrese la produccion del miercoles");
                c = teclado.nextInt();
                System.out.print("Ingrese la produccion del jueves");
                d = teclado.nextInt();
                System.out.print("Ingrese la produccion del viernes");
                e = teclado.nextInt();
                System.out.print("Ingrese la produccion del sabado");
                f = teclado.nextInt();
                g = (a + b + c + d + e + f);
                h = g/6;
                if(h >= 100){
                    System.out.println("recibira incentivos");
                }else{
                    System.out.println("no recibira incentivos");
                }
            }
            
                break;
            case 12:
            {
                System.out.println("Ejercicio 12 seleccionado");
                System.out.print("Ingrese el numero uno"); 
                a = teclado.nextInt();
                System.out.print("Ingrese el numero dos");
                b = teclado.nextInt();
                System.out.print("Ingrese el numero tres");
                c = teclado.nextInt();
                if(a > b && a > c){
                    System.out.println("el numero uno mayor es" + a);
                }else if(b > c){
        
                    System.out.println("el numero dos mayor es" + b);
                }else{
              
                    System.out.println("el numero tres mayor es" + c);
        
                }
            }
        
                break;
            case 13:
            {
                System.out.println("Ejercicio 13 seleccionado");
                        String TT;
                        System.out.print("Ingrese el primer lado: ");
                        a = teclado.nextInt();
                        System.out.print("Ingrese el segundo lado: ");
                        b = teclado.nextInt();
                        System.out.print("Ingrese el tercer lado: ");
                        c = teclado.nextInt();
                        if(a != b && b != c && a != c){
                            TT = "escaleno";
                        }else if(a == b && b == c){
                            TT = "equilatero";
                        }else{
                            TT ="isoseles";

                        }
                        System.out.println("el tipo de triangulo es " + TT);
            }
                break;
            case 14:
            {
                System.out.println("Ejercicio 14 seleccionado");
                System.out.print("Ingrese un número entero del 1 al 10: ");
                a =teclado.nextInt();
                switch (a) {
                    case 1:i = "I";break;
                    case 2:i = "II"; break;
                    case 3:i = "III";break;
                    case 4:i = "IV";break;
                    case 5:i = "V";break;
                    case 6:i = "VI";break;
                    case 7:i = "VII";break;
                    case 8:i = "VIII";break;
                    case 9:i = "IX";break;
                    case 10:i = "X";break;
                    default:i = "Número fuera de rango (1-10)";break;
        
                }
                System.out.println("Equivalente en romano: " + i);
            
            }
                break;
            case 15:
            {
                System.out.println("Ejercicio 15 seleccionado");
                double TB; 
                System.out.print("Ingrese el monto de venta: ");
                a = teclado.nextInt();
                if (a > 0 && a <= 1000) {
                    TB = a * 0.03;
                } else if (a > 1000 && a <= 5000) {
                    TB = a * 0.05;
                } else if (a > 5000 && a <= 20000) {
                    TB = a * 0.08;
                } else if (a > 20000) {
                    TB = a * 0.10;
                } else {
                    TB = 0;
                    System.out.println("El monto de venta debe ser mayor que 0.");}
                    if (a> 0) {
                        System.out.println("La bonificación correspondiente es: " + TB);
                    }
        }
                break;
            case 16:
            {
                System.out.println("Ejercicio 16 seleccionado");
                System.out.println("ingrese numero del 1 al 5");
                a =teclado.nextInt();
                switch (a) {
                    case 1: i = "A";break;
                    case 2: i = "B";break;
                    case 3: i = "c";break;
                    case 4: i = "D";break;
                    case 5: i = "E";break;
                    default: i ="valor incorrecto";break;
                }
                System.out.println("Resultado: " + i);
            }
                break;
            case 17:
            {
                System.out.println("Ejercicio 17 seleccionado");    
                System.out.print("Ingrese un número entero de dos cifras: ");
                a = teclado.nextInt();
                if (a >= 10 && a <= 99) {
                    b = a / 10;
                    c = a - (b * 10);
                    d = b;
                    e = c;
                    System.out.println("Decenas: " + d);
                    System.out.println("Unidades: " + e);
                } else {
                System.out.println("El número ingresado no es de dos cifras.");
                }
            }

                break;
            case 18:
        {
                System.out.println("Ejercicio 18 seleccionado");
                System.out.print("Ingrese un número entero diferente de cero: ");
                a = teclado.nextInt();
                b = a / 2;
                c = a - (b * 2);
                if (c == 0) {
                    i = "Es Par";
                } else {
                    i = "Es Impar";
                }
                System.out.println(i);
        }
                break;
            case 19:
            {
                System.out.println("Ejercicio 19 seleccionado");
                System.out.println("ingrese el numero");
                a = teclado.nextInt();
                for (int K = 1; K <= 4; K++) {
                    System.out.println(a);
                    a = a+ 2;
                }
            }
                break;
            case 20:
            {
                System.out.println("Ejercicio 20 seleccionado");
                System.out.print("Ingrese el número de empleados: ");
                a = teclado.nextInt();  // Número de empleados
                int L = 0;  // Suma total de sueldos
                double dLL;  // Promedio
                for (int K = 1; K <= a; K++) {      
                System.out.print("Ingrese el sueldo del empleado " + K + ": ");
                b = teclado.nextInt();
                L = L + b;
                }
                dLL = (double) L / a;
                System.out.println("El sueldo promedio es: " + dLL);
            }
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        
        
            } 
              teclado.close();
        }
 
    }

    
   
       
       
    




