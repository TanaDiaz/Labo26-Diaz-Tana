package Ringtone;

import Personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;

public class HashSets {
    HashMap<LocalDate, Persona> registro_medico = new HashMap<>();

    public void peso_fecha(LocalDate fecha, Persona persona){
        for (LocalDate fechaExacta : registro_medico.keySet())
        System.out.println("Tu peso es: " + persona.getPeso() + " y tu altura es: " + persona.getAltura());
    }
}