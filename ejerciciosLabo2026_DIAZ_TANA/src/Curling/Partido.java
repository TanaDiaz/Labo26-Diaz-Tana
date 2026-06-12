package Curling;
public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private int dia;
    private Turno turno;

    public Partido(Equipo equipo1,
                   Equipo equipo2,
                   int dia,
                   Turno turno) {

        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        this.turno = turno;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public int getDia() {
        return dia;
    }

    public Turno getTurno() {
        return turno;
    }
}