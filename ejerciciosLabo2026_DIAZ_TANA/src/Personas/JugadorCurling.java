package Personas;

public class JugadorCurling extends Persona{

    int numCamiseta;
    boolean capitan;

    public JugadorCurling(int edad, String nombre, String fechaN, String dni, int numCamiseta, boolean capitan) {
        super(edad, nombre, fechaN, dni);
        this.numCamiseta = numCamiseta;
        this.capitan = capitan;
    }

    public JugadorCurling() {
        super(76, "Elver Galarga", "01-01-2000", "11000456");
        this.numCamiseta = 69;
        this.capitan = false;
    }



    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }
}
