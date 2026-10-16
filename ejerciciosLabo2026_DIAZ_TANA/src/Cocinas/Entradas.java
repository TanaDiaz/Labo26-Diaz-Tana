package Cocinas;

import java.util.ArrayList;

public class Entradas extends Plato{
    private boolean frio;

    public Entradas(String nombre, Dificultad dificultad, ArrayList<String> instrucciones, boolean frio) {
        super(nombre, dificultad, instrucciones);
        this.frio = frio;
    }

    public boolean isFrio() {
        return frio;
    }

    public void setFrio(boolean frio) {
        this.frio = frio;
    }


    @Override
    public void cargarReceta() {
        System.out.println(this.frio);
        if (frio == true) {
            for (String instruccion : getInstrucciones()) {
                System.out.println(instruccion);
            }
            System.out.println("guarda la preparacion en la headera");
        } else {
            System.out.println("prende el horno");
            for (String instruccion : getInstrucciones()) {
                System.out.println(instruccion);
            }

        }
    }
    }
