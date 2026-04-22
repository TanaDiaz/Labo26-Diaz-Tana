package Unidad_1;

public class Persona {

    // Atributo
    private int edad;

    // Constructor
    public Persona(int edad) {
        this.edad = edad;
    }

    // Getter
    public int getEdad() {
        return edad;
    }

    // Setter
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método extra (opcional)
    public void mostrarEdad() {
        System.out.println("La edad es: " + edad);
    }
}