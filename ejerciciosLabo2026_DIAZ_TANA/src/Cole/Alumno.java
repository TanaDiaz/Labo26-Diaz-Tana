package Cole;

public class Alumno extends Persona{
    private Grado grado;
    private Materia materia;

    public Alumno(String nombre,String apellido,int edad,Grado grado,Materia materia){
        super(nombre,apellido,edad);
        this.grado = grado;
        this.materia = materia;
    }

    public Materia getMateria(){
        return materia;
    }

    public void setMateria(Materia materia){
        this.materia = materia;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }
}
