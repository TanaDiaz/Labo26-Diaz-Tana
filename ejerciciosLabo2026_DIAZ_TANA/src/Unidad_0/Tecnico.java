package Unidad_0;

import java.security.PublicKey;
import java.time.LocalDate;

public class Tecnico {
    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private String especialidad;
    private Cohetito coheteAsig;

    public Tecnico(String nombre, String apellido, LocalDate fecha, String especialidad, Cohetito coheteAsig) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.coheteAsig = coheteAsig;
    }
    //gets


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Cohetito getCoheteAsig() {
        return coheteAsig;
    }
    //sets

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCoheteAsig(Cohetito coheteAsig) {
        this.coheteAsig = coheteAsig;
    }
    public void Actibasion(){
        this.coheteAsig.activacionProp(3);
    }
    public boolean Capacidad(Cohetito cohete){
        boolean cap = true;
        if(cohete.getCantProp() >= 4 && !especialidad.equals("Propulsion") ){
            cap = false;
        }
        else if(cohete.getLargo() > 70 && !especialidad.equals("Estructura") ){
            cap = false;
        }
        else if(cohete.getVelomax() > 28000 && !especialidad.equals("Navegacion") ){
            cap = false;
        }
        return cap;
    }
    public boolean cambiodecohete(Cohetito cohete){
        if(Capacidad(cohete)) {
            setCoheteAsig(cohete);
            return true;
        }
        else {
            System.out.println("no se pudo realizar el cambio de cohetes");
            return false;
        }
    }

   public static void main(String[] args) {
        Cohetito cohete1 = new Cohetito( "orion v", 30000, 75, 9, 5);
        Cohetito cohete2 = new Cohetito( "Lunar x", 27500, 68, 8, 4);
        Cohetito cohete3 = new Cohetito( "Cosmos Max",35000, 90, 11, 8);
        Tecnico tecnico1 = new Tecnico("robert", "Diaz", LocalDate.of(2000, 12, 12), "Propulsion", cohete1);
        Tecnico tecnico2 = new Tecnico("carlos", "Fuentes", LocalDate.of(2001, 12, 12), "Navegacion", cohete2);

        tecnico1.cambiodecohete(cohete2);
        tecnico2.cambiodecohete(cohete3);

        tecnico1.Actibasion();
        tecnico2.Actibasion();

        tecnico1.getCoheteAsig().calculartime(10000);
    }

}
