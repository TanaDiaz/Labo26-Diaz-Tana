package ClubFutbol;

import java.time.LocalDate;
import java.util.List;

public class JugadorDeCampo extends Jugador {
    private double porcentajeGolesConvertidos;
    private int cantidadAsistencias;

    public JugadorDeCampo(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores,
                          String posicion, String provinciaOrigen, int numeroCamiseta,
                          double porcentajeGolesConvertidos, int cantidadAsistencias) {
        super(nombre, fechaNacimiento, clubesAnteriores, posicion, provinciaOrigen, numeroCamiseta);
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
        this.cantidadAsistencias = cantidadAsistencias;
    }

    public double getPorcentajeGolesConvertidos() {
        return porcentajeGolesConvertidos;
    }

    public int getCantidadAsistencias() {
        return cantidadAsistencias;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Jugador de Campo] Nombre: " + nombre + ", Posición: " + posicion +
                ", Camiseta: " + numeroCamiseta + ", Edad: " + calcularEdad() +
                ", % Goles: " + porcentajeGolesConvertidos + "%, Asistencias: " + cantidadAsistencias);
    }
}
