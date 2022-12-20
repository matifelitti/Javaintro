package ej.pkg5.javaintro.extra;

import java.util.Scanner;

public class Ej5JavaintroExtra {

    public static void main(String[] args) {
        String s;
        do {
            System.out.println("Ingrese clase de socio: A, B o C");
            Scanner leer = new Scanner(System.in);
            s = leer.nextLine();
        } while (!"A".equals(s) && !"B".equals(s) && !"C".equals(s));

        System.out.println("Ingrese valor de la cuota de la obra social");
        Scanner leer = new Scanner(System.in);
        int valor = leer.nextInt();

        if ("A".equals(s)) {
            int desc = valor - (valor * 50 / 100);
            System.out.println("El importe en efectivo a pagar es :$" + desc);
        }

        if ("B".equals(s)) {
            int desc = valor - (valor * 35 / 100);
            System.out.println("El importe en efectivo a pagar es :$" + desc);
        }

        if ("C".equals(s)) {
            System.out.println("El importe en efectivo a pagar es :$" + valor);
        }
    }

}
