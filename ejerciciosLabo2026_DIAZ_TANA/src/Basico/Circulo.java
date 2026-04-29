package Basico;

public class Circulo {

    private float radio;

    public Circulo() {
        this.radio = 2;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getCirculo() {
        return radio;
    }

    public void setCirculo(float radio) {
        this.radio = radio;
    }

    float area(float radio, float pi) {
        float resu = (float) (pi * Math.pow(radio, 2));
        return resu;
    }

    float perimetro(float radio, float pi) {
        float resu = (float) 2 * pi * radio;
        return resu;
    }


    static void main() {

    }
}