package Sensores;

import java.util.ArrayList;

public class SensorComplejo {

    private ArrayList<Sensor> sensores;

    public SensorComplejo(ArrayList<Sensor> sensores) {
        super();

        this.sensores = sensores;
    }

    public void agregarSensor(Sensor s) {
        sensores.add(s);
    }

    @Override
    public void verificarMedicion(){
        int sensorActual = 0;
        int sumaSensores = 0;
        int cont = 0;
        int promedioMediciones = 0;

        for(ArrayList<Sensor> sensores: s){
        sensorActual = sensores.get(s);
        sumaSensores = sumaSensores + sensorActual;
        cont++;
        }
        promedioMediciones = sumaSensores/cont;

        if(promedioMediciones > this.getUmbral()){
            sonarAlarma();
        }
    }
}

