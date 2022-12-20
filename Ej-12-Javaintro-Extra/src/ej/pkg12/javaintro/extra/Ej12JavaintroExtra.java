package ej.pkg12.javaintro.extra;

public class Ej12JavaintroExtra {

    public static void main(String[] args) {
        String num;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    num = (i + "-" + j + "-" + k);
                    num = num.replace("3", "E");
                    System.out.println(num);
                }
            }
        }
    }

}
