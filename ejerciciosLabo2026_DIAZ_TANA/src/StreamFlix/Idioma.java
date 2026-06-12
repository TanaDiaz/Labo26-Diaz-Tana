package StreamFlix;

public enum Idioma {

    ESPAÑOL(1),INGLES(2),FRANCES(3),COREANO(4);


    private int codigoPa;

    private Idioma(int codigoPa){
        this.codigoPa= codigoPa;

    }

    public int getCodigoPa() {
        return codigoPa;
    }

    public void setCodigoPa(int codigoPa) {
        this.codigoPa = codigoPa;
    }
}
