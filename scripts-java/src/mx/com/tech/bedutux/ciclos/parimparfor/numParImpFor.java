package mx.com.tech.bedutux.ciclos.parimparfor;

import java.util.Scanner;

/*
Realizar la discriminación de números pares e impares, (Incluir los tres ciclos vistos durante la sesión (for, while, do-while)
-Impresión de número pares del 1 al 100
-Impresión de número impares del 1 al 100
 */
public class numParImpFor {
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
            for (int i = parImp; i <= num; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println("\n\nIntentar de nuevo ecribe 'y' , o 'n' para salir");
            opcion = scanner.next().toLowerCase().charAt(0);

        }
    }
}