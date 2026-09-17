package SistemaMedico;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona1 {
    private String nombre;
    private String apellido;
    private LocalDate fechaNaciimiento;
    private HashMap<LocalDate, Medicion> Mediciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNaciimiento() {
        return fechaNaciimiento;
    }

    public void setFechaNaciimiento(LocalDate fechaNaciimiento) {
        this.fechaNaciimiento = fechaNaciimiento;
    }

    public HashMap<LocalDate, Medicion> getMediciones() {
        return Mediciones;
    }

    public void setMediciones(HashMap<LocalDate, Medicion> mediciones) {
        Mediciones = mediciones;
    }
}
