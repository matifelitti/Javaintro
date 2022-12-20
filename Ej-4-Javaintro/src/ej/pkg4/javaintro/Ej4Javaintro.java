package ej.pkg4.javaintro;

import java.util.Scanner;

public class Ej4Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Tº en ºC: ");
        int cel = leer.nextInt();
        System.out.println(cel + "ºC = " + (32 + (9 * cel / 5) + "ºF"));
    }

}
