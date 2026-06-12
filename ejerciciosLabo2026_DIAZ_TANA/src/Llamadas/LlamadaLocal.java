package Llamadas;

public class LlamadaLocal extends Llamada {
    private String provinciaO;
    private String provinciaD;

    public LlamadaLocal(Empleado origen, Empleado destino, String fecha, int duracion, String provinciaD, String provinciaO) {
        super(origen, destino, fecha, duracion);
        this.provinciaD = provinciaD;
        this.provinciaO = provinciaO;
    }

    public LlamadaLocal() {
        super();
    }

    @Override
    public int calcularCosto(){

    }

    @Override
    public void registrarLlamada(Empleado empleado1, Empleado empleado2, Boolean alcance){

    }

}
