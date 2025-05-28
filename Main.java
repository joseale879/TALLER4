package ejercicios;

import java.util.Scanner;

public class Main {
   /**
 * @param args
 */
public static void main(String[] args) {

     Scanner teclado = new Scanner(System.in);
        int opcion,a,b,c,d,e,f,g,h,k;
        String i;
        double j,q,r;
        int l =0;
        int m =0;
        int nv = 0; 
        int nc = 0; 

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
                
                System.out.print("Ingrese el monto de venta: ");
                a = teclado.nextInt();
                if (a > 0 && a <= 1000) {
                    j = a * 0.03;
                } else if (a > 1000 && a <= 5000) {
                    j = a * 0.05;
                } else if (a > 5000 && a <= 20000) {
                    j = a * 0.08;
                } else if (a > 20000) {
                    j = a * 0.10;
                } else {
                    j = 0;
                    System.out.println("El monto de venta debe ser mayor que 0.");}
                    if (a> 0) {
                        System.out.println("La bonificación correspondiente es: " + j);
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
             
                for (int K = 1; K <= a; K++) {      
                System.out.print("Ingrese el sueldo del empleado " + K + ": ");
                b = teclado.nextInt();
                L = L + b;
                }
                j = (double) L / a;
                System.out.println("El sueldo promedio es: " + j);
            }
                break;

                case 21:
                {
                    for (k = 1; k <= 200; k++) {
                        System.out.println("Ingrese la edad:");
                         a = teclado.nextInt();
                         if (a < 18) {
                            l++;
                        } else {
                            m++;
                        }
                    }
        
                    System.out.println("Los menores son: " + l);
                    System.out.println("Los mayores son: " + m);


                }
                break;

                case 22:
                {

                    System.out.println("ingrese numero uno");
                        a = teclado.nextInt();

                    System.out.println("ingrese numero dos");
                        b = teclado.nextInt();

                    for(k = 1 ; k <= b ; k++){
                             m = m + a;
                    }

                    System.out.println("el producto es" + m);
                }
                break;

                case 23:
                {
                    for  ( k = 1 ; k < 10; k++ ){
                        a = k/2;
                        b = k - (a*2);
                        if (b  != 0 ){
                            System.out.print("El residuo es: " + b);
                        }
                    }   
                }
                break;

                case 24:
                {
                    while (l < 1000) {
                        System.out.println(l);
                        l = l * l + 1;  
                    }
                }
                break;

                case 25:
                {
                 String s = "V";
                    String t;

                    while (s.equalsIgnoreCase("V")) {
                    System.out.print("Ingrese una letra: ");
                    t = teclado.nextLine().toLowerCase(); 

                    switch (t) {
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                            s = "R";
                            break;
                        default:
                            s = "V";
                    break;
                        }
                    }
                System.out.println("Ingresaste una vocal. Fin del programa.");    
                }
                break;

                case 26:
                {
                    int uno = 0;
                    int dos = 1;
                    int tres = uno + dos;

                    System.out.println(uno);
                    System.out.println(dos);

                    while (tres < 100000) {
                    System.out.println(tres);
                     uno = dos;
                        dos = tres;
                    tres = uno + dos;
                    }
                }
                break;

                case 27:
                {
                                System.out.print("Ingrese el primer número: ");
                                a = teclado.nextInt();

                                System.out.print("Ingrese el segundo número: ");
                                b = teclado.nextInt();
                                teclado.nextLine(); // Limpia el buffer

                                System.out.print("Ingrese la operación (+, -, *, ^): ");
                                i = teclado.nextLine();  

                                

                                    switch (i) {
                                        case "+":
                                            r = a + b;
                                        break;
                                        case "-":
                                            r = a - b;
                                        break;
                                        case "*":
                                            r = a * b;
                                        break;
                                        case "^":
                                            r = Math.pow(a, b);
                                        break;
                                        default:
                                        r = 0;
                                        System.out.println("Operación no válida.");
                                    }
                            System.out.println("La respuesta es: " + r);
                }
                break;

                case 28:
                {


                    for (int p = 1; p <= 10; p++) {
                    System.out.print("Ingrese una letra: ");
                        char letra = teclado.next().toLowerCase().charAt(0);

                        if (Character.isLetter(letra)) {
                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                nv++;
                                break;
                            default:
                                nc++;
                                break;
                            }
                        } else {
                            System.out.println("Carácter no válido Intente de nuevo.");
            
                            }
                    }

                        System.out.println("Número de vocales: " + nv);
                    System.out.println("Número de consonantes: " + nc);
                }

                break;

                case 29:
                {
                int C1 = 0, C2 = 0, C3 = 0, CB = 0;
                        int VE;

                        for (int p = 1; p <= 160; p++) {
                            System.out.print("Ingrese el voto #" + p + " (1, 2, 3 para candidatos, otro para nulo/blanco): ");
                            VE = teclado.nextInt();

                            switch (VE) {
                                case 1 -> C1++;
                                case 2 -> C2++;
                                case 3 -> C3++;
                                default -> CB++;
                            }
                        }

                        int ganador;
                        if (C1 > C2 && C1 > C3) {
                            ganador = 1;
                        } else if (C2 > C1 && C2 > C3) {
                            ganador = 2;
                        } else if (C3 > C1 && C3 > C2) {
                            ganador = 3;
                        } else {
                            ganador = 0; // Empate o sin mayoría clara
                        }

                        System.out.println("El ganador es: " + (ganador == 0 ? "Empate o Sin mayoría clara" : "Candidato " + ganador));
                        System.out.println("Votos nulos o en blanco: " + CB);
                                }
                                break;

            case 30:
            {
                    System.out.print("Ingrese el primer número: ");
                    j = teclado.nextDouble();

                    System.out.print("Ingrese el segundo número: ");
                    q = teclado.nextDouble();

                    double suma = j + q;
                    r = suma / 2;

                    System.out.println("El promedio de ambos números es: " + r);
            }
            break;

            case 31:
            {
                    System.out.print("Ingrese un número del 1 al 12: ");
                    a = teclado.nextInt();

                    switch (a) {
                        case 1 -> System.out.println("Enero");
                        case 2 -> System.out.println("Febrero");
                        case 3 -> System.out.println("Marzo");
                        case 4 -> System.out.println("Abril");
                        case 5 -> System.out.println("Mayo");
                        case 6 -> System.out.println("Junio");
                        case 7 -> System.out.println("Julio");
                        case 8 -> System.out.println("Agosto");
                        case 9 -> System.out.println("Septiembre");
                        case 10 -> System.out.println("Octubre");
                        case 11 -> System.out.println("Noviembre");
                        case 12 -> System.out.println("Diciembre");
                        default -> System.out.println("Número inválido. Debe estar entre 1 y 12.");
                    }
            }
            break;

            case 32:
            {        
                    System.out.print("Ingrese un número entero distinto de cero: ");
                        a = teclado.nextInt();
                    while (a == 0);
                    System.out.println("Los divisores de " + a + " son:");

       
                for (int K = 1; K <= Math.abs(a); K++) {
                        if (a % K == 0) {
                            System.out.println(K);
                    }
                }
            }
                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
        
        
            } 
              teclado.close();
        }
 
    }

    
   
       
       
    




