package Cocinas;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato{
    private int numeroComensales;
    private int tiempoCoccion;

    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> instrucciones, int numeroComensales, int tiempoCoccion){
        super(nombre,dificultad,instrucciones);
        this.numeroComensales = numeroComensales;
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    @Override
    public void cargarReceta()
    {
        System.out.println(this.tiempoCoccion+" "+this.numeroComensales);
    for(String instruccion :getInstrucciones()){
        System.out.println(instruccion);
    }
    }
}
