package ej.pkg21.javaintro.extra;

import java.util.Scanner;

public class Ej21JavaintroExtra {

    public static void main(String[] args) {
        int cant;
        System.out.println("Introduce la cantidad de alumnos");
        Scanner sc = new Scanner(System.in);
        cant = sc.nextInt();
        int acu = 0;
        int acu2 = 0;

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la nota del Primer trabajo práctico evaluativo del alumno " + i);
            double ptpe = sc.nextInt();
            System.out.println("Ingrese la nota del Segundo trabajo práctico evaluativo del alumno " + i);
            double stpe = sc.nextInt();
            System.out.println("Ingrese la nota del Primer Integrador del alumno " + i);
            double pi = sc.nextInt();
            System.out.println("Ingrese la nota del Segundo Integrador del alumno " + i);
            int si = sc.nextInt();
            double nota = (double) (ptpe * 0.10) + (stpe * 0.15) + (pi * 0.25) + (si * 0.50);

            if (nota < 7) {
                acu++;
            }
            if (nota >= 7) {
                acu2++;
            }
        }

        System.out.println("Los alumnos desaprobados son: " + acu);
        System.out.println("Los alumnos aprobados son: " + acu2);
    }

}
