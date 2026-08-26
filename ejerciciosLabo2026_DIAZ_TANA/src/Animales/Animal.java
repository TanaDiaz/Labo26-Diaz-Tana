package Animales;

import Personas.UsuarioMascota;

public abstract class Animal {
    private String nombre;
    private String dueño;

    public Animal(String nombre, String dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }
    public abstract void saludo();
    public void saludoExtraño(){}

    public void saludar(UsuarioMascota usuario){

        if(this.dueño.equals(usuario.getNombre())){
            this.saludo();
        }

        else{
            this.saludoExtraño();
        }



    }
}
