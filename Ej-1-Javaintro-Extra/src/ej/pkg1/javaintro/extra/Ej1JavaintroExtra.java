package ej.pkg1.javaintro.extra;

import java.util.Scanner;

public class Ej1JavaintroExtra {

    public static void main(String[] args) {
        System.out.println("Ingrese cantidad de minutos para calcular su equivalente en días y horas");
        Scanner leer = new Scanner(System.in);
        int min = leer.nextInt();
        int dia = 0, hora = 0;
        while (min > 0) {
            if (min >= 1440) {
                dia++;
                min = min - 1440;
            } else if (min >= 60) {
                hora++;
                min = min - 60;
            }
        }

        System.out.println("Los minutos ingresados equivalen a " + dia + " dias y " + hora + " horas");
    }

}
