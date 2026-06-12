package Curling;
import java.time.LocalDate;

public class Mainfff {

    public static void main(String[] args) {

        Equipo tigres = new Equipo("papus");
        Equipo leones = new Equipo("evil papus");

        for (int i = 1; i <= 11; i++) {

            tigres.agregarJugador(
                    new Jugador(
                            "J" + i,
                            "A",
                            LocalDate.of(2000,1,1),
                            i,
                            i == 1
                    )
            );

            leones.agregarJugador(
                    new Jugador(
                            "L" + i,
                            "B",
                            LocalDate.of(2000,1,1),
                            i,
                            i == 1
                    )
            );
        }

        tigres.agregarDisponibilidad(Turno.MANIANA);
        tigres.agregarDisponibilidad(Turno.TARDE);

        leones.agregarDisponibilidad(Turno.TARDE);
        leones.agregarDisponibilidad(Turno.NOCHE);

        Campeonato campeonato = new Campeonato();

        campeonato.agregarEquipo(tigres);
        campeonato.agregarEquipo(leones);

        campeonato.generarFixture();
        campeonato.mostrarFixture();
    }
}