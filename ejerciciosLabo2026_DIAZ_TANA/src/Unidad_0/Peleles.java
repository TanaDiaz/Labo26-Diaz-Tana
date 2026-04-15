package Unidad_0;

import java.util.ArrayList;
import java.util.Arrays;

public class Peleles {

    static void main(String[] args) {

        ArrayList<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        numero.add(5);
        numero.add(6);
        numero.add(7);
        numero.add(8);
        numero.add(9);
        numero.add(10);

        Integer sdfdsf = 0;

        for (Integer numeros : numero) {
            sdfdsf += numero;
        }

        System.out.println("La suma de los números es: " + sdfdsf);

            ArrayList<String> palabras = new ArrayList<>();
            palabras.add("manzana");
            palabras.add("CHIMPANCINI BANANINI");
            palabras.add("melontonton");
            palabras.add("MANGOSMANGOSMANGOSMANGOS");
            palabras.add("pera");

            char letra = 'm';
            System.out.println("palabras que empiezan con '" + letra + "':");

            for (String palabra : palabras) {
                if (palabra.toLowerCase().charAt(0) == letra) {
                    System.out.println(palabra);
                }
            }

            ArrayList<Persona> personas = new ArrayList<>();
            personas.add(new Persona("Juan Sexito", 25, "Sebastian Lopez 49871564"));
            personas.add(new Persona("Ana Glande", 35, "Prepucio Lopez 1222"));
            personas.add(new Persona("Luis Pucio", 40, "Hadolf Itler tungsito sahursito 1111"));
            personas.add(new Persona("Sofia Prepuciana", 28, "Prepucito Lopezito 7 777"));

            System.out.println("\nPersonas mayores de 30 años:");

            for (Persona papu : personas) {
                if (papu.getEdad() > 30) {
                    System.out.println(papu.getNombre() + " - " + papu.getEdad());
                }
            }
        }
    }


