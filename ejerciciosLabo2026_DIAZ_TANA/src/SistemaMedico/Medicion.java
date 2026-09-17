package SistemaMedico;


public class Medicion {
    private int altura;
    private int peso;

    public Medicion(int altura,int peso){
        this.altura = altura;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }
    public int getPeso(){
        return peso;
    }


    public void setAltura(int altura){
        this.altura =altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
