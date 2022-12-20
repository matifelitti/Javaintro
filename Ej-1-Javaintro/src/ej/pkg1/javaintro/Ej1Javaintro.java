package ej.pkg1.javaintro;

import java.util.Scanner;

public class Ej1Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        System.out.println("la suma de " + num + " + " + num2 + " = " + (num + num2));
    }

}
