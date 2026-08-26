package Personas;

public abstract class PersonaEducativa extends Persona

{
    private double descuento;

    public PersonaEducativa(int edad, String nombre, double descuento) {
        super(String.valueOf(edad), nombre);
        this.descuento = descuento;
    }

    public PersonaEducativa(String nombre, String apellido, double descuento) {
        super(nombre, apellido);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}



