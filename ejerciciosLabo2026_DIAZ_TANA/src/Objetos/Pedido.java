package Objetos;

import Personas.Persona;

import java.util.ArrayList;

public class Pedido {

    private String fechaP;
    private ArrayList<Plato> platos;
    private String horaEntrega;
    private boolean entregado;
    private Persona nombre;
    private Persona apellido;

    public Pedido(String fechaP, ArrayList<Plato> platos, String horaEntrega, boolean entregado, Persona nombre, Persona apellido) {
        this.fechaP = fechaP;
        this.platos = platos;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Persona getNombre() {
        return nombre;
    }

    public void setNombre(Persona nombre) {
        this.nombre = nombre;
    }

    public Persona getApellido() {
        return apellido;
    }

    public void setApellido(Persona apellido) {
        this.apellido = apellido;
    }

    public double calcularPrecioFinal() {
        double total = 0;
        for (Plato p : platos) {
            total += p.getPrecio();
        }
    }
}