package mx.com.tech.bedutux.sentenciasdecontrol.EjerciciosIf.registroif;

import java.util.Scanner;

/*
* Realizar un menu que al ingresar una opcion nos de la bienvenida , ingrese usuario nuevo, borrar usuario y opcion invalida
 */
public class ifPrograma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al menu para registro de usuarios");
        System.out.println("Ingresa una opcion\n1.-Nuevo Usuario\n2.-Eliminar Usuario");
        int opcion = scanner.nextInt();
        scanner.skip("\n");
        if (opcion == 1) {

            System.out.println("Usuario Registrado");
        } else if (opcion == 2) {
            System.out.println("Usuario eliminado");
        } else {
            System.out.println("La opcion ingresada no es valida, elige 1 para agregar y 2 para eliminar");
        }
    }
}
