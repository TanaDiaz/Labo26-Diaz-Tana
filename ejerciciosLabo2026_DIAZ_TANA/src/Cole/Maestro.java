package Cole;

import java.util.ArrayList;

public class Maestro extends Persona {
    private Materia materia;


    public Maestro(String nombre, String apellido, int edad,  Materia materia) {
        super(nombre, apellido, edad);

        this.materia = materia;

    }



    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

}
