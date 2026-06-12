package StreamFlix;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plataforma {
    private ArrayList<Contenido> contenidos;

    public Plataforma (ArrayList<Contenido>contenidos){

        this.contenidos =  contenidos;
    }


    public ArrayList<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public void agregarContenido(Contenido c) {
        contenidos.add(c);
    }


    public String nombreUltimoEpisodio(){


    }

}
