package EJ6;

public class Televisor extends Producto {

    private TecnologiaTV tecnologia;
    private String resolucion;

    public Televisor(String nombre,
                     double precio,
                     int stock,
                     TecnologiaTV tecnologia,
                     String resolucion) {

        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public TecnologiaTV getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(TecnologiaTV tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Tecnologia: " + tecnologia +
                ", Resolucion: " + resolucion;
    }
}