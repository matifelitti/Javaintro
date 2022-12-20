package ej.pkg15.javaintro;

public class Ej15Javaintro {

    public static void main(String[] args) {

        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = 99 - i;
            System.out.println("vector[" + i + "]=" + vector[i]);
        }
    }

}
