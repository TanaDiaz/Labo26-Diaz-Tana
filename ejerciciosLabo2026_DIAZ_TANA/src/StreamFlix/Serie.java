package StreamFlix;

import java.time.LocalDate;

public class Serie extends Contenido{

    private int cantTemporadas;

    public Serie(String titulo, int codId, LocalDate fechaEst, String edadRecomendada, Idioma idioma, int cantTemporadas) {
        super(titulo, codId, fechaEst, edadRecomendada, idioma);
        this.cantTemporadas = cantTemporadas;
    }


    public int getCantTemporadas() {
        return cantTemporadas;
    }

    public void setCantTemporadas(int cantTemporadas) {
        this.cantTemporadas = cantTemporadas;
    }
}
