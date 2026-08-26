package Array;

import java.util.ArrayList;

public class nom {
    private String nombre;
    private ArrayList<String>nombres;


    public nom(String nombre, ArrayList<String> nombres) {
        this.nombre = nombre;
        this.nombres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    static void main(String[] args) {

    }


}
