package Objetos;

import java.util.ArrayList;

public class CD {

    private ArrayList<String> cancion;

    public CD(){
     this.cancion = new ArrayList<>();
    }

    public ArrayList<String> getCancion(){
        return this.cancion;
    }

    public void setCancion(ArrayList<String> cancion){
        this.cancion = cancion;
    }

    public int numeroCanciones() {
        int cont = 0;
        for (String cancion : cancion) {
            cont++;
        }
        return cont;
    }
    public String verCancion(int posicion){
        return cancion.get(posicion);
    }

    public void grabaCancion(int posición, ArrayList<String> nuevaCancion){
        cancion.remove(posición);
        cancion.add(nuevaCancion);
    }
}