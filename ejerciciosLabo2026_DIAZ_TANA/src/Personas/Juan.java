package Personas;

public class Juan {
    private String nombre;
    private int edad;

    public Juan (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;


    }

    public Juan(){
        this.nombre = "juan";
        this.edad = 22;

    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }


    static void main(String[] args) {
        
    }
}
