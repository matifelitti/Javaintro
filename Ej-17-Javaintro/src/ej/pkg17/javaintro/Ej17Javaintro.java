package ej.pkg17.javaintro;

import java.util.Random;
import java.util.Scanner;

public class Ej17Javaintro {

    public static void main(String[] args) {
        int n, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];

        Random numero = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = numero.nextInt(20000);
            if (vector[i] < 10) {
                cont1++;
            } else if (vector[i] < 100) {
                cont2++;
            } else if (vector[i] < 1000) {
                cont3++;
            } else if (vector[i] < 10000) {
                cont4++;
            } else {
                cont5++;
            }
        }
        System.out.println("Cantidad de números de 1 cifra: " + cont1);
        System.out.println("Cantidad de números de 2 cifras: " + cont2);
        System.out.println("Cantidad de números de 3 cifras: " + cont3);
        System.out.println("Cantidad de números de 4 cifras: " + cont4);
        System.out.println("Cantidad de números de 5 cifras: " + cont5);

    }
}
