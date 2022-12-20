package ej.pkg7.javaintro;

import java.util.Scanner;

public class Ej7Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese un frase");
        frase = (leer.next().toLowerCase());
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }

    }
}
