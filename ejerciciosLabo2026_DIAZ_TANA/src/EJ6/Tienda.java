package EJ6;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {

        for (int i = productos.size() - 1; i >= 0; i--) {

            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
            }

        }

    }

    public void modificarStock(String nombre, int nuevoStock) {

        for (Producto producto : productos) {

            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                producto.setStock(nuevoStock);
            }

        }

    }

    public Producto productoMayorStock() {

        Producto mayor = productos.get(0);

        for (Producto producto : productos) {

            if (producto.getStock() > mayor.getStock()) {
                mayor = producto;
            }

        }

        return mayor;
    }

    public Producto productoMenorStock() {

        Producto menor = productos.get(0);

        for (Producto producto : productos) {

            if (producto.getStock() < menor.getStock()) {
                menor = producto;
            }

        }

        return menor;
    }

    public void mostrarProductosPorSeccion(Seccion seccion) {

        for (Producto producto : productos) {

            if (producto.getSeccion() == seccion) {
                System.out.println(producto);
            }

        }

    }
}