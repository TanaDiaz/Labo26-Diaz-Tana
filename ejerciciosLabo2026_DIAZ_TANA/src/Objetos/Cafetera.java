package Objetos;

public class Cafetera {

    private int cantMax;
    private int cantActual;

    public Cafetera(){
        this.cantMax = 1000;
        this.cantActual = 0;
    }

    public Cafetera(int cantMax, int cantActual){
        this.cantMax = cantMax;
        this.cantActual = cantActual;

        if(cantMax < cantActual){
            this.cantActual = cantMax;
        }
    }

    public  Cafetera(int cantMax){
        this.cantMax = cantMax;
        this.cantActual = cantMax;
    }

    public void llenarCafetera(){
        for(int i = cantActual; i < cantMax; i++){
            cantActual++;
        }
    }

    public int servirTaza(int capacidad){
        int taza = 0;

        while(cantActual > 0 && taza < capacidad){
            cantActual--;
            taza++;
        }
        return taza;
    }

    public void vaciarCafetera(){
        while(0 < cantActual){
            cantActual--;
        }
    }

    public void agregarCafe(int cantidad){
        while(cantActual < cantMax && 0 < cantidad){
            cantActual++;
            cantidad--;
        }
    }

    static void main(String[] args) {
        Cafetera cafetera = new Cafetera(1000, 500);
        int cantidad = 200;
        int capacidad = 800;

        cafetera.llenarCafetera();
        int taza = cafetera.servirTaza(capacidad);
        cafetera.vaciarCafetera();
        cafetera.agregarCafe(cantidad);
    }
}
