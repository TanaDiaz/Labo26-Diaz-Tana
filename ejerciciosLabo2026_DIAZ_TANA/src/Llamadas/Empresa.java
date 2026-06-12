package Llamadas;

import java.util.ArrayList;

public class Empresa {

    ArrayList<Empleado> empleados;
    private ArrayList<Llamada> llamadas;



    public void realizarLlamada(Empleado empleado1, Empleado empleado2) {

        Boolean alcance = empleado1.verificarPais(empleado2);

        if(alcance){
            Llamada llamadalocal1 = new LlamadaLocal();
             llamadalocal1.registrarLlamada(empleado1, empleado2, alcance);

            }
        }

        else{

            LlamadaInternacional llamadainter1 = new LlamadaInternacional();
            llamadainter1.registrarLlamada(empleado1, empleado2, alcance);

    }
    }
}
 