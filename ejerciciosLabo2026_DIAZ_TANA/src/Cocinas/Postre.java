package Cocinas;

import java.util.ArrayList;

public class Postre extends Plato{
    private int tempHorno;
    private boolean aptoDiabetico;

    public Postre(String nombre, Dificultad dificultad, ArrayList<String> instrucciones, int tempHorno, boolean aptoDiabetico) {
        super(nombre, dificultad, instrucciones);
        this.tempHorno = tempHorno;
        this.aptoDiabetico = aptoDiabetico;
    }

    public int getTempHorno() {
        return tempHorno;
    }

    public void setTempHorno(int tempHorno) {
        this.tempHorno = tempHorno;
    }

    public boolean isAptoDiabetico() {
        return aptoDiabetico;
    }

    public void setAptoDiabetico(boolean aptoDiabetico) {
        this.aptoDiabetico = aptoDiabetico;
    }

    @Override
    public void cargarReceta(){
        System.out.println(this.tempHorno+""+aptoDiabetico);
        for(String instruccion : getInstrucciones()){
            System.out.println(instruccion);
            System.out.println("manten la cocina limpia y horno al minimo");
        }
    }
}
