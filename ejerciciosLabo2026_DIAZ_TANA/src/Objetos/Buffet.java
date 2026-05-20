package Objetos;

import java.util.ArrayList;

public class Buffet {

    private ArrayList<Plato> platosMenu;
    private ArrayList<Pedido> pedidosLista;

    public Plato getPlatosMenu(int indice) {
        return platosMenu.get(indice);
    }

    public void setPlatosMenu(ArrayList<Plato> platosMenu) {
        this.platosMenu = platosMenu;
    }

    public Pedido getPedidosLista(int indice) {
        return pedidosLista.get(indice);
    }

    public void setPedidosLista(ArrayList<Pedido> pedidosLista) {
        this.pedidosLista = pedidosLista;
    }

    public void delPlatosMenu(int indice) {
        platosMenu.remove(indice);
    }

    public void delPedidosLista(int indice) {
        pedidosLista.remove(indice);
    }

    public int precioPedidoDia() {

    }
}
        /*Al cargarse un pedido se incluye la fecha de creación, el plato, la persona que lo
pidió, hora de entrega y si fue entregado o no. En el sistema debe existir un menú
de platos donde se puedan agregar, modificar y eliminar platos y una lista de los
pedidos.
Así, se solicita extraer un listado de los platos a cocinar en un día determinado
con su precio final (considerando si tiene descuento o no). Por otro lado, se debe
poder marcar un pedido como entregado y listar pedidos pendientes de entrega.
Por último, se solicita un top 3 de los platos más pedidos*/






/*
4. Suponiendo que agregamos una columna llamada “nivel” en la tabla de proveedores, se
pide realizar un procedimiento que calcule la cantidad de ingresos por proveedor en los
últimos 2 meses y actualice el nivel del proveedor. Los niveles son “Bronce” hasta 50
ingresos inclusive, “Plata” de 50 a 100 ingresos inclusive y “Oro” más de 100*/


/*


delimiter //
create procedure calcularIngresos2meses()

























 */
}