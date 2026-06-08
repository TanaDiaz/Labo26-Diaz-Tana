import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ProdFresco productoF1 = new ProdFresco("2026-12-01", 101, "Lechuga", 1, PaisOrigen.ARGENTINA, "2026-06-01");
        ProdFresco productoF2 = new ProdFresco("2026-11-15", 102, "Tomate", 2, PaisOrigen.CHILE, "2026-06-05");

        ProdRefrigerado productoR1 = new ProdRefrigerado(4, "2026-08-20", 201, "Yogur", 3, PaisOrigen.CHILE, "2026-05-20");
        ProdRefrigerado productoR2 = new ProdRefrigerado(5, "2026-09-10", 202, "Queso", 4, PaisOrigen.ARGENTINA, "2026-05-25");
        ProdRefrigerado productoR3 = new ProdRefrigerado(3, "2026-10-05", 203, "Crema", 5, PaisOrigen.BRASIL, "2026-05-22");

        ArrayList<Producto> listaInicial = new ArrayList<>();
        Empresa miEmpresa = new Empresa(listaInicial);

        miEmpresa.addProd(productoF1);
        miEmpresa.addProd(productoF2);
        miEmpresa.addProd(productoR1);
        miEmpresa.addProd(productoR2);
        miEmpresa.addProd(productoR3);


        System.out.println("Info del Producto F1");
        System.out.println(productoF1.getInfo());

        System.out.println("fecha del fresco más recientemente envasado");
        String fechaReciente = miEmpresa.MasEnvasado();
        System.out.println("la fecha más reciente es: " + fechaReciente);

        System.out.println("cantidad de productos por país");
        ArrayList<Integer> totalesPorPais = miEmpresa.productosPais();

        System.out.println("Resultados [ARG, BRA, URU, CHI]: " + totalesPorPais);
    }
}