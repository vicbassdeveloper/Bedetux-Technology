package mx.com.tech.bedutux.sentenciasdecontrol.ejerciciosIf2;
import java.util.Scanner;
public class ternarioPrograma1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa te dice si haz aprobado o no\nIngresa calificacion1");
        float calificacion1 = scanner.nextFloat();

        System.out.println("Ingresa calificacion2");
        float calificacion2 = scanner.nextFloat();

        System.out.println("Ingresa calificacion3");
        float calificacion3 = scanner.nextFloat();

        float promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("Tu promedio es de:" + promedio);


        String resultado = promedio < 7 ? "Haz reprobado" :  "Aprobaste!!!";

        System.out.println(resultado);

    }
}
