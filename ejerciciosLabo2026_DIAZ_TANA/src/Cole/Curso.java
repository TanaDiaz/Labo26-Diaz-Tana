package Cole;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Alumno> cursos;
    private Maestro maestro;
    private Contenido contenido;

    public Curso(ArrayList<Alumno> cursos, Maestro maestro, Contenido contenido) {
        this.cursos = cursos;
        this.maestro = maestro;
        this.contenido = contenido;
    }

    public ArrayList<Alumno> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Alumno> cursos) {
        this.cursos = cursos;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public void CotenidoApto(){

        for(Alumno a : cursos){
            if(a.getEdad() < 16){
                System.out.println("vaya a contenido niños");
            }
            else{
                System.out.println("puede ingresar a contenido adulto");
            }
        }

    }

    public void matarAlmuno(String nombre){

        for(Alumno a : cursos){
            if(a.getNombre().equals(nombre)){
                cursos.remove(a);
                System.out.println("morido");
                return;
            }

        }

        System.out.println("gg no mataste a nadie");
    }
}

