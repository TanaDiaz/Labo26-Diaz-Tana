package ClubFutbol;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Club river = new Club("river plate");

        // Creamos personas de prueba
        Arquero arqueroExitoso = new Arquero(
                "franco armani", LocalDate.of(1986, 10, 16),
                Arrays.asList("atlético nacional"), "Santa Fe", 1, 75.5, 6
        );

        JugadorDeCampo delantero = new JugadorDeCampo(
                "facundo colidio", LocalDate.of(2000, 1, 4),
                Collections.emptyList(), "delantero", "Santa Fe", 11, 35.0, 12
        );

        Entrenador dt = new Entrenador(
                "marcelo gallardo", LocalDate.of(1976, 1, 18),
                Arrays.asList("nacional"), "DT", 12, 14, true
        );

        // Persona que ya trabajó en River (Fallará contratación)
        Arquero arqueroAntiguo = new Arquero(
                "Batalla", LocalDate.of(1996, 4, 11),
                Arrays.asList("River Plate", "San Lorenzo"), "Buenos Aires", 12, 80.0, 5
        );

        try {
            System.out.println("--- PRUEBAS DE CONTRATACIÓN --");
            river.contratar(arqueroExitoso);
            river.contratar(delantero);
            river.contratar(dt);

            // Esto tira excepción porque ya trabajó en el club
            river.contratar(arqueroAntiguo);

        } catch (ContratacionException e) {
            System.err.println("Error de contratación: " + e.getMessage());
        }

        river.mostrarPlantel();

        try {
            System.out.println("--- PRUEBAS DE RENOVACIÓN ---");
            // armani tiene más de 35, su renovación va a fallar
            river.renovar(arqueroExitoso);

        } catch (RenovacionException e) {
            System.err.println("Error de renovación: " + e.getMessage());
        }

        try {
            // el dt sí puede renovar porque tiene licencia vigente
            river.renovar(dt);
        } catch (RenovacionException e) {
            System.err.println("Error de renovación: " + e.getMessage());
        }
    }
}
