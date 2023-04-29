package mx.com.tech.bedutux.sentenciasdecontrol.ejerciciosIf2;

import java.util.Scanner;

public class ternarioPrograma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al menu para registro de usuarios");
        System.out.println("Ingresa una opcion\n1.-Nuevo Usuario\n2.-Eliminar Usuario");
        int opcion = scanner.nextInt();
        scanner.skip("\n");
        String respuesta= opcion == 1 ? "Usuario Registrado" : opcion == 2 ? "Usuario eliminado" : "La opcion ingresada no es valida, elige 1 para agregar y 2 para eliminar";

        System.out.println(respuesta);
    }
}
