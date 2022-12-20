package ej.pkg11.javaintro.extra;

import java.util.Scanner;

public class Ej11JavaintroExtra {

    public static void main(String[] args) {

        int n, cifras = 0;
        System.out.println("Introduce un número entero: ");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        while (n != 0) {
            n = n / 10;
            cifras++;
        }
        System.out.println("El número tiene " + cifras + " cifras");
    }

}
