package ClubFutbol;

import java.time.LocalDate;
import java.util.List;

public class PreparadorFisico extends IntegranteCuerpoTecnico {
    private String especialidad;
    private boolean matriculaHabilitante;

    public PreparadorFisico(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores,
                            String tituloProfesional, int anosExperiencia, String especialidad,
                            boolean matriculaHabilitante) {
        super(nombre, fechaNacimiento, clubesAnteriores, tituloProfesional, anosExperiencia);
        this.especialidad = especialidad;
        this.matriculaHabilitante = matriculaHabilitante;
    }

    public boolean isMatriculaHabilitante() {
        return matriculaHabilitante;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Preparador Físico] Nombre: " + nombre + ", Especialidad: " + especialidad +
                ", Experiencia: " + anosExperiencia + " años, Matrícula: " + (matriculaHabilitante ? "Sí" : "No"));
    }
}
