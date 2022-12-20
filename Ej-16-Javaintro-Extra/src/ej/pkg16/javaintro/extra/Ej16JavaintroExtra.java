package ej.pkg16.javaintro.extra;

import java.util.Scanner;

public class Ej16JavaintroExtra {

    public static void main(String[] args) {

        int edad;
        String nombre, opcion;
        do {
            System.out.println("Ingrese el nombre de la persona");
            Scanner leer = new Scanner(System.in);
            nombre = leer.next();
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            mom(edad, nombre);
            System.out.println("¿Desea seguir mostrando personas: SI/NO?");
            opcion = leer.next();
        } while (!"NO".equals(opcion));

    }

    public static void mom(int edad, String nombre) {
        if (edad >= 18) {
            System.out.println(nombre + " tiene " + edad + " años y es mayor de edad");
        }
        if (edad < 18) {
            System.out.println(nombre + " tiene " + edad + " años y es menor de edad");
        }
    }
}
