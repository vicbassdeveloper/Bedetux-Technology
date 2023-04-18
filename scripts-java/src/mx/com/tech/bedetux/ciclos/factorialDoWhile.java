package mx.com.tech.bedetux.ciclos;

import java.util.Scanner;

public class factorialDoWhile {
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
            do {
                factorial = factorial * i;

                System.out.print(i + ": " + factorial+". ");
                i++;
            } while (i <= num);


            System.out.println("\nEl factorial del numero " + num + " es: " + factorial);
            System.out.println("Intentar de nuevo ecribe 'y' , o 'n' para salir");
            opcion = scanner.next().toLowerCase().charAt(0);
        }
    }
}
