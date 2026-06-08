import java.util.ArrayList;

public class Producto
{

    private String fechaVencimiento;
    private int NumLote
    private String nombre;
    private int id;
    private String paisOrigen;
    private String fechaEnvasado;
    private PaisOrigen paisOrigen;

    public  Producto(String fechaVencimiento, int NumLote, String nombre, int id, String paisOrigen, String fechaEnvasado)
    {
        this.fechaVencimiento = fechaVencimiento;
        this.NumLote = NumLote;
        this.nombre = nombre;
        this.id = id;
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }


    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public PaisOrigen getPaisOrigen(){
        return paisOrigen;
    }


    public void getInfo(){
        System.out.println("Número de identificación: " + this.id + " número de lote: " + this.NumLote);
    }
}

