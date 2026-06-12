package Curling;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private List<Equipo> equipos;
    private List<Partido> fixture;

    public Campeonato() {
        equipos = new ArrayList<>();
        fixture = new ArrayList<>();
    }

    public void agregarEquipo(Equipo equipo) {

        if (equipo.esValido()) {
            equipos.add(equipo);
        } else {
            System.out.println("Equipo inválido: "
                    + equipo.getNombre());
        }
    }

    public void generarFixture() {

        int dia = 1;

        for (int i = 0; i < equipos.size(); i++) {

            for (int j = i + 1; j < equipos.size(); j++) {

                Equipo e1 = equipos.get(i);
                Equipo e2 = equipos.get(j);

                Turno turnoComun = obtenerPrimerTurnoComun(e1, e2);

                if (turnoComun == null) {

                    System.out.println(
                            "No se puede programar el partido entre "
                                    + e1.getNombre()
                                    + " y "
                                    + e2.getNombre()
                    );

                    continue;
                }

                fixture.add(
                        new Partido(e1, e2, dia, turnoComun)
                );

                dia++;
            }
        }
    }

    private Turno obtenerPrimerTurnoComun(
            Equipo e1,
            Equipo e2) {

        if (e1.getDisponibilidades().contains(Turno.MANIANA)
                && e2.getDisponibilidades().contains(Turno.MANIANA)) {
            return Turno.MANIANA;
        }

        if (e1.getDisponibilidades().contains(Turno.TARDE)
                && e2.getDisponibilidades().contains(Turno.TARDE)) {
            return Turno.TARDE;
        }

        if (e1.getDisponibilidades().contains(Turno.NOCHE)
                && e2.getDisponibilidades().contains(Turno.NOCHE)) {
            return Turno.NOCHE;
        }

        return null;
    }

    public void mostrarFixture() {

        for (Partido p : fixture) {

            System.out.println(
                    "Dia " + p.getDia()
                            + " - " + p.getTurno()
                            + ": "
                            + p.getEquipo1().getNombre()
                            + " vs "
                            + p.getEquipo2().getNombre()
            );
        }
    }
}
