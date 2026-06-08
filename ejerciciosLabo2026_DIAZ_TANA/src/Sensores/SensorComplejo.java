package Sensores;

import java.util.ArrayList;

public class SensorComplejo {

    private ArrayList<Sensor> sensores;
    private float umbral;

    public SensorComplejo(ArrayList<Sensor> sensores) {
        super();

        this.sensores = sensores;
    }

    public void agregarSensor(Sensor s) {
        sensores.add(s);
    }

    public void verificarMediciones() {
        float sensorActual = 0;
        float sumaSensores = 0;
        int cont = 0;
        float promedioMediciones = 0;

        for (Sensor sensor : sensores) { //S1, S2, S3
            sensorActual = sensor.getMedicion();
            sumaSensores = sumaSensores + sensorActual;
            cont++;
        }
        promedioMediciones = sumaSensores / cont;

        if (promedioMediciones > this.umbral) {
            for (Sensor sensor : sensores) { //S1, S2, S3
                sensor.sonarAlarma();
            }
        }
    }
}

