package mx.com.tech.bedutux.sentenciasdecontrol.EjercicioSwitch;

import java.util.Scanner;

/*Elaborar un programa que realice la opción seleccionada de acuerdo a lo siguiente:

a.- Área del triángulo (Solicitar base y altura)

b.- Área del Cuadrado (Solicitar lado)

c.- Área del Círculo (Solicitar radio)

d.- Área del Rectángulo (Solicitar base y altura)

 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int h, b, r, l;
         char opcion = 'y';


         while (opcion == 'y') {
             System.out.println("Programa que puede realizar las siguientes operaciones:\n a.- Área del triángulo\n " +
                     "b.- Área del Cuadrado \n c.- Área del Círculo \n d.- Área del Rectángulo ");
             System.out.println("Selecciona una letra del menu de opciones");
             char operacion= scanner.next().toLowerCase().charAt(0);

             System.out.println("Ingresa los datos:");
             switch (operacion) {
                 case 'a':
                     System.out.println("Area del Triangulo");
                     System.out.println("Base");
                     b = scanner.nextInt();
                     scanner.skip("\n");
                     System.out.println("Altura");
                     h = scanner.nextInt();
                     scanner.skip("\n");

                     System.out.println(b*h/2);
                    break;
                case 'b':
                    System.out.println("Area del Cuadrado");
                    System.out.println("Lado");
                    l = scanner.nextInt();
                    scanner.skip("\n");
                    System.out.println(l*l);
                    break;
                case 'c':
                    System.out.println("Area del Círculo");
                    System.out.println("Radio");
                    r = scanner.nextInt();
                    scanner.skip("\n");
                    System.out.println(Math.PI * (r*r));
                    break;
                case 'd':
                    System.out.println("Area del Rectangulo");
                    System.out.println("Base");
                    b = scanner.nextInt();
                    scanner.skip("\n");
                    System.out.println("Altura");
                    h = scanner.nextInt();
                    scanner.skip("\n");
                    System.out.println(b*h);
                    break;
                 default:
                     System.out.println("Operacion invalida intenta nuevamente");
                     break;
             }

             System.out.println("Deseas realizar otra operacion");
             opcion = scanner.next().toLowerCase().charAt(0);
         }

    }
}
