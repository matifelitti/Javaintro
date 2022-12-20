
package ej.pkg10.javaintro;

import java.util.Scanner;

public class Ej10Javaintro {

    public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un máximo positivo: ");
        int max = leer.nextInt();
        int suma =0;
        do {
            System.out.println("Ingrese números a sumar hasta superar el máximo");
            num = leer.nextInt(); 
            suma+= num;
        }while(suma <= max);
    }  
    }

