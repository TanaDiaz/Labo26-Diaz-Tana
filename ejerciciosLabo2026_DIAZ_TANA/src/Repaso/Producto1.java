package Repaso;

public class Producto1 {

    private String fecha_vencimiento;
    private int nmr_lote;
    private String nombre;
    private int cod_id;
    private Paises pais;
    private String fecha_envasado;

    public Producto1(String fecha_vencimiento, int nmr_lote, String nombre, int cod_id,Paises pais,String fecha_envasado){

        this.fecha_vencimiento = fecha_vencimiento;
        this.nmr_lote = nmr_lote;
        this.nombre = nombre;
        this.cod_id = cod_id;
        this.pais = pais;
        this.fecha_envasado=fecha_envasado;

    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public int getNmr_lote() {
        return nmr_lote;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCod_id() {
        return cod_id;
    }

    public void setFecha_vencimiento(String fecha_vencimiento){
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setNmr_lote(int nmr_lote) {
        this.nmr_lote = nmr_lote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Paises getPais() {
        return pais;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    public void setCod_id(int cod_id) {
        this.cod_id = cod_id;
    }

    public String getFecha_envasado() {
        return this.fecha_envasado = fecha_envasado;
    }

   public void setFecha_envasado(String fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }


    public String mostrarInfo (){

    }









}