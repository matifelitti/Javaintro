
package ej.pkg19.javaintro.extra;

import java.util.Scanner;

public class Ej19JavaintroExtra {

    public static void main(String[] args) {
                int t;
        System.out.println("Ingrese el tamaño de los vectores");
        Scanner leer = new Scanner(System.in);
        t = leer.nextInt();
        int[] v1 = new int[t];
        int[] v2 = new int[t];

        for (int i = 0; i < t; i++) {
            System.out.println("Ingrese el número de la posición " + i + " del vector 1");
            v1[i] = leer.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.print("[" + v1[i] + "] ");
        }

        System.out.println("");
        for (int i = 0; i < t; i++) {
            if (v1[i] != v2[i]) {
                System.out.println("Ingrese el número de la posición " + i + " del vector 2");
                v2[i] = leer.nextInt();
            }
            if (v1[i] == v2[i]) {
                System.out.println("Hay números repetidos");
                break;
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.print("[" + v2[i] + "] ");
        }

        System.out.println("");
    }
    
}
