package ej.pkg18.javaintro.extra;

import java.util.Scanner;

public class Ej18JavaintroExtra {

    public static void main(String[] args) {

        int t;
        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        t = leer.nextInt();
        int[] vector;
        vector = new int[t];
        int suma = 0;

        for (int i = 0; i < t; i++) {
            System.out.println("Ingrese el número de la posición" + i);
            int n = leer.nextInt();
            suma = suma + n;
        }

        for (int i = 0; i > t; i++) {
            System.out.print("[" + vector[i] + "] ");
        }

        System.out.println("La suma de los números del vector da como resultado " + suma);
    }
}
