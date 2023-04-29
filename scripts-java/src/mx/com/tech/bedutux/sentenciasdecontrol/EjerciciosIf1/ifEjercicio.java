package mx.com.tech.bedutux.sentenciasdecontrol.EjerciciosIf1;

import java.util.Scanner;

/*
* Ejercicio

* Realizar dos programas en donde dependiendo el año de nacimiento defina si el usuario puede votar o no en los distintos paises (mencionados en la lista), en caso de no poder votar, el programa debera pintar
No puedes votar debido a que te faltan (cálculo de edad faltante en años) años.

Consideraciones:

México: puede votar a los 18 o más años.
EUA: puede votar a los 21 o más años.
Irán​ e Indonesia​ : puede votar a los 13 o más años.
Corea del Norte​: puede votar a los 17 años o más.
Taiwán: puede votar a los 20 años o más.
* */

public class ifEjercicio {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);
        String pais;

        System.out.println("Programa que le ingrasas un pais y tu edad. \nTe dira si ya tienes edad para votar en el pasi seleccionado \n");
        System.out.println("Los paises que puedes consultar son: \nMéxico, USA, Irán, Corea, Taiwán\n");
        System.out.println("Ingresa el pais que deseas consultar si eres apto para votar o no");
        pais = scanStr.nextLine().toLowerCase();
        System.out.println("Ingresa tu edad en numeros enteros");
        int edad = scanNum.nextInt();


        if (pais.equals( "méxico" ) || pais.equals("mexico") ) {
            if (edad >= 18) { System.out.println("Ya tienes edad para votar!!!");
            } else { System.out.println("Te faltan " + (18 - edad) + " años para poder votar"); }
        } else if (pais.equals( "usa") ) {
            if (edad >= 21) { System.out.println("Ya tienes edad para votar!!!");
            } else { System.out.println("Te faltan " + (21 - edad) + " años para poder votar"); }
        } else if (pais.equals( "irán" ) || pais.equals( "iran" ) || pais.equals( "indonesia" ))  {
            if (edad >= 13) { System.out.println("Ya tienes edad para votar!!!");
            } else { System.out.println("Te faltan " + (13 - edad) + " años para poder votar"); }
        } else if (pais.equals( "corea" ) ) {
            if (edad >= 17) { System.out.println("Ya tienes edad para votar!!!");
            } else { System.out.println("Te faltan " + (17 - edad) + " años para poder votar"); }
        } else if (pais.equals( "taiwán" ) || pais.equals( "taiwan" ) ) {
            if (edad >= 20) { System.out.println("Ya tienes edad para votar!!!");
            } else { System.out.println("Te faltan " + (20 - edad) + " años para poder votar"); }
        } else {
            System.out.println("El pais seleccionado es incorrecto, intenta de nuevo"); }
    }
}
