package Interfaces1;

public class Remera extends Ropa implements Prestable{
    private int medidaEspalda;
    private int contorno;
    private int largoTorso;

    public Remera(String color, MaterialPrenda material,Estado estado,  int medidaEspalda, int largoTorso, int contorno) {
        super(color, material,estado);
        this.medidaEspalda = medidaEspalda;
        this.largoTorso = largoTorso;
        this.contorno = contorno;
    }

    public int getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(int largoTorso) {
        this.largoTorso = largoTorso;
    }

    public int getContorno() {
        return contorno;
    }

    public void setContorno(int contorno) {
        this.contorno = contorno;
    }

    public int getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(int medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    @Override
     public boolean puedePrestar(String objetoAPrestar){
        if(estado.equals(Estado.DESGASTADO)){
            System.out.println("esta remera no se puede prestar");
        }
        else{
            System.out.println("se puede prestar");
        }

    }
}
