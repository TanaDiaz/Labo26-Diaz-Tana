package Curling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;
    private List<Turno> disponibilidades;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.disponibilidades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void agregarDisponibilidad(Turno turno) {
        if (!disponibilidades.contains(turno)) {
            disponibilidades.add(turno);
        }
    }

    public int cantidadJugadores() {
        return jugadores.size();
    }

    public List<Turno> getDisponibilidades() {
        return disponibilidades;
    }

    public boolean esValido() {

        if (jugadores.size() != 11) {
            return false;
        }

        int capitanes = 0;

        Set<Integer> numeros = new HashSet<>();

        for (Jugador j : jugadores) {

            if (j.esCapitan()) {
                capitanes++;
            }

            if (!numeros.add(j.getNumeroCamiseta())) {
                return false;
            }
        }

        if (capitanes != 1) {
            return false;
        }

        // Al menos un turno
        return !disponibilidades.isEmpty();
    }
}