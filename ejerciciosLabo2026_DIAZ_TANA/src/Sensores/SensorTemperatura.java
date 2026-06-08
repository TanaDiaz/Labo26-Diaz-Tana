package Sensores;

public class SensorTemperatura extends Sensor {
    public SensorTemperatura(boolean conectado, float medicion, String fechaAdquirido, float umbral){
        super(conectado,medicion,fechaAdquirido,umbral);
    }

    @Override
    public void sonarAlarma(){
        System.out.println("Cuidado! La temperatura sube");
    }
}
