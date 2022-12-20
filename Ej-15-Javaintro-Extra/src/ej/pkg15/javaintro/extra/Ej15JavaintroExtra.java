package ej.pkg15.javaintro.extra;

import java.util.Scanner;

public class Ej15JavaintroExtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        String opcion;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        System.out.println("Eliga S para sumar, R para restar, M para multiplicar y D para dividir");
        opcion = leer.next();

        switch (opcion) {
            case "S":
                System.out.println(suma(num1, num2));
                break;
            case "R":
                System.out.println(resta(num1, num2));
                break;
            case "M":
                System.out.println(multiplicacion(num1, num2));
                break;
            case "D":
                System.out.println(division(num1, num2));
                break;

        }

    }

    public static int suma(int num1, int num2) {
        int sumas;
        sumas = num1 + num2;
        return sumas;
    }

    public static int resta(int num1, int num2) {
        int restas;
        restas = num1 - num2;
        return restas;
    }

    public static int division(int num1, int num2) {
        int division;
        division = num1 / num2;
        return division;
    }

    public static int multiplicacion(int num1, int num2) {
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
}
