package ipc1.examenfinal;
import java.util.Scanner;   

/**
 * Examen final - Introducción a la programación 1
 * @author Giovanni Saul Concohá Cax
 * carné: 202100229
 */
public class IPC1ExamenFinal {
    static Scanner num = new Scanner(System.in);
    static Scanner num2 = new Scanner(System.in);
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        do {
            System.out.println("\n------------ \n M E N Ú \n-----------");
            System.out.println("1. - Ejercicio 1");
            System.out.println("2. - Ejercicio 2");
            System.out.println("3. - Ejercicio 3");
            System.out.println("4. - Salir.");
            System.out.print("Ingrese el número de la opción: ");
            int entradaMenu = entrada.nextInt();

            switch (entradaMenu) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    System.out.println("Adiós\n");
                    salir = true;
                    break;
                default:
                    System.out.println("¡¡¡ OPCIÓN INVALIDA !!!\n");
            }
        } while (!salir);

    }//fin voidMain MENU

    static public void Ejercicio1(){
        System.out.println("-----------\nEjercicio 1\n-----------");
        System.out.print("Ingrese el 1er número: ");
        double numero1 = num.nextDouble();

        System.out.print("Ingrese el 2do número: ");
        double numero2 = num.nextDouble();
        
        if(numero1 > numero2){
            System.out.println("el número: " + numero1 + " es el mayor de ambos números");
        }else{
            System.out.println("el número: " + numero2 + " es el mayor de ambos números");
        }
    }
    
    static public void Ejercicio2() {
        System.out.println("-----------\nEjercicio 2\n-----------");
        System.out.print("Ingrese un número impar: ");
        int numero = num.nextInt();

        if (esPar(numero) == 0) {
            System.out.println("Unicamente ingresar números Impares");
            Ejercicio2();
        } else {
            int columnas = numero;
            for (int alto = 1; alto <= Math.ceil((float) columnas / 2); alto++) {
                //Espacios en blanco
                for (int blancos = 1; blancos <= columnas - alto; blancos++) {
                    System.out.print(" ");
                }
                //Asteriscos
                for (int asteriscos = 1; asteriscos <= (alto * 2) - 1; asteriscos++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static int esPar(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return numero;
        }
    }

    static public void Ejercicio3() {
        System.out.println("-----------\nEjercicio 3\n-----------");

    }

}
