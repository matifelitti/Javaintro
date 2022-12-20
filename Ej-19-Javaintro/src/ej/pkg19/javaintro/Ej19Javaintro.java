package ej.pkg19.javaintro;

import java.util.Scanner;

public class Ej19Javaintro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*System.out.println("Ingrese una dimension: ");
        int num = leer.nextInt();*/

        ///int[][] matriz = new int [num][num];
        ///Random random = new Random();
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int cont = 0;
        //MATRIZ 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ///matriz[i][j]= random.nextint(10));
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }

        //MATRIZ TRANSPUESTA
        System.out.println("Matriz transpuesta");
        int[][] matrizb = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizb[i][j] = matriz[j][i];
                System.out.print(" " + matrizb[i][j]);
            }
            System.out.println(" ");
        }

        //COMPARACION
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if ((-1) * (matriz[i][j]) == (matrizb[i][j])) {
                    cont++;
                }
            }
        }
        System.out.println(cont);
        if (cont == 9) {
            System.out.println("es antisimetrica");

        } else {
            System.out.println("no es antisimetrica");
        }
    }
}
