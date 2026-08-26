import java.util.ArrayList;

public class Mani  {
    private String nombre;
    private ArrayList<String>nombres;

    public Mani(String nombre) {
        this.nombre = nombre;
        this.nombres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }


    static void main(String[] args) {
        ArrayList<String>nombres = new ArrayList<>();
        nombres.add("cachimba");
        System.out.println(nombres.get(0));
    }
}
