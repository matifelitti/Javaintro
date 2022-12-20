package ej.pkg9.javaintro.extra;

import java.util.Scanner;

public class Ej9JavaintroExtra {

    public static void main(String[] args) {
        int dividendo, divisor, cociente = 0;
        System.out.println("Ingrese un número entero mayor a 1");
        Scanner leer = new Scanner(System.in);
        dividendo = leer.nextInt();
        System.out.println("Ingrese otro número para simular división con restas");
        divisor = leer.nextInt();

        do {
            dividendo = dividendo - divisor;
            cociente++;
        } while (divisor < dividendo);

        System.out.println("Dado que " + dividendo % divisor + " es menor a " + divisor + " : el residuo es " + dividendo % divisor + " y el cociente es " + cociente);
    }

}
