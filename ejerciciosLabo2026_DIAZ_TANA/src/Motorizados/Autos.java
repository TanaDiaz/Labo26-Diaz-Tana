package Motorizados;

public class Autos extends Vehiculos{
    private int capaCarga;
    private boolean descapotable;



    public Autos(int capaCarga, boolean descapotable, String color, String marca , int CantRuedas, String modelo, String anoFabricacion, String patente ){
        super(marca, modelo, color, CantRuedas, anoFabricacion, patente);
        this.capaCarga = capaCarga;
        this.descapotable = descapotable;
    }


    public int getCapaCarga() {
        return capaCarga;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setCapaCarga(int capaCarga){
        this.capaCarga = capaCarga;
    }


    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
















}

