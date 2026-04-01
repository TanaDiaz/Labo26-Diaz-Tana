package Unidad_0;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public Coche() {
        this.marca = "Volkswagen";
        this.modelo = "fitito";
        this.color = "negro arandano";
        this.velocidad = 50;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public int acelerar(int valor) {
        while (this.velocidad < valor) {
            this.velocidad++;
        }
        return this.velocidad;
    }

    public int frenar() {
        while (this.velocidad > 0) {
            this.velocidad--;
        }
        return this.velocidad;
    }

    // Mostrar velocidad
    public int mostrar(){
        return this.velocidad;
    }

    public static void main(String[] args) {
        Coche coche = new Coche();

        System.out.println("Velocidad actual: " + coche.mostrar());

        coche.acelerar(80);
        System.out.println("Después de acelerar: " + coche.mostrar());

        coche.frenar();
        System.out.println("Después de frenar: " + coche.mostrar());
    }
}
