package ej.pkg8.javaintro.extra;

import java.util.Scanner;

public class Ej8JavaintroExtra {

    public static void main(String[] args) {
        double n;
        int acu = 0, par = 0, impar = 0;

        do {
            System.out.println("Ingrese un número");
            Scanner leer = new Scanner(System.in);
            n = leer.nextDouble();
            acu++;
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        } while (n % 5 != 0);

        System.out.println("Se ingresaron " + acu + " números");
        System.out.println(par + " números son pares y " + impar + " son impares");
    }

}
