package Repaso;

import EJ6.Producto;

import java.util.ArrayList;

public class Company {
   private ArrayList<Producto> productos ;

    public Company(ArrayList<Producto> productos) {
        this.productos = productos;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(ArrayList<Producto>productos, Producto p){

        productos.add(p);


    }




}
