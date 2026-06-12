package Llamadas;

public class Empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private String pais;
    private String numeroTel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public Boolean verificarPais(Empleado empleado2) {
        Boolean localidad = false;
        if (this.getPais().equals(empleado2.getPais())) {
            localidad = true;
        }
        return localidad;
    }

}
