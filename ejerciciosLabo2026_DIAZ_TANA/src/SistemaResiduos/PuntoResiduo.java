package SistemaResiduos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PuntoResiduo {
    private ArrayList<TipoResiduo> residuosValidos;
    private Boolean esLaboratorio;

    public PuntoResiduo(ArrayList<TipoResiduo>residuosValidos, Boolean esLaboratorio, HashMap<String,Direccion>direccion) {
        this.residuosValidos = residuosValidos;
        this.esLaboratorio = esLaboratorio;
        }


}
