package Unidad_1;

public class Submarino {

    private String nombre;
    private int profMax;
    private int profActual;

    public Submarino(){

        this.nombre = "Papu Submarino";
        this.profMax = 1000;
        this.profActual = 0;
    }
    public Submarino(String nombre, int profMax, int profActual){
        this.nombre = nombre;
        this.profMax = profMax;
        this.profActual = profActual;
    }

    public void sumergirSub(int metrosBajar){
        boolean peligroProf = false;
        while(peligroProf == false && 0 < metrosBajar){
            if(profActual == profMax){
                peligroProf = true;
                System.out.println("Profundidad máxima alcanzada. Seguir bajando seria riesgoso.");
            }
            else{
                profActual++;
                metrosBajar--;
            }
        }
    }

    public void emergerSub(int metrosSubir){
        while(0 < profActual && 0 < metrosSubir){
            profActual--;
        metrosSubir--;
    }
}

static void main(String[] args) {

    Submarino submarino = new Submarino();
    submarino.sumergirSub(222);
    submarino.emergerSub(123);
}
}

