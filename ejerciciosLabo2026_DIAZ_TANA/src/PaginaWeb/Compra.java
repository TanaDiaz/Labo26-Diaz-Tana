package PaginaWeb;

import java.util.ArrayList;

public class Compra {
    private String nombreC;
    private String apellidoC;
    private String telefonoC;
    private String metodoPago;
    private ArrayList<Componentes> productos;
    private Boolean valida;


    public Compra(String nombreC, String apellidoC, String telefonoC, String metodoPago, ArrayList<Componentes> productos, Boolean valida) {
        this.nombreC = nombreC;
        this.apellidoC = apellidoC;
        this.telefonoC = telefonoC;
        this.metodoPago = metodoPago;
        this.productos = productos;
        this.valida = valida;
    }


    public String getNombre() {
        return nombreC;
    }

    public void setNombre(String nombre) {
        this.nombreC = nombreC;
    }

    public String getApellido() {
        return apellidoC;
    }

    public void setApellido(String apellido) {
        this.apellidoC = apellidoC;
    }

    public String getTelefono() {
        return telefonoC;
    }

    public void setTelefono(String telefono) {
        this.telefonoC = telefonoC;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ArrayList<Componentes> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Componentes> productos) {
        this.productos = productos;
    }

    public Boolean getValida() {
        return valida;
    }

    public void setValida(Boolean valida) {
        this.valida = valida;
    }

    public boolean validarCompra(){
        if(this.metodoPago.equals("Efectivo")){

        }

    }













}
