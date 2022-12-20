package ej.pkg13.javaintro;

import java.util.Scanner;

public class Ej13Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una dimension : ");
        int n = leer.nextInt();
        String[][] matriz = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || (j == 0) || (j == (n - 1))) {
                    matriz[i][j] = "*";
                } else {
                    matriz[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
