package Unidad_0;
import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in)  ;
        int c = scanner.nextInt();
        int cont = 0;
        int mayor = 0;
        int menor = 0;
        int suma = 0;
        int sumaPos = 0;
        int sumaNeg = 0;
        while(c != -1) {
            cont++;
            if(mayor < c) mayor = c;
            if(menor > c) menor = c;
            suma = suma + c;
            if(c > 0) sumaPos = c + sumaPos;
            if(c < sumaNeg) sumaNeg = c + sumaNeg;
            c = scanner.nextInt();
        }

        System.out.println("La cantidad de numeros ingresados fueron: " + cont);
        System.out.println("La suma de los numeros ingresados fue: " + suma);


    }
}
