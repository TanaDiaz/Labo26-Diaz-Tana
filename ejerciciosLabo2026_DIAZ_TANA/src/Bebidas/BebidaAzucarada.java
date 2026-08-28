package Bebidas;

public class BebidaAzucarada extends Bebida {

    private static double coefPositividad = 1.0;
    private static double multiplicadorNegatividad = 10.0;

    private double cantidadAzucar;

    public BebidaAzucarada(String nombre, double cantidadAzucar) {
        super(nombre);
        this.cantidadAzucar = cantidadAzucar;
    }

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(double cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    @Override
    public double getCoeficientePositividad() {
        return coefPositividad;
    }

    @Override
    public double getCoeficienteNegatividad() {
        return cantidadAzucar * multiplicadorNegatividad;
    }
}