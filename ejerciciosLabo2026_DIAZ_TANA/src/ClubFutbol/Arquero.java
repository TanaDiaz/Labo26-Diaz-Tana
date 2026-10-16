package ClubFutbol;

import java.time.LocalDate;
import java.util.List;

public class Arquero extends Jugador {
    private double porcentajeAtajadas;
    private int golesRecibidos;

    public Arquero(String nombre, LocalDate fechaNacimiento, List<String> clubesAnteriores,
                   String provinciaOrigen, int numeroCamiseta, double porcentajeAtajadas, int golesRecibidos) {
        super(nombre, fechaNacimiento, clubesAnteriores, "Arquero", provinciaOrigen, numeroCamiseta);
        this.porcentajeAtajadas = porcentajeAtajadas;
        this.golesRecibidos = golesRecibidos;
    }

    public double getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("[Arquero] Nombre: " + nombre + ", Camiseta: " + numeroCamiseta +
                ", Edad: " + calcularEdad() + ", Provincia: " + provinciaOrigen +
                ", Atajadas: " + porcentajeAtajadas + "%, Goles recibidos: " + golesRecibidos);
    }
}
