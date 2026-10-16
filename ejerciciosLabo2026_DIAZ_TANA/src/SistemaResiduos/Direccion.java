package SistemaResiduos;

public class Direccion {
    private int latitud;
    private int longitud;
    private String barrio;

    public Direccion(int latitud, int longitud, String barrio) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.barrio = barrio;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
