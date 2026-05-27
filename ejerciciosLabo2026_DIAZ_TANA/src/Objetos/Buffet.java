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

}
