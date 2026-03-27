package Unidad_0;
import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in)  ;
     String texto = "eeeeaaaeeaa";
     String c = scanner.nextLine();
     String reemplazo = "";

     for(int i = 0; i < texto.length(); i++){

         if(texto.charAt(i) == 'e') reemplazo += c;

         else reemplazo += texto.charAt[i];
     }
    }
}
