package mx.com.tech.bedutux.ciclos;

/*
Realizar el factorial de un numero dado (Ingresado vía teclado)
-Incluir los tres ciclos vistos durante la sesión (for, while, do-while)
 */

import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char opcion = 'y';

        while (opcion == 'y') {

            System.out.println("Programa que solicita un numero y devuelve el fatorial del mismo");
            System.out.println("Escribe el numero del cual quieres calcular el factorial");

        Double num = scanner.nextDouble();
        scanner.skip("\n");

        Double factorial = 1.0;
        int i = 1;
        while (i <= num) {
            factorial = factorial * i;

            System.out.print(i +": "+ factorial+". ");
            i++;
        }
            System.out.println("\nEl factorial del numero " + num + " es: " + factorial);
            System.out.println("Intentar de nuevo ecribe 'y' , o 'n' para salir");
            opcion = scanner.next().toLowerCase().charAt(0);
        }
    }

}

