package Interfaces1;

import java.time.LocalDate;

public class Libro extends Papel implements Prestable{

    private int pagCap;

    public Libro(int codigo, String titulo, LocalDate anioCreacion, int pagCap) {
        super(codigo, titulo, anioCreacion);
        this.pagCap = pagCap;
    }

    public int getPagCap() {
        return pagCap;
    }

    public void setPagCap(int pagCap) {
        this.pagCap = pagCap;
    }

    @Override
    public void prestar(String objetoAPrestar) {

    }

    @Override

    public boolean puedePrestar(String objetoAPrestar){
        if(pagCap % 2 == 1){
            System.out.println("el libro se puede prestar");
        }
        else{
            System.out.println("el libro no se puede prestar");
        }

        return false;
    }

    @Override
    public void devover() {

    }
}
