package ej.pkg12.javaintro;

import java.util.Scanner;

public class Ej12Javaintro {

    public static void main(String[] args) {
        String cadena;
        int numcaracteres, correctas = 0, incorrectas = 0;

        do {
            System.out.println("Ingrese una cadena");
            Scanner c = new Scanner(System.in);
            cadena = c.nextLine();
            numcaracteres = cadena.length();
            if (numcaracteres <= 5 && cadena.substring(0, 1).equals("X") && cadena.endsWith("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!"&&&&&".equals(cadena));

        System.out.println("Cantidad de lecturas correctas " + correctas);
        System.out.println("Cantidad de lecturas incorrectas " + (incorrectas - 1));

    }
}

