package PaginaWeb;

public class Perifericos extends Componentes{

    private String tipo;

    public Perifericos(float precio, String modelo, String nombreFa, int stock, Boolean tipo) {
        super(precio, modelo, nombreFa, stock);
        this.tipo = tipo;
    }
}
