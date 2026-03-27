package Unidad_1;

public class Rectangulo {
    private float altura;
    private float base;

public Rectangulo(float altura , float base ) {
    this.altura = altura;
    this.base = base;
}

    public float getAltura() {
        return altura;
    }

    public float getBase(){
    return base;
}

 public void setAltura(float altura) {
     this.altura = altura;
 }
    public void setBase(float base) {
        this.base = base;
    }

    float calcularArea (float altura , float base){
    float area = (base * altura);
    return area;
    }

    float calcularPerimetro (float altura , float base){
        float  perimetro = 2*(base + altura);
        return perimetro;
    }




}
