package mx.com.tech.bedutux.sentenciasdecontrol.EjerciciosIf.mesif;

import java.util.Scanner;

/*
* Realizar un programa que al ingresar un numero nos diga el mes que le corresponde
y en caso de que sea incorrecto el numero nos diga numero invalido
*/
public class ifPrograma3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa que al ingresar un numero nos diga el mes que le corresponde\n" +
                "y en caso de que sea incorrecto el numero nos diga numero invalido");

        System.out.println("Ingresa un numero del 1 al 12");
        int mes = scanner.nextInt();

        if (mes == 1) {
            System.out.println("Enero");
        } else if (mes == 2) {
            System.out.println("Febrero");
        } else if (mes == 3) {
            System.out.println("Marzo");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Mayo");
        } else if (mes == 6) {
            System.out.println("Junio"  );
        } else if (mes == 7) {
            System.out.println("Julio");
        } else if (mes == 8) {
        System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Septiembre");
        } else if (mes == 10) {
            System.out.println("Octubre");
        } else if (mes == 11) {
            System.out.println("Noviembre");
        }
        else {
            System.out.println("Numero Invalido");
        }
    }
}
