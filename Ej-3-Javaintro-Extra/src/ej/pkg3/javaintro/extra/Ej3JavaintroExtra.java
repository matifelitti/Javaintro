package ej.pkg3.javaintro.extra;

import java.util.Scanner;

public class Ej3JavaintroExtra {

    public static void main(String[] args) {
        String letra;
        System.out.println("Ingrese una letra");
        Scanner leer = new Scanner(System.in);
        letra = leer.nextLine();

        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
            System.out.println("Se ha detectado una vocal");
        } else {
            System.out.println("No se ha detectado una vocal");
        }
    }

}
