package PaginaWeb;

public class Tarjeta extends MetodoDePago {
    private String numTar;
    private  String banco;
    private  boolean debito;


    public Tarjeta(String numTar, String banco, boolean debito) {
        super(5);
        this.numTar = numTar;
        this.banco = banco;
        this.debito = debito;
    }

    public String getNumTar() {
        return numTar;
    }

    public void setNumTar(String numTar) {
        this.numTar = numTar;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }
}
