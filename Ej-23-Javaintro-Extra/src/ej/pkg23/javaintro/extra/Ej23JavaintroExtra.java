package ej.pkg23.javaintro.extra;

import java.util.Scanner;

public class Ej23JavaintroExtra {

    public static void main(String[] args) {

        int acu = 0, numcaracteres;

        do {
            System.out.println("Ingrese una palabra que tenga 3 caracteres de mínimo y 5 de máximo");
            Scanner leer = new Scanner(System.in);
            String palabra = leer.nextLine();
            acu++;
            numcaracteres = palabra.length();
            if (numcaracteres < 3 || numcaracteres > 5) {
                System.out.println("Error! Las palabras deben ser de 3 a 5 caracteres");
                acu--;
            }
        } while (acu < 5);

        int[][] matriz = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println("");

    }

}
