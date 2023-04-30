package mx.com.tech.bedutux.sentenciasdecontrol.EjerciciosIf.aprobadoif;

import java.util.Scanner;

/*
* Realizar un programa que al ingresar 3 calificaciones nos de el promedio en caso de que sea menos a 7 este este reprobado
y en caso de que sea 7 a 10 se aprobatorio pero si se pasa la calificacion de 10 nos mande un error
*/
public class ifPrograma1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa te dice si haz aprobado o no");

        System.out.println("Ingresa calificacion1");
        float calificacion1 = scanner.nextFloat();

        System.out.println("Ingresa calificacion2");
        float calificacion2 = scanner.nextFloat();

        System.out.println("Ingresa calificacion3");
        float calificacion3 = scanner.nextFloat();

        float promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        System.out.println("Tu promedio es de:" + promedio);


        if (promedio < 7) {
            System.out.println("Haz reprobado");
        } else {
            System.out.println("Aprobaste!!!");
        }

    }
}
