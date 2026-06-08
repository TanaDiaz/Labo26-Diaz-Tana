package Sensores;

public class SensorHumo extends Sensor {


    public SensorHumo(boolean conectado, float medicion, String fechaAdquirido, float umbral) {
        super(conectado, medicion, fechaAdquirido, umbral);
    }

    @Override
    public void sonarAlarma(){
        System.out.println("Llamando a los bomberos...");
    }
}

