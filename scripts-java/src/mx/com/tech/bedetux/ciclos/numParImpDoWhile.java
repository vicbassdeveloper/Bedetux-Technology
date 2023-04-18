package mx.com.tech.bedetux.ciclos;

import java.util.Scanner;

public class numParImpDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion = 'y';

        while (opcion == 'y') {
            System.out.println("Programa que imprime numeros pares o impares");
            System.out.println("Elige si quieres que el numero sea \n 1.Par\n 2.Impar");
            int num = 100;
            int parImp = scanner.nextInt();
            scanner.skip("\n");
            parImp = parImp == 1 ? 0 : 1;
            int i = parImp;

            do {
                System.out.print(i + " ");
                i += 2;
            } while (i <= num);

            System.out.println("\n\nIntentar de nuevo ecribe 'y' , o 'n' para salir");
            opcion = scanner.next().toLowerCase().charAt(0);

        }
    }
}
