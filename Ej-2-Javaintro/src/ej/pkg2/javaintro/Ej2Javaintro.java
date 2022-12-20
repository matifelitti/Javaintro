package ej.pkg2.javaintro;

import java.util.Scanner;

public class Ej2Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();
        System.out.println("¡Hola! " + nombre);
    }

}
