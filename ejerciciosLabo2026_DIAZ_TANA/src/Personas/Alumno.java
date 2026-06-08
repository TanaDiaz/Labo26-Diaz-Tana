package Personas;

public class Alumno extends PersonaEducativa {

    private String division;

    public Alumno(String nombre, String apellido, double descuento, String division){
        super(nombre,apellido, descuento);
        this.division=division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}