package Bebidas;

public class BebidaAlcoholica extends Bebida {

    private static double coefPositividad = 0.0;
    private static double multiplicadorNegatividad = 20.0;

    private double cantidadAlcohol;

    public BebidaAlcoholica(String nombre, double cantidadAlcohol) {
        super(nombre);
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public double getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(double cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    @Override
    public double getCoeficientePositividad() {
        return coefPositividad;
    }

    @Override
    public double getCoeficienteNegatividad() {
        return cantidadAlcohol * multiplicadorNegatividad;
    }
}