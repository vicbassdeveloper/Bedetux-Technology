package mx.com.tech.bedutux.array;

/*
-Pedir vía teclado el tamaño de un array (N posiciones)
-Almacenar números enteros dentro de cada posición (generados al azar o solicitados desde teclado)
-Generar un arreglo para números pares y otro para números impares (clasificar en números pares e impares el array original)
-Pintar los dos arreglos especificando los números pares e impares

 */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero;
        ArrayList<Integer> arrPar = new ArrayList<>();
        ArrayList<Integer> arrNon= new ArrayList<>();

        System.out.println("Escribe el tamaño de array");

        int tamArr = scanner.nextInt();
        scanner.skip("\n");

        for (int i = 0; i < tamArr; i++) {
            System.out.println("Escribe un numero");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                arrPar.add(numero);
            } else {
                arrNon.add(numero);
            }

        }
        System.out.println("Los numeros  pares  son: "+arrPar+"\nLos numeros impares son: "+arrNon);

    }
}
