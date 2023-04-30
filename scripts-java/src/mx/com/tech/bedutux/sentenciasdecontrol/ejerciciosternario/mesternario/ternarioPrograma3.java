package mx.com.tech.bedutux.sentenciasdecontrol.ejerciciosternario.mesternario;

import java.util.Scanner;

public class ternarioPrograma3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que al ingresar un numero nos diga el mes que le corresponde \n " +
                "y en caso de que sea incorrecto el numero nos diga numero invalido");

        System.out.println("EScribe un numero entre 1 y 12");
        int mes = scanner.nextInt();

        String queMes = mes == 1 ? "Enero" : mes == 2 ? "Febrero" : mes == 3 ? "Marzo" : mes == 4 ? "Abril" : mes == 5 ? "Mayo" :
                mes == 6 ? "Junio" : mes == 7 ? "Julio" : mes == 8 ? "Agosto" : mes == 9 ? "Septiembre"
                        : mes == 10 ? "Octubre" : mes == 11 ? "Noviembre" : mes == 12 ? "Diciembre" : "Numero invalido";

        System.out.println(queMes);
    }
}
