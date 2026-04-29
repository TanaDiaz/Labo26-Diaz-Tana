package Objetos;

public class Vocales {
    public static void main(String[] args) {

        String texto = "Ayer me compré muñecos de la marca ToyCo por internet.";
        int cont = 0;

        for(int i = 0; i<texto.length(); i++){
            if(texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
                cont++;
            }
            System.out.println("La cantidad de vocales fue " + cont);

        }
    }
}
