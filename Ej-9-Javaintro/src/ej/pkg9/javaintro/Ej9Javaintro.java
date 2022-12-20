package ej.pkg9.javaintro;

import java.util.Scanner;

public class Ej9Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese un frase");
        frase = leer.next();
        if (frase.substring(0, 1).equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
