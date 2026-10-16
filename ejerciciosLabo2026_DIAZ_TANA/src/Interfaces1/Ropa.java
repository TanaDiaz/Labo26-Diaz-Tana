package Interfaces1;

public abstract class Ropa {

    private String color;
    private MaterialPrenda material;
    private Estado estado;


    public Ropa(String color, MaterialPrenda material, Estado estado) {
        this.color = color;
        this.material = material;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MaterialPrenda getMaterial() {
        return material;
    }

    public void setMaterial(MaterialPrenda material) {
        this.material = material;
    }

    public Estado isEstado() {
        return estado;
    }

    public void setEstado(Estado Estado) {
        this.estado = estado;
    }
}
