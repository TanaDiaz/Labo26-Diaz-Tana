package Animales;

public class PajaroCantor extends Animal{
    private String saludoAnimal;
    public PajaroCantor(String nombre, String dueño) {
        super(nombre, dueño);
    }

    public void saludo(){
        System.out.println(this.saludoAnimal);
    }
    public void saludoExtraño(){
        System.out.println(this.saludoAnimal);
    }

}
