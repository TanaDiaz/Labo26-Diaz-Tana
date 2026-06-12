import EJ6.Producto;

import java.util.ArrayList;

public class Empresa {

private ArrayList<Producto> productos;

public Empresa(ArrayList<Producto>productos){
    this.productos = productos;
}

public void addProd(Producto x){
    productos.add(x);
}

    public String MasEnvasado(){
        String envaseReciente = null;
        for(Producto producto: productos){

            if (this.getTempMantenimiento() != null && this.getFechaEnvasado() > envaseReciente){
                envaseReciente = this.getFechaEnvasado();
            }
        }
        return envaseReciente;
    }

    public ArrayList<Integer> productosPais() {

        ArrayList<Integer>productosPorPais = new ArrayList<>();

        int arg = 0;
        int bra = 0;
        int uru = 0;
        int chi = 0;

        for(Producto p: productos){
        if(p.getPaisOrigen().equals(PaisOrigen.ARGENTINA)){
            arg++;
        }

        if(p.getPaisOrigen().equals(PaisOrigen.BRASIL)){
            bra++;
        }

        if(p.getPaisOrigen().equals(PaisOrigen.URUGUAY)){
            uru++;
        }

        if(p.getPaisOrigen().equals(PaisOrigen.CHILE)){
                chi++;
            }
    }
        productosPais.set(0, arg);
        productosPorPais.set(1, bra);
        productosPorPais.set(2, uru);
        productosPorPais.set(3, chi);


        return productosPorPais;

    }
}