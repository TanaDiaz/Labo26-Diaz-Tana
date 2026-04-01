package Unidad_0;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Pérez", 69, "Zamudio 3827432894");
        persona1.imprimirDatos();
    }
}