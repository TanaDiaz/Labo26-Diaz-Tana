package Unidad_0;

import java.util.Scanner;

public class DiaLaboral  {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String dia = scanner.nextLine();

        if (!dia.equals("sabado") && !dia.equals("domingo")){
            System.out.println("dia laboral");

        }
        else{
            System.out.println("fin de semana");
        }
    }
}