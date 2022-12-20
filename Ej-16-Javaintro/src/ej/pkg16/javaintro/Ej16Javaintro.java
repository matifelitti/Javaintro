package ej.pkg16.javaintro;

import java.util.Random;
import java.util.Scanner;

public class Ej16Javaintro {

    public static void main(String[] args) {
        int n;
        int[] vector;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        vector = new int[n];

        Random numero = new Random();

        for (int i = 0; i < n; i++) {
            vector[i] = numero.nextInt(5);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vector[i] + " ]");
        }

        System.out.println("");
        System.out.println("Ingrese un número a buscar");
        int num = leer.nextInt();
        int cont = 0;

        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                cont++;
                System.out.println("El número ingresado se encontro en la posición: " + i);
            }
        }
        if (cont == 0) {
            System.out.println("El número no se encontro");

        } else {
            System.out.println("El número de veces encontrado es = " + cont);
        }
    }
}
