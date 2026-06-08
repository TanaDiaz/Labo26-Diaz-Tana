package Arrays;

import java.util.ArrayList;

class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String color;
    protected int cantidadRuedas;
    protected int anioFabricacion;

    public Vehiculo(String marca, String modelo, String color,
                    int cantidadRuedas, int anioFabricacion) {

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadRuedas = cantidadRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public void mostrarDatos() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Ruedas: " + cantidadRuedas);
        System.out.println("Año: " + anioFabricacion);
    }
}

class Auto extends Vehiculo {

    private String patente;
    private boolean descapotable;

    public Auto(String marca, String modelo, String color,
                int cantidadRuedas, int anioFabricacion,
                String patente, boolean descapotable) {

        super(marca, modelo, color, cantidadRuedas, anioFabricacion);

        this.patente = patente;
        this.descapotable = descapotable;
    }

    public String getPatente() {
        return patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Patente: " + patente);
        System.out.println("Descapotable: " + descapotable);
    }
}

class Camioneta extends Vehiculo {

    private String patente;
    private double capacidadCarga;
    private double cargaActual;

    public Camioneta(String marca, String modelo, String color,
                     int cantidadRuedas, int anioFabricacion,
                     String patente, double capacidadCarga) {

        super(marca, modelo, color, cantidadRuedas, anioFabricacion);

        this.patente = patente;
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void agregarCarga(double kg) {

        if (kg <= 0) {

            System.out.println("La carga debe ser positiva.");
            return;
        }

        if (cargaActual + kg <= capacidadCarga) {

            cargaActual += kg;

            System.out.println("Carga agregada correctamente.");
            System.out.println("Carga actual: " + cargaActual + " kg");

        } else {

            System.out.println("No se puede superar la capacidad máxima.");
        }
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Patente: " + patente);
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
        System.out.println("Carga actual: " + cargaActual + " kg");
    }
}

class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, String modelo, String color,
                     int cantidadRuedas, int anioFabricacion) {

        super(marca, modelo, color, cantidadRuedas, anioFabricacion);
    }
}

class Empresa {

    private ArrayList<Vehiculo> listaVehiculos;

    public Empresa() {

        listaVehiculos = new ArrayList<>();
    }

    public boolean patenteExiste(String patente) {

        for (Vehiculo v : listaVehiculos) {

            if (v instanceof Auto) {

                Auto a = (Auto) v;

                if (a.getPatente().equalsIgnoreCase(patente)) {
                    return true;
                }
            }

            if (v instanceof Camioneta) {

                Camioneta c = (Camioneta) v;

                if (c.getPatente().equalsIgnoreCase(patente)) {
                    return true;
                }
            }
        }

        return false;
    }

    public void agregarVehiculo(Vehiculo v) {

        listaVehiculos.add(v);

        System.out.println("Vehículo bien agregado.");
    }

    public void mostrarVehiculos() {

        for (Vehiculo v : listaVehiculos) {

            System.out.println("----------------------");

            v.mostrarDatos();
        }
    }

    public void tipoConMasCantidad() {

        int autos = 0;
        int camionetas = 0;
        int bicicletas = 0;

        for (Vehiculo v : listaVehiculos) {

            if (v instanceof Auto) {
                autos++;
            } else if (v instanceof Camioneta) {
                camionetas++;
            } else if (v instanceof Bicicleta) {
                bicicletas++;
            }
        }

        System.out.println("Autos: " + autos);
        System.out.println("Camionetas: " + camionetas);
        System.out.println("Bicicletas: " + bicicletas);

        int mayor = Math.max(autos,
                Math.max(camionetas, bicicletas));

        System.out.println();

        if (mayor == autos) {
            System.out.println("Hay más autos.");
        }

        if (mayor == camionetas) {
            System.out.println("Hay más camionetas.");
        }

        if (mayor == bicicletas) {
            System.out.println("Hay más bicicletas.");
        }
    }

    public void porcentajeDescapotables() {

        int totalAutos = 0;
        int descapotables = 0;

        for (Vehiculo v : listaVehiculos) {

            if (v instanceof Auto) {
                Auto a = (Auto) v;


                if (a.isDescapotable()) {
                    descapotables++;
                }
            }
        }

        if (totalAutos == 0) {

            System.out.println("No existen autos.");
            return;
        }

        double porcentaje =
                (double) descapotables / totalAutos * 100;

        System.out.println("Porcentaje de autos descapotables: "
                + porcentaje + "%");
    }
}


    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Auto auto1 = new Auto(
                "Ford",
                "Focus",
                "Rojo",
                4,
                2020,
                "ABC123",
                true
        );

        Auto auto2 = new Auto(
                "Toyota",
                "Corolla",
                "Negro",
                4,
                2022,
                "DEF456",
                false
        );

        Camioneta camioneta1 = new Camioneta(
                "Volkswagen",
                "Amarok",
                "Blanca",
                4,
                2021,
                "GHI789",
                1000
        );

        Bicicleta bicicleta1 = new Bicicleta(
                "Venzo",
                "Raptor",
                "Azul",
                2,
                2023
        );

        if (!empresa.patenteExiste(auto1.getPatente())) {
            empresa.agregarVehiculo(auto1);
        }

        if (!empresa.patenteExiste(auto2.getPatente())) {
            empresa.agregarVehiculo(auto2);
        }

        if (!empresa.patenteExiste(camioneta1.getPatente())) {
            empresa.agregarVehiculo(camioneta1);
        }

        empresa.agregarVehiculo(bicicleta1);

        camioneta1.agregarCarga(500);
        camioneta1.agregarCarga(300);
        camioneta1.agregarCarga(400);

        System.out.println();
        empresa.mostrarVehiculos();

        System.out.println();
        empresa.tipoConMasCantidad();

        System.out.println();
        empresa.porcentajeDescapotables();
    }
}