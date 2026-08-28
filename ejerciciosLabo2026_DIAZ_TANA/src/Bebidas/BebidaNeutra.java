package Bebidas;

public class BebidaNeutra extends Bebida {

    private double coeficientePositividad;
    private double coeficienteNegatividad;

    public BebidaNeutra(String nombre, double coeficientePositividad, double coeficienteNegatividad) {
        super(nombre);
        this.coeficientePositividad = coeficientePositividad;
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    @Override
    public double getCoeficientePositividad() {
        return coeficientePositividad;
    }

    @Override
    public double getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }
}