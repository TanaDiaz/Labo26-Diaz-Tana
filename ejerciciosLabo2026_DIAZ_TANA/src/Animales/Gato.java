package Animales;

public class Gato extends Animal {

    public Gato(String nombre, String dueño) {
        super(nombre, dueño);
    }

    public void saludo(){
        System.out.println("Miau");
    }

    @Override
    public void saludoExtraño(){
        System.out.println("MIAU!");
    }

}
