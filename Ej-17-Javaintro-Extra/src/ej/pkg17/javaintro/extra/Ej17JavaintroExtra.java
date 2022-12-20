package ej.pkg17.javaintro.extra;

import java.util.Scanner;

public class Ej17JavaintroExtra {

    public static void main(String[] args) {

        int n;
        System.out.println("Ingrese un número");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();

        if (esprimo(n)) {
            System.out.println("El número " + n + " es primo");
        } else {
            System.out.println("El número " + n + " no es primo");
        }

    }

    public static boolean esprimo(int n) {
        if (n <= 1) {
            return false;
        }

        int cont = 0;
        int divisor;
        for (divisor = (int) Math.sqrt(n); divisor > 1; divisor--) {
            if (n % divisor == 0) {
                cont += 1;
            }
        }

        if (cont >= 1) {
            return false;
        } else {
            return true;
        }
    }
}
