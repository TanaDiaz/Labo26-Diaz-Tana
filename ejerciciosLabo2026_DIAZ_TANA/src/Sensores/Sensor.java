package Sensores;

import java.util.ArrayList;

public abstract class Sensor {

    private boolean conectado;
    private float medicion;
    private String fechaAdquirido;
    private float umbral;


    public Sensor(boolean conectado, float medicion, String fechaAdquirido, float umbral) {
        this.conectado = conectado;
        this.medicion = medicion;
        this.fechaAdquirido = fechaAdquirido;
        this.umbral = umbral;
    }

    public boolean getConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public float getMedicion() {
        return medicion;
    }

    public void setMedicion(float medicion) {
        this.medicion = medicion;
    }

    public String getFechaAdquirido() {
        return fechaAdquirido;
    }

    public void setFechaAdquirido(String fechaAdquirido) {
        this.fechaAdquirido = fechaAdquirido;
    }

    public float getUmbral() {
        return umbral;
    }

    public void setUmbral(float umbral) {
        this.umbral = umbral;
    }

    public abstract void sonarAlarma();


    public void verificarMedicion() {
        if ((this.medicion > this.getUmbral() && this.conectado)) {
            sonarAlarma();
        }
    }
}