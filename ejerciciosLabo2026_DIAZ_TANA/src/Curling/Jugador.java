package Curling;
import java.time.LocalDate;

public class Jugador {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int numeroCamiseta;
    private boolean capitan;

    public Jugador(String nombre, String apellido,
                   LocalDate fechaNacimiento,
                   int numeroCamiseta,
                   boolean capitan) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
        this.capitan = capitan;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public boolean esCapitan() {
        return capitan;
    }
}