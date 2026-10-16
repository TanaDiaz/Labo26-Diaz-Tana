package ClubFutbol;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private String nombreClub;
    private List<Persona> plantel;

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
        this.plantel = new ArrayList<>();
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void contratar(Persona persona) {
        // 1. Verificar que nunca haya trabajado en el club
        if (persona.haTrabajadoEn(this.nombreClub)) {
            throw new ContratacionException("No se pudo contratar a " + persona.getNombre() +
                    ": ya trabajó anteriormente en " + this.nombreClub + ".");
        }

        // 2. Validar requisitos según el tipo de persona
        if (persona instanceof Arquero) {
            Arquero a = (Arquero) persona;
            if (!(a.getPorcentajeAtajadas() > 60.0 && a.getGolesRecibidos() < 10)) {
                throw new ContratacionException("El arquero " + a.getNombre() +
                        " no cumple los requisitos (>60% atajadas y <10 goles recibidos).");
            }
        } else if (persona instanceof JugadorDeCampo) {
            JugadorDeCampo jc = (JugadorDeCampo) persona;
            if (!(jc.getPorcentajeGolesConvertidos() > 30.0 && jc.getCantidadAsistencias() > 10)) {
                throw new ContratacionException("El jugador de campo " + jc.getNombre() +
                        " no cumple los requisitos (>30% goles y >10 asistencias).");
            }
        } else if (persona instanceof Entrenador) {
            Entrenador e = (Entrenador) persona;
            if (!(e.isLicenciaProfesionalVigente() && e.getAnosExperiencia() >= 3)) {
                throw new ContratacionException("El entrenador " + e.getNombre() +
                        " no cumple los requisitos (licencia vigente y >= 3 años de experiencia).");
            }
        } else if (persona instanceof PreparadorFisico) {
            PreparadorFisico pf = (PreparadorFisico) persona;
            if (!(pf.isMatriculaHabilitante() && pf.getAnosExperiencia() >= 2)) {
                throw new ContratacionException("El preparador físico " + pf.getNombre() +
                        " no cumple los requisitos (matrícula y >= 2 años de experiencia).");
            }
        }

        // Si cumple todm se incorpora al plantel
        plantel.add(persona);
        System.out.println(persona.getNombre() + " fue contratado por " + this.nombreClub + ".");
    }

    public void renovar(Persona persona) {
        // 1. Verificar que se encuentre trabajando en el club
        if (!plantel.contains(persona)) {
            throw new RenovacionException("La renovación de " + persona.getNombre() +
                    " fue rechazada: no pertenece al plantel actual de " + this.nombreClub + ".");
        }

        // 2. Validar reglas de renovación
        if (persona instanceof Jugador) {
            if (persona.calcularEdad() > 35) {
                throw new RenovacionException("Renovación rechazada para " + persona.getNombre() +
                        ": supera los 35 años de edad (" + persona.calcularEdad() + " años).");
            }
        } else if (persona instanceof Entrenador) {
            Entrenador e = (Entrenador) persona;
            if (!e.isLicenciaProfesionalVigente()) {
                throw new RenovacionException("Renovación rechazada para el entrenador " + e.getNombre() +
                        ": su licencia profesional no está vigente.");
            }
        } else if (persona instanceof PreparadorFisico) {
            PreparadorFisico pf = (PreparadorFisico) persona;
            if (!pf.isMatriculaHabilitante()) {
                throw new RenovacionException("Renovación rechazada para el preparador físico " + pf.getNombre() +
                        ": no cuenta con matrícula habilitante.");
            }
        }

        System.out.println(persona.getNombre() + " renovó su contrato con " + this.nombreClub + ".");
    }

    public void mostrarPlantel() {
        System.out.println("\n--- PLANTEL ACTUAL DE " + this.nombreClub.toUpperCase() + " ---");
        if (plantel.isEmpty()) {
            System.out.println("El plantel está vacío.");
        } else {
            for (Persona p : plantel) {
                p.mostrarInformacion();
            }
        }
        System.out.println("-------------------------------------------\n");
    }
}
