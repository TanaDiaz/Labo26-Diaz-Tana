package ClubFutbol;

import java.time.LocalDate;
import java.util.List;

public class Entrenador extends IntegranteCuerpoTecnico {
    private int cantidadCampeonatos;
    private boolean licenciaProfesionalVigente;

    public Entrenador(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores,
                      String tituloProfesional, int anosExperiencia, int cantidadCampeonatos,
                      boolean licenciaProfesionalVigente) {
        super(nombre, fechaNacimiento, clubesAnteriores, tituloProfesional, anosExperiencia);
        this.cantidadCampeonatos = cantidadCampeonatos;
        this.licenciaProfesionalVigente = licenciaProfesionalVigente;
    }

    public boolean isLicenciaProfesionalVigente() {
        return licenciaProfesionalVigente;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Entrenador] Nombre: " + nombre + ", Título: " + tituloProfesional +
                ", Experiencia: " + anosExperiencia + " años, Campeonatos: " + cantidadCampeonatos +
                ", Licencia Vigente: " + (licenciaProfesionalVigente ? "Sí" : "No"));
    }
}