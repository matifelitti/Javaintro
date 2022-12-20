package ej.pkg5.javaintro;

import java.util.Scanner;

public class Ej5Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número...");
        numero = leer.nextInt();
        System.out.println("El doble del número es: " + (numero * 2) + " el triple es: " + (numero * 3)
                + " la raiz cuadrada es: " + Math.round(Math.sqrt(numero)));
    }

}
