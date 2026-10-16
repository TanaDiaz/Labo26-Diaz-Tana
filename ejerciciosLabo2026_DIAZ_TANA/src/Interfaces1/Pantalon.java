package Interfaces1;

public class Pantalon extends Ropa implements Prestable{

    private int medidaCintura;
    private int  medidaCadera;
    private int largo;

    public Pantalon(String color, MaterialPrenda material, boolean estado, int medidaCintura, int medidaCadera, int largo) {
        super(color, material, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.largo = largo;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public int getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
}
