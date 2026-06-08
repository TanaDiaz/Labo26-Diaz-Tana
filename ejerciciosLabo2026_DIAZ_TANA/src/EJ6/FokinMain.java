package EJ6;

public class FokinMain {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        EquipoSonido equipo1 =
                new EquipoSonido("jeibiel 1", 500000, 20, true);

        Televisor tv1 =
                new Televisor("samsung inteligente tebe", 1200000, 10,
                        TecnologiaTV.CUATRO_K, "3840x2160");

        CargadorPortatil cargador1 =
                new CargadorPortatil("xiaomi glory to mao 4", 80000, 50, 8);

        tienda.agregarProducto(equipo1);
        tienda.agregarProducto(tv1);
        tienda.agregarProducto(cargador1);

        System.out.println("PRODUCTO CON MAYOR STOCKEADOVICH");
        System.out.println(tienda.productoMayorStock());

        System.out.println();

        System.out.println("PRODUCTO CON MENOR STOCK");
        System.out.println(tienda.productoMenorStock());

        System.out.println();

        System.out.println("PRODUCTOS DE MULTIMEDI");
        tienda.mostrarProductosPorSeccion(Seccion.MULTIMEDIA);

        System.out.println();

        tienda.modificarStock("samsung inteligente tebe", 100);

        tienda.eliminarProducto("jeibiel 1");
    }
}
