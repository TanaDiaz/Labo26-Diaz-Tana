package Sensores;

public class SensorPresion extends Sensor{

    public SensorPresion(boolean conectado, float medicion, String fechaAdquirido, float umbral){
        super(conectado,medicion,fechaAdquirido,umbral);
    }

    @Override
    public void sonarAlarma(){
        System.out.println("Sensor de presión activado");
    }
}
