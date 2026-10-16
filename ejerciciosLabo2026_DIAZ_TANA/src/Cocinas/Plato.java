package Cocinas;

import java.util.ArrayList;

public abstract  class Plato {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> instrucciones;

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> instrucciones) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.instrucciones = instrucciones;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public abstract void cargarReceta();



}
