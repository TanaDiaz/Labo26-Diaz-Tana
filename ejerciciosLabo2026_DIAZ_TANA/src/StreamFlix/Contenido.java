package StreamFlix;

import java.time.LocalDate;

public class Contenido {

        private String titulo;
        private int codId;
        private LocalDate fechaEst;
        private String edadRecomendada;
        private Idioma idiomaOg;


    public Contenido(String titulo, int codId, LocalDate fechaEst, String edadRecomendada, Idioma idioma) {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodId() {
        return codId;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public LocalDate getFechaEst() {
        return fechaEst;
    }

    public void setFechaEst(LocalDate fechaEst) {
        this.fechaEst = fechaEst;
    }

    public String getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(String edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public Idioma getIdiomaOg() {
        return idiomaOg;
    }

    public void setIdiomaOg(Idioma idiomaOg) {
        this.idiomaOg = idiomaOg;
    }



    public void informacionBasica(){

        System.out.println(this.codId + this.titulo);
    }




}
