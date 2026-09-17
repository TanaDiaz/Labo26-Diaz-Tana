package Personas;

public abstract class Persona {

    private int edad;
    private String nombre;
    private String apellido;
    private String fechaN;
    private String dni;
    private int altura;
    private int peso;

    public Persona(int edad, String nombre, String apellido, String fechaN, String dni, int altura, int peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.dni = dni;
        this.altura = altura;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}