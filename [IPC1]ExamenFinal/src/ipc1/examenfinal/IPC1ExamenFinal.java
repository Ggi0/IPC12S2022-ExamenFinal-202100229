package ipc1.examenfinal;
import java.util.Scanner;   

/**
 * Examen final - Introducción a la programación 1
 * @author Giovanni Saul Concohá Cax
 * carné: 202100229
 */
public class IPC1ExamenFinal {
    static Scanner num1 = new Scanner(System.in);
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
        
    }
    
    static public void Ejercicio2(){
        System.out.println("-----------\nEjercicio 2\n-----------");
        
    }
    
    static public void Ejercicio3(){
        System.out.println("-----------\nEjercicio 3\n-----------");
        
    }
    
}
