package Llamadas;

public class LlamadaInternacional extends Llamada {
    private String franjaH;
    private int codPaisD;

    public LlamadaInternacional(String franjaH, int codPaisD, Empleado origen, Empleado destino, String fecha, int duracion) {
        super(origen, destino, fecha, duracion);
        this.franjaH = franjaH;
        this.codPaisD = codPaisD;
    }

    public LlamadaInternacional() {
        super();
    }

    @Override
    public int calcularCosto(){

    }

    @Override
    public void registrarLlamada(Empleado empleado1, Empleado empleado2, Boolean alcance){

    }

}