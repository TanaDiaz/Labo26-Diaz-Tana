package Personas;

public class Alumno extends Persona {

    private String division;

    public Alumno(nombre, apellido, division){
        super(nombre,apellido);
        this.division=division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}