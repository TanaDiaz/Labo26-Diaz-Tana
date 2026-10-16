package Interfaces1;

import java.time.LocalDate;

public abstract class Papel {

    private int codigo;
    private String titulo;
    private LocalDate anioCreacion;

    public  Papel(int codigo,String titulo,LocalDate anioCreacion){

        this.codigo = codigo;
        this.titulo = titulo;
        this.anioCreacion = anioCreacion;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return titulo;
    }

    public LocalDate getAnioCreacion(){
        return anioCreacion;
    }


    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioCreacion(LocalDate anioCreacion){
        this.anioCreacion = anioCreacion;
    }

}
