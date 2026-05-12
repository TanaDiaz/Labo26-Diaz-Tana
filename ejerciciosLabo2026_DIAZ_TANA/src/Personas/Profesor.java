package Personas;

public class Profesor extends Persona {

    private int porcentajeDesc;


    public Profesor(nombre, apellido, porcentajeDesc) {

        super(nombre,apellido);
        this.porcentajeDesc = porcentajeDesc;
    }

    public int getPorcentajeDesc() {
        return porcentajeDesc;}

    public void setPorcentajeDesc(int porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }
}



