package Llamadas;


public class Llamada {

    private Empleado origen;
    private Empleado destino;
    private String fecha;
    private int duracion;

    public Llamada(Empleado origen, Empleado destino, String fecha, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int calcularCosto(){

    }

    public void registrarLlamada(Empleado empleado1, Empleado empleado2, Boolean alcance){


    }
}
