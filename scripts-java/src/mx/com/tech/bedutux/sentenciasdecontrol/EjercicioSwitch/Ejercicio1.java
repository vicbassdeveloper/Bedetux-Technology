package mx.com.tech.bedutux.sentenciasdecontrol.EjercicioSwitch;

import java.util.Scanner;

/*
* Ingresar 2 números y luego un carácter indicando la operación a realizar (+,-,*,/) y reportar el resultado de la operación.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa que al ingresar 2 números y luego un carácter indicando la operación a realizar (+,-,*,/) y reportar el resultado de la operación.");

        char pregunta = 'y';

        while (pregunta == 'y') {


            System.out.println("Seleciona un numero");
            int num1 = scanner.nextInt();
            System.out.println("Seleciona un numero");
            int num2 = scanner.nextInt();
            System.out.println("Selecciona un operador (+,-,*,/)");
            char operacion = scanner.next().charAt(0);

            switch (operacion) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Desea realizar otra operacion?");
            pregunta = scanner.next().toLowerCase().charAt(0);
        }
    }
}


