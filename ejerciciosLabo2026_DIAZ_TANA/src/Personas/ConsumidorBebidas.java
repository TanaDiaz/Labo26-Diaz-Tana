package Personas;

import java.util.ArrayList;

import Bebidas.Bebida;
import Bebidas.ConsumoBebida;

public class ConsumidorBebidas extends Persona {

    private static ArrayList<String> dnisRegistrados = new ArrayList<>();

    private String apellido;
    private ArrayList<ConsumoBebida> consumos = new ArrayList<>();
    private boolean dniValido;

    public ConsumidorBebidas(int edad, String nombre, String apellido, String fechaN, String dni) {
        super(edad, nombre, fechaN, dni);
        this.apellido = apellido;

        if (dnisRegistrados.contains(dni)) {
            dniValido = false;
            System.out.println("No se pudo registrar a " + nombre + " " + apellido
                    + ": ya existe una persona con el DNI " + dni);
        } else {
            dniValido = true;
            dnisRegistrados.add(dni);
        }
    }

    public boolean isDniValido() {
        return dniValido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<ConsumoBebida> getConsumos() {
        return consumos;
    }

    public void registrarConsumo(Bebida bebida, int cantidad) {
        if (cantidad > 0) {
            consumos.add(new ConsumoBebida(bebida, cantidad));
        } else {
            System.out.println("Cantidad invalida para " + bebida.getNombre() + ", no se registro el consumo");
        }
    }


    public double calcularCoeficienteHidratacion() {
        double totalPositividad = 0;
        double totalNegatividad = 0;

        for (ConsumoBebida c : consumos) {
            totalPositividad += c.getBebida().getCoeficientePositividad() * c.getCantidad();
            totalNegatividad += c.getBebida().getCoeficienteNegatividad() * c.getCantidad();
        }

        return totalPositividad - totalNegatividad;
    }

    public static int getCantidadRegistrados() {
        return dnisRegistrados.size();
    }
}