package ClubFutbol;
import java.time.LocalDate;
import java.util.List;

public abstract class IntegranteCuerpoTecnico extends Persona {
    protected String tituloProfesional;
    protected int anosExperiencia;

    public IntegranteCuerpoTecnico(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores,
                                   String tituloProfesional, int anosExperiencia) {
        super(nombre, fechaNacimiento, clubesAnteriores);
        this.tituloProfesional = tituloProfesional;
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
}