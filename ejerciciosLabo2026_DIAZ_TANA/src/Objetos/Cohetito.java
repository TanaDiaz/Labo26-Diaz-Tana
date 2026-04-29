package Objetos;

public class Cohetito {
    private String nombre;
    private int velomax;
    private int largo;
    private int ancho;
    private int cantProp;

    public Cohetito(String nombre, int velomax, int largo, int ancho, int cantProp ){
        this.nombre = nombre;
        this.velomax = velomax;
        this.largo = largo;
        this.ancho = ancho;
        this.cantProp = cantProp;
    }

  // GETS


    public String getNombre() {
        return this.nombre;
    }

    public int getVelomax() {
        return this.velomax;
    }

    public int getLargo() {
        return this.largo;
    }

    public int getAncho() {
        return this.ancho;
    }

    public int getCantProp() {
        return this.cantProp;
    }
 //SETS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVelomax(int velomax) {
        this.velomax = velomax;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setCantProp(int cantProp) {
        this.cantProp = cantProp;
    }

     public boolean puedeDespegar(){
        boolean despegar = false;

        if (cantProp >= 2 && velomax > 25000) {
            despegar = true;

            System.out.println("puede despegar");
        }
        else {
            System.out.println("no puede despegar");
        }
        return despegar;
     }

     public void activacionProp(int pro) {
         if (this.puedeDespegar() && pro <= cantProp) {
             for (int i = 1; i <= cantProp; i++) {
                 System.out.println("propulsor" + i + "activdo");
             }
         } else {
             System.out.println("no valida mogo");
         }
     }
     public int calculartime(int distancia){
        int res = -1;
        if (distancia > 0 ){
            res = distancia / velomax;
        }
        return res;
     }
}

