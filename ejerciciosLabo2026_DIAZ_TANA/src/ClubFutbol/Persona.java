package ClubFutbol;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public abstract class Persona {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected List<String> clubesAnteriores;

    public Persona(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.clubesAnteriores = clubesAnteriores;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean haTrabajadoEn(String nombreClub) {
        return clubesAnteriores.stream()
                .anyMatch(c -> c.equalsIgnoreCase(nombreClub));
    }

    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public abstract void mostrarInformacion();
}
