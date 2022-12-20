package ej.pkg10.javaintro.extra;

import java.util.Scanner;

public class Ej10JavaintroExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        System.out.println("El número 1 generado aleatoriamente es " + n1);
        System.out.println("El número 2 generado aleatoriamente es " + n2);
        int resultado;

        do {
            System.out.println(n1 + " * " + n2 + " = ");
            resultado = leer.nextInt();
            if (resultado != (n1 * n2)) {
                System.out.println("Respuesta incorrecta, intente nuevamente");
            }
        } while (resultado != (n1 * n2));

        System.out.println("Respuesta correcta");
    }

}
