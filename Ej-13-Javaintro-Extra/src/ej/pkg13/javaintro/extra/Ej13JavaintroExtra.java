package ej.pkg13.javaintro.extra;

import java.util.Scanner;

public class Ej13JavaintroExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la escalera: ");
        n = leer.nextInt();

        int[][] esc = new int[n][n];

        //Cada iteracion n se reduce hasta llegar a 0
        // para recorrer todas las filas desde n-1 hasta 0.
        // En el bucle for se aumenta en 1 el valor
        // de n en cada iteración para que recorra correctamente
        // todas las columnas.
        while (n >= 0) {
            n--;
            for (int i = 0; i < n + 1; i++) {
                esc[n][i] = i + 1;
            }
        }

        for (int i = 0; i < esc.length; i++) {
            for (int j = 0; j < esc[0].length; j++) {
                if (esc[i][j] != 0) {
                    System.out.print(" " + esc[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}
