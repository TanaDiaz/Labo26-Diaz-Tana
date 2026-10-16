package PapuError;

public class Main{
    public static void Main(String[] args) {


        try {
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error, el nombre es null");
        }
    }

    public void obtenerLongitud(String nombre) throws NullPointerException{
        if(nombre == null){
            throw new NullPointerException("Error, nombre es null");
        }
        System.out.println(nombre.length());
    }

    public void obtenerLong(String nombre) throws ExceptionLongNull{
        if(nombre == null){
            throw new ExceptionLongNull("Error, nombre es null");
        }
        System.out.println(nombre.length());
    }
}




