package Personas;

public class Persona {

    private int edad;
    private String nombre;
    private String fechaN;
    private String dni;

    public Persona(int edad, String nombre, String fechaN, String dni) {
        this.edad = edad;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void mostrarEdad() {
        System.out.println("La edad es: " + edad);
    }
}