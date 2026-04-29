package Objetos;

public class Museo {
    private String titulo;
    private String pintor;
    private int anoCreacion;
    private int estadoConserv;
    private Restaurador restaurador;

    public Museo(){
        this.titulo = "Nigga Museum";
        this.pintor = "La Venganza del Chamo III";
        this.anoCreacion = 1499;
        this.estadoConserv = 7;
        this.restaurador = new Restaurador();
    }
    public Museo(String titulo, String pintor, int anoCreacion, int estadoConserv, Restaurador restaurador){
        this.titulo = titulo;
        this.pintor = pintor;
        this.anoCreacion = anoCreacion;
        this.estadoConserv = estadoConserv;
        this.restaurador = restaurador;
    }

    public String restaurar() {
        int restauracion = 3;
        int before = estadoConserv;
        if (anoCreacion < 2026 - 25) {
            restauracion--;
        }
        estadoConserv+=restauracion;
        while(estadoConserv > 10){
            estadoConserv--;
        }
            return "El estado antes de la restauracion era " + before + "y ahora es " + estadoConserv;
    }

    static void main(String[] args) {

        Museo museo = new Museo();
        System.out.println(museo.restaurar());
    }
}
