package ej.pkg6.javaintro.extra;

import java.util.Scanner;

public class Ej6JavaintroExtra {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de personas");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        double est, suma = 0, suma2 = 0;
        int x = 0, y = 0;
        while (x < n) {
            System.out.println("Ingresa la estatura");
            est = leer.nextDouble();
            x++;
            suma += est;

            if (est <= 1.60) {
                suma2 += est;
                y++;
            }
        }
        double prom = suma / x;
        double prom2 = suma2 / y;
        System.out.println("El promedio de estaturas en general es " + prom);
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts. es " + prom2);
    }

}
