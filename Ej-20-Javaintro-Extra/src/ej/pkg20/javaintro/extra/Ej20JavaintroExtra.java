package ej.pkg20.javaintro.extra;

import java.util.Scanner;

public class Ej20JavaintroExtra {

    public static void main(String[] args) {
        int t, i = 0;
        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        t = leer.nextInt();
        int[] vector;
        vector = new int[t];

        rellenar(t, i, vector);
        imprimir(t, i, vector);

    }

    private static void rellenar(int t, int i, int[] vector) {
        for (i = 0; i < t; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    private static void imprimir(int t, int i, int[] vector) {
        for (i = 0; i < t; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
}
