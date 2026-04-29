package Basico;
import java.util.Scanner;


public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int v2 = scanner1.nextInt();
        if (V1 == v2) {
            System.out.println("Ambos valores son iguales");
            System.out.println("El valor mas grande es: " + V1);

        } else {
            System.out.println("El valor mas grande es: " + v2);
        }
    }
}

