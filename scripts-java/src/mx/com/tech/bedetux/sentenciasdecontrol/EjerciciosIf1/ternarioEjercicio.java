package mx.com.tech.bedetux.sentenciasdecontrol.EjerciciosIf1;

import java.util.Scanner;

/*
* Ejercicio

* Realizar dos programas en donde dependiendo el año de nacimiento defina si el usuario puede votar o no en los distintos paises (mencionados en la lista), en caso de no poder votar, el programa debera pintar
* No puedes votar debido a que te faltan (cálculo de edad faltante en años) años.

* Consideraciones:

* México: puede votar a los 18 o más años.
* EUA: puede votar a los 21 o más años.
* Irán​ e Indonesia​ : puede votar a los 13 o más años.
* Corea del Norte​: puede votar a los 17 años o más.
* Taiwán: puede votar a los 20 años o más.
*/
public class ternarioEjercicio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pais;

        System.out.println("Programa que le ingrasas un pais y tu edad. \nTe dira si ya tienes edad para votar en el pasi seleccionado \n" +
                "Los paises que puedes consultar son: \nMéxico, USA, Irán, Corea, Taiwán\n Ingresa el pais que deseas consultar si eres apto para votar o no");
        pais = scan.nextLine().toLowerCase();
        System.out.println("Ingresa tu edad en numeros enteros");
        int edad = scan.nextInt();

        System.out.println(
     (pais.equals("méxico") || pais.equals("mexico")) ?
             ( edad >= 18) ? "Ya tienes edad para votar!!!" : "Te faltan " + (18 - edad) + " años para poder votar" : (pais.equals("usa")) ? (edad >= 21) ?
             "Ya tienes edad para votar!!!" : "Te faltan " + (21 - edad) + " años para poder votar" : (pais.equals("irán") || pais.equals("iran") || pais.equals("indonesia")) ?
             (edad >= 13) ? "Ya tienes edad para votar!!!" : "Te faltan " + (13 - edad) + " años para poder votar" : (pais.equals("corea")) ? (edad >= 17) ?
             "Ya tienes edad para votar!!!" : "Te faltan " + (17 - edad) + " años para poder votar" : (pais.equals("taiwán") || pais.equals("taiwan")) ? (edad >= 20) ?
             "Ya tienes edad para votar!!!" : "Te faltan " + (20 - edad) + " años para poder votar" : "El pais seleccionado es incorrecto, intenta de nuevo");
    }
}





