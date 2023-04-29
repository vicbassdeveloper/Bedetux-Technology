package mx.com.tech.bedutux.ciclos;

import java.util.Scanner;

public class numParImpWhile {
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

            while (i <= num) {
                System.out.print(i + " ");
                i += 2;
            }

            System.out.println("\n\nIntentar de nuevo ecribe 'y' , o 'n' para salir");
            opcion = scanner.next().toLowerCase().charAt(0);

        }
    }
}
