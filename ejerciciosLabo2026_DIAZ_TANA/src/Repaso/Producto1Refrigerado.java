package Repaso;

public class Producto1Refrigerado extends Producto1 {

    private int tempMante;

public Producto1Refrigerado(Paises pais, String nombre, int cod_id, int nmr_lote, String fecha_vencimiento,String fecha_envasado,int tempMante) {

    super(fecha_vencimiento, nmr_lote, nombre, cod_id, pais, fecha_envasado);
    this.tempMante=tempMante;

}


    public int getTempMante() {
        return tempMante;
    }

    public void setTempMante(int tempMante) {
        this.tempMante = tempMante;
    }
}