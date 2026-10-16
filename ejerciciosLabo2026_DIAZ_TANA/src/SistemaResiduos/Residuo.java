package SistemaResiduos;

public class Residuo {
    private String nombre;
    private Boolean reciclable;
    private String tratamiento;

    public Residuo(String nombre, Boolean reciclable, String tratamiento){
    this.nombre = nombre;
    this.reciclable = reciclable;
    this.tratamiento = tratamiento;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setReciclable(Boolean reciclable) {
        this.reciclable = reciclable;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public Boolean getReciclable() {
        return reciclable;
    }
}
