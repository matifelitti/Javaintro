package ej.pkg24.javaintro.extra;

import java.util.Scanner;

public class Ej24JavaintroExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int termino;
        System.out.println("Ingresar término: ");
        termino = leer.nextInt();
        System.out.println(Fibonacci(termino));
    }

    public static String Fibonacci(int t) {
        String texto = "";
        int[] vector = new int[t];
        int m = 1, n = 1, k;
        for (int i = 0; i < t; i++) {

            if (i == 0) {
                vector[i] = m;
                texto += String.valueOf(vector[i]);
            } else {
                k = m + n;
                m = n;
                n = k;
                vector[i] = m;
                texto += " ," + String.valueOf(vector[i]);
            }
        }
        return texto;
    }
}
