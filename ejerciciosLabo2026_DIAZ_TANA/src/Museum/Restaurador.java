package Museum;
import java.time.LocalDate;

public class Restaurador {

    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private int aniosExperiencia;

    public Restaurador(String nombre,
                       String apellido,
                       int dni,
                       LocalDate fechaNacimiento,
                       int aniosExperiencia) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String restaurar(Cuadro cuadro) {

        int estadoAnterior = cuadro.getEstadoConservacion();

        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - cuadro.getAnioCreacion();

        int mejora;

        if (antiguedad > 25) {
            mejora = 2;
        } else {
            mejora = 3;
        }

        int nuevoEstado = estadoAnterior + mejora;

        if (nuevoEstado > 10) {
            nuevoEstado = 10;
        }

        cuadro.setEstadoConservacion(nuevoEstado);

        return "El cuadro '" + cuadro.getTitulo()
                + "' estaba en estado "
                + estadoAnterior
                + " y quedo en estado "
                + nuevoEstado;
    }
}