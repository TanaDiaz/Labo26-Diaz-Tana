package Basico;
import java.util.Scanner;

public class Rect {
    private int alto;
    private int ancho;

    public Rect(){
        this.alto = 2;
        this.ancho = 3;
    }

    public Rect(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto(){
        return alto;
    }

    public int getAncho(){
        return ancho;
    }

    public void setAlto(int alto){
        this.alto = alto;
    }

    public void setAncho(int ancho){
        this.ancho = ancho;
    }

    public int calcularArea(){
     int area = alto * ancho;
     return area;

    }

    public int calcularPerimetro(){
        int perimetro = 2 * (alto + ancho);
        return perimetro;
    }

    public void esCuadrado(){
        if(alto == ancho){
            System.out.println("Es cuadrado");
        }
        else{
            System.out.println("No es cuadrado");
        }

    }

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rect rectangulo = new Rect();
        System.out.println("ingresa tus valores");
        System.out.println("alto: ");
        int alto = scanner.nextInt();
        System.out.println("ancho: ");
        int ancho = scanner.nextInt();
        System.out.println("este es tu perimetro: " + rectangulo.calcularPerimetro());


    }

}

