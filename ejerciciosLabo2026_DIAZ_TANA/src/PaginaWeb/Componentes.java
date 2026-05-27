package PaginaWeb;

public class Componentes {
    private float precio;
    private String modelo;
    private String nombreFa;
    private int stock;


    public Componentes (float precio, String modelo, String nombreFa, int stock){

        this.precio = precio;
        this.modelo = modelo;
        this.nombreFa = nombreFa;
        this.stock = stock;

    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombreFa() {
        return nombreFa;
    }

    public void setNombreFa(String nombreFa) {
        this.nombreFa = nombreFa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



}
