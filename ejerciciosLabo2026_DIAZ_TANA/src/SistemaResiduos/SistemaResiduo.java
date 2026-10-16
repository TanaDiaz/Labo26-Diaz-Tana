package SistemaResiduos;

import java.util.HashMap;
import java.util.Map;

public class SistemaResiduo {
    private HashMap<String, Direccion> direccion;


    public Boolean buscarPuntoPorDireccion(String dirBuscar){

        for(Map.Entry<String,Direccion> dir: direccion.entrySet()) {
            if (dir.getKey().equals(dirBuscar)) {
                System.out.println("La latitud y longitud son: " + dir.getValue().getLatitud() + dir.getValue().getLongitud() + " y el barrio es: " + dir.getValue().getBarrio());
                return true;
            }
        }
        return false;
    }

    public void eliminarPuntoPorDireccion(String dirBuscar) {
        if(buscarPuntoPorDireccion(dirBuscar) == true){


        }
    }
}
