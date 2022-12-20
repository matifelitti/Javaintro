package ej.pkg3.javaintro;

import java.util.Scanner;

public class Ej3Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra = leer.nextLine();
        System.out.println("La palabra en mayusculas: " + (palabra.toUpperCase()));
        System.out.println("La palabra en minusculas: " + (palabra.toLowerCase()));
    }

}
