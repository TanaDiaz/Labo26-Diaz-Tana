/*package Unidad_0;

import java.time.LocalDate;

public class Libro
{
    private String titulo;
    private Unidad_0.Persona autor;
    private int ISBN;
    private int cantPags;
    private String editorial;
    private LocalDate fechaPubli;


    public Libro(String titulo, Unidad_0.Persona autor, int ISBN, int cantPags, String editorial, LocalDate fechaPubli){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.cantPags = cantPags;
        this.editorial = editorial;
        this.fechaPubli = fechaPubli;
    }

    public Libro(){
        this.titulo = "Libro";
        this.autor = new Persona();
        this.ISBN = 0000000000000000;
        this.cantPags = 100;
        this.editorial = "Alianza editorial";
        this.fechaPubli = LocalDate.of(1900, 1, 1);
    }

    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.ISBN = ISBN;
    }
    public Libro(String editorial, Unidad_0.Persona autor){
        this.editorial = editorial;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getCantPags() {
        return cantPags;
    }

    public Persona getAutor() {
        return autor;
    }

    public LocalDate getFechaPubli() {
        return fechaPubli;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setCantPags(int cantPags) {
        this.cantPags = cantPags;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaPubli(LocalDate fechaPubli) {
        this.fechaPubli = fechaPubli;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarDatos(){
        System.out.println("El titulo es: " + getTitulo());
        System.out.println("El autor es: " + getAutor());
        System.out.println("El ISBN es: " + getISBN());
        System.out.println("La cantidad de paginas es: " + getCantPags());
        System.out.println("La editorial es: " + getEditorial());
        System.out.println("La fecha de publicacion es: " + getFechaPubli());
    }
    public boolean esAnterior(Libro libro) {
        return this.fechaPubli.isBefore(libro.fechaPubli);
    }


   public static void main(String[] args){

        Libro libro = new Libro();
        Persona autor1 = new Persona();
        LocalDate fechaPubli1 = LocalDate.of(1922,2,4);
        Libro libro2 = new Libro("La Venganza de los Chamos 11", autor1, 74822348, 434, "Papu Editorial", fechaPubli1);

        boolean anterior = libro.esAnterior(libro2);
        if(anterior == true) System.out.println("Efectivamente es anterior");
        else System.out.println("NO es anterior");
        
        libro.mostrarDatos();
    }
}

 */