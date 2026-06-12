package Cocina;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Ingrediente> ingredientes;

    public Stock(ArrayList<Ingrediente>ingredientes){
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    public void setIngredientes(ArrayList<Ingrediente>ingredientes ){
        this.ingredientes = ingredientes;
    }

    public int cantidadStock(ArrayList<Ingrediente>ingredientes){
        int cantIngredientes = ingredientes.size();
        return cantIngredientes;

    }

}
