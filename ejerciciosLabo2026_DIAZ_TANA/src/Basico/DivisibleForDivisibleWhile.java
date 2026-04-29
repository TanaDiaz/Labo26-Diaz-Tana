package Basico;

public class DivisibleForDivisibleWhile {
    public static void main(String[] args) {
        int j = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);

            }
        }

        while (j <= 100) {
            if (j % 2 == 0 && j % 3 == 0) {
                System.out.println(j);
            }
            j++;
    }

