package Animales;

public class Perro extends Animal{

    public Perro(String nombre, String dueño) {
        super(nombre, dueño);
    }

    public void saludo(){
        System.out.println("Guau");
    }

    @Override
    public void saludoExtraño(){
        System.out.println("GUAU!");
    }

}
