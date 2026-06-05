package EJ6;

public class EquipoSonido extends Producto {

    private boolean bluetooth;

    public EquipoSonido(String nombre, double precio, int stock, boolean bluetooth) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.bluetooth = bluetooth;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Bluetooth: " + bluetooth;
    }
}