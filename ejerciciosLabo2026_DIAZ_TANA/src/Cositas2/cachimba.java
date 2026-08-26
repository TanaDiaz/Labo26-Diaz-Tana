package Cositas2;

import java.util.ArrayList;

public class cachimba {
    private ArrayList<String>nombres;

    public cachimba(ArrayList<String>nombres){

        this.nombres = nombres;
    }

    public ArrayList<String> getNombres() {
        return nombres;
    }

    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    static void main(String[] args) {
        ArrayList<String>nombres = new ArrayList<>();

        nombres.add("nigga");
        nombres.add("pichi");
        nombres.add("cataplin");

        System.out.println(nombres);




    }











}
