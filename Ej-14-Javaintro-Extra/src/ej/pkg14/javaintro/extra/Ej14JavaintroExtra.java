package ej.pkg14.javaintro.extra;

public class Ej14JavaintroExtra {

    public static void main(String[] args) {
        int fam = (int) (Math.random() * 6), hij, edad, cont = 0, mochila = 0;
        System.out.println("Hay " + fam + " familias");

        for (int i = 1; i < fam + 1; i++) {
            hij = (int) (Math.random() * 6);
            System.out.println("Hay " + hij + " hijos en la familia " + (i));

            for (int j = 1; j < hij + 1; j++) {
                edad = (int) (Math.random() * 20);
                mochila = mochila + edad;
                cont++;
                System.out.println("El hijo numero " + j + " tiene " + edad + " años");

            }
            System.out.println("");
        }

        System.out.println("La edad media de todas las familias es: " + (mochila / cont));
    }

}
