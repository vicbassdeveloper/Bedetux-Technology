package mx.com.tech.bedutux.sentenciasdecontrol;

// Este es un comentario de una linea

/*
    Este es un comentario de varias lineas
*/

// Sintaxis para definir una clase:
// "Modificador de Acceso", "Palabra reservada class", "Nombre de la clase"
// Convencio de nombres: Empieza cada palabra con mayuscula.
public class Primitivos {
    public static void main(String[] args) {
        System.out.println("Repaso de los datos primitivos");

        // Sintaxis para definir una variable (Atributo o Campo)
        // Tipo de dato, nombre de la variable

        // Numeros enteros

        byte numero8Bits = 0;
        short numero16Bits = 0;
        int numero32bits = 0;
        long numero64bits = 0;

        // Numeros Flotantes o con punto decimal

        float numeroFlotante32Bits = 0.0f; // Puede almaenar numeros enteros
        double numeroFlotante64Bits = 0.0d;

        // Valore logicos

        boolean valor1bit = false;

        // Caracteres

        char caracter16Bits;

        System.out.println(numero8Bits);
        System.out.println(numero16Bits);
        System.out.println(numero32bits);
        System.out.println(numero64bits);

    }
}
