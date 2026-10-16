package Interfaces1;

import java.time.LocalDate ;

public class Revista extends Papel implements Prestable{

    private LocalDate anioPublicacion;
    private LocalDate fechaPublicacion;

    public Revista(int codigo, String titulo, LocalDate anioCreacion, LocalDate anioPublicacion,LocalDate fechaPublicacion) {
        super(codigo, titulo, anioCreacion);
        this.anioPublicacion = anioPublicacion;
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public LocalDate getTrimestre() {
        return fechaPublicacion;
    }

    public void setTrimestre(LocalDate trimestre) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override

    public void prestar(String objetoAPrestar){

        if(fechaPublicacion.getMonthValue() < LocalDate.now().getMonthValue()-2 ){
            System.out.println("la novela se puede prestar");

        }
        else{
            System.out.println("no se puede prestar");
        }

    }
}
