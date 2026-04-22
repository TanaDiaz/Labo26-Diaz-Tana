import Unidad_1.Persona;

import java.util.ArrayList;

public class rama {
}

static void main(String[] args) {
    ArrayList <Persona> personas = new ArrayList<>();
    Persona p1 = new Persona(18);
    Persona p2 = new Persona(25);
    Persona p3 = new Persona(31);

    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    for(Persona persona : personas){
        if(persona.getEdad() > 30){
            System.out.println(persona);
        }
    }
}