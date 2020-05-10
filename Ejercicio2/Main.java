package com.company.Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creamos un ArrayList para aviones.
        ArrayList<Avion> aviones = new ArrayList<>();
        // LLenamos el ArrayList aviones.
        aviones.add(new Avion("Ryanair", 70.67, "Boeing 737-800", ModoVuelo.CRUCERO));
        aviones.add(new Avion("Iberia", 74.80, "Airbus A-350", ModoVuelo.PILOTO_AUTOMATICO));
        aviones.add(new Avion("Vueling", 78.5, "Airbus A-320", ModoVuelo.MANUAL));
        aviones.add(new Avion("Volaris", 73, "Airbus A-320", ModoVuelo.CRUCERO));
        aviones.add(new Avion("Spirit Airlines", 71, "Airbus A-319", ModoVuelo.PILOTO_AUTOMATICO));

        //Imprimimos por pantalla el número de aviones que existen.
        System.out.println("Número de aviones: " + Avion.devolverNumAviones());

        //Creamos un ArrayList para Pasajeros.
        ArrayList<Pasajero> pasajeros = new ArrayList<>();

        //Llenamos el ArrayList pasajeros.
        pasajeros.add(new Pasajero("Antonio", "Calle Sevilla 32", "34567687Z", Estado.EMBARCADO));
        pasajeros.add(new Pasajero("Alfredo", "Calle Almeria 12", "56987678A", Estado.PENDIENTE));
        pasajeros.add(new Pasajero("Raul", "Calle Cadiz 30", "12874768X", Estado.PENDIENTE));
        pasajeros.add(new Pasajero("Maria", "Calle Malaga 50", "90967545D", Estado.EMBARCADO));
        pasajeros.add(new Pasajero("Laura", "Calle Huelva 41", "71056056S", Estado.EMBARCADO));
        pasajeros.add(new Pasajero("Ruben", "Calle Jaen 41", "90801771F", Estado.PENDIENTE));
        pasajeros.add(new Pasajero("Rocio", "Calle Granada 41", "01786545R", Estado.PENDIENTE));
        pasajeros.add(new Pasajero("Jesus", "Calle Almeria 41", "33890190P", Estado.EMBARCADO));
        pasajeros.add(new Pasajero("Gustabo", "Calle Cordoba 41", "55897445L", Estado.EMBARCADO));
        pasajeros.add(new Pasajero("Horacio", "Calle Murcia 41", "56986546M", Estado.PENDIENTE));

        //Imprimimos por pantalla el número de pasajeros que existen.
        System.out.println("Número de pasajeros: " + Pasajero.devolverNumPasajeros());
    }
}
