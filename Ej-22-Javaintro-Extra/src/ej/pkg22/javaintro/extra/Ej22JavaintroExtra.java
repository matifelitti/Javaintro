package ej.pkg22.javaintro.extra;

import java.util.Scanner;

public class Ej22JavaintroExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el largo de la matriz");
        int l = leer.nextInt();
        System.out.println("Ingrese la altura de la matriz");
        int a = leer.nextInt();
        int[][] matriz = new int[l][a];
        int suma = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < a; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma = suma + matriz[i][j];
            }
        }

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("La suma de los elementos de la matriz da como resultado " + suma);
    }

}
