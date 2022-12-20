package ej.pkg8.javaintro;

import java.util.Scanner;

public class Ej8Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese un frase");
        frase = leer.next();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }

    }
}
