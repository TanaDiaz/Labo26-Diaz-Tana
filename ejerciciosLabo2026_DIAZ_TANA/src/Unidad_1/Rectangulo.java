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

    public float GetBase(){
    return base;
}

 public void SetAltura(float altura) {
     this.altura = altura;
 }
    public void SetBase(float base) {
        this.base = base;
    }

    float CalcularArea (float altura , float base){
    float area = (base * altura);
    return area;
    }

    float CalcularPerimetro (float altura , float base){
        float  perimetro = 2*(base + altura);
        return perimetro;
    }




}
