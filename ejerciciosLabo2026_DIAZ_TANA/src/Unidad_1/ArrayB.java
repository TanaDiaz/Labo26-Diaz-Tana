import java.util.ArrayList;

public class Picci {
}

static void main(String[] args) {
    ArrayList <String> palabras = new ArrayList<>();
    palabras.add("Picci");
    palabras.add("Cacona");
    palabras.add("SamuelEtotis");
    for(String palabra : palabras){
        if(palabra.charAt(0) == 'C'){
            System.out.println(palabra);
        }
    }
}