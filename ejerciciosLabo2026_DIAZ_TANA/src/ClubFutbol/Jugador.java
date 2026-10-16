package ClubFutbol;

import java.time.LocalDate;
import java.util.List;

public abstract class Jugador extends Persona {
    protected String posicion;
    protected String provinciaOrigen;
    protected int numeroCamiseta;

    public Jugador(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores,
                   String posicion, String provinciaOrigen, int numeroCamiseta) {
        super(nombre, fechaNacimiento, clubesAnteriores);
        this.posicion = posicion;
        this.provinciaOrigen = provinciaOrigen;
        this.numeroCamiseta = numeroCamiseta;
    }
}