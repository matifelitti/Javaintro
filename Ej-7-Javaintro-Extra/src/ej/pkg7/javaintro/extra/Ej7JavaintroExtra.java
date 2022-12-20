package ej.pkg7.javaintro.extra;

import java.util.Scanner;

public class Ej7JavaintroExtra {

    public static void main(String[] args) {
        double c, n, acu = 0, suma = 0, prom = 0, mayor = 0, menor = 0;
        boolean x = true;
       
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números");
        c = leer.nextDouble();
        

        while (acu < c) {
            System.out.println("Ingrese un número");
            n = leer.nextDouble();
            acu++;
            suma += n;
            prom = suma / c;

            if (x == true) {
                mayor = n;
                menor = n;
                x = false;
            } else {
                if (n > mayor) {
                    mayor = n;
                } else {
                    if (n < menor) {
                        menor = n;
                    }
                }
            }

        }
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
        System.out.println("El promedio da como resultado " + prom);
    }
}
