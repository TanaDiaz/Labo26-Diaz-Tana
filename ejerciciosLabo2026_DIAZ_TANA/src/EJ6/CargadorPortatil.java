package EJ6;

public class CargadorPortatil extends Producto {

    private int cantidadCargas;

    public CargadorPortatil(String nombre,
                            double precio,
                            int stock,
                            int cantidadCargas) {

        super(nombre, precio, stock, Seccion.CARGADORES);
        this.cantidadCargas = cantidadCargas;
    }

    public int getCantidadCargas() {
        return cantidadCargas;
    }

    public void setCantidadCargas(int cantidadCargas) {
        this.cantidadCargas = cantidadCargas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Cantidad de cargas: " + cantidadCargas;
    }
}