package Cocina;

import java.util.ArrayList;

public class Plato {
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;
    private Horario horario;

    public Plato(String nombre, ArrayList<Ingrediente> ingredientes, Horario horario) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
