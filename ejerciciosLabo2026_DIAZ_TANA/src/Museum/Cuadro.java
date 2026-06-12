package Museum;
public class Cuadro {

    private String titulo;
    private String pintor;
    private int anioCreacion;
    private int estadoConservacion;

    public Cuadro(String titulo, String pintor,
                  int anioCreacion,
                  int estadoConservacion) {

        this.titulo = titulo;
        this.pintor = pintor;
        this.anioCreacion = anioCreacion;
        this.estadoConservacion = estadoConservacion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public int getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(int estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public String getTitulo() {
        return titulo;
    }
}
