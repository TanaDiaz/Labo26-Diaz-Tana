package Equipos;
import java.util.ArrayList;

public class EquipoCurling {

    ArrayList jugadores;
    int disponibilidad;
    boolean valido;

    public EquipoCurling(ArrayList jugadores, int disponibilidad, boolean valido) {
        this.jugadores = jugadores;
        this.disponibilidad = disponibilidad;
    }

    public ArrayList getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList jugadores) {
        this.jugadores = jugadores;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantidad(ArrayList jugadores){
        return jugadores.size();
    }


}
