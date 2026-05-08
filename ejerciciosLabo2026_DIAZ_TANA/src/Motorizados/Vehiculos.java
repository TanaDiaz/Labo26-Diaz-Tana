package Motorizados;

public class Vehiculos {

    private String marca;
    private String modelo;
    private String color;
    private int CantRuedas;
    private String anoFabricacion;
    private String patente;


    public Vehiculos(String marca, String modelo, String color, int cantRuedas, String anoFabricacion, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        CantRuedas = cantRuedas;
        this.anoFabricacion = anoFabricacion;
        this.patente = patente;
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

    public int getCantRuedas() {
        return CantRuedas;
    }

    public String getAnoFabricacion() {
        return anoFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantRuedas(int cantRuedas) {
        CantRuedas = cantRuedas;
    }

    public void setAnoFabricacion(String anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
