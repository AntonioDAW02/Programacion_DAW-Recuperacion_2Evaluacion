package com.company.Ejercicio19;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        //Creamos un objeto de la clase coordenadas.
        Coordenadas c1 = new Coordenadas(50, 70);

        //Creamos un fichero donde guardaremos los datos.
        File ficheroMediaciones = new File("datos.dat");

        //Creamos un objeto de la clase EstacionMeteorilogica, que recibe el fichero y las coordenadas.
        EstacionMeteorologica em1 = new EstacionMeteorologica(ficheroMediaciones, c1);

        //Creamos los objetos de la clase Mediación.
        Medicion m1 = new Medicion(25, 28, 18);
        Medicion m2 = new Medicion(42, 21, 9);
        Medicion m3 = new Medicion(31, 34, 24);
        Medicion m4 = new Medicion(17, 17, 21);
        Medicion m5 = new Medicion(23, 10, 33);

        //Llamada al metodo addMedicion, que añade una medicion a la lista.
        em1.addMedicion(m1);
        em1.addMedicion(m2);
        em1.addMedicion(m3);
        em1.addMedicion(m4);
        //em1.addMedicion(m5);

        //System.out.println(em1.toString());

        //Llamada al metodo ordenarTemperaturasAsc, que ordena mas mediaciones por temperatura por orden ascendente.
        //em1.ordenaTemperaturasAsc();

        //Llamada al metodo ordenarHumedadesDesc, que añade una medicion a la lista.
        //em1.ordenaHumedadesDesc();

        //Llamada al método que busca una medición.
        em1.buscarMediacion(m1);
        em1.buscarMediacion(m5);

        //Llamada al método guardarFichero, que guarda las mediaciones en el fichero binario.
        em1.guardarFichero(ficheroMediaciones);

    }
}
