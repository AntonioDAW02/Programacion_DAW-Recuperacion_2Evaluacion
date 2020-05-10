package com.company.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        //Creamos un array "pasajeros" con capacidad 5.
        Pasajero[] pasajeros = null;

        //Creamos cinco objetos de la clase Pasajero.
        Pasajero pasajero1 = new Pasajero("Antonio", "Calle Sevilla 32", "34567687Z", Estado.EMBARCADO);
        Pasajero pasajero2 = new Pasajero("Alfredo", "Calle Almeria 12", "56987678Z", Estado.PENDIENTE);
        Pasajero pasajero3 = new Pasajero("Raul", "Calle Cadiz 30", "12874768Z", Estado.PENDIENTE);
        Pasajero pasajero4 = new Pasajero("Maria", "Calle Malaga 50", "90967545Z", Estado.EMBARCADO);
        Pasajero pasajero5 = new Pasajero("Laura", "Calle Huelva 41", "71056056Z", Estado.EMBARCADO);

        //Creamos dos objetos de la clase Avión.
        Avion avion1 = new Avion("Ryanair", 70.67, "Boeing 737-800", ModoVuelo.CRUCERO);
        Avion avion2 = new Avion("Iberia", 74.80, "Airbus A350", ModoVuelo.CRUCERO);

        //Creamos dos objetos de la clase vuelo.
        Vuelo vuelo1 = new Vuelo(avion1, "2020/01/05", "Sevilla", "Paris");
        Vuelo vuelo2 = new Vuelo(avion1, "2020/08/05", "Sevilla", "Barcelona");

        vuelo1.addPassenger(pasajero1);
        vuelo1.addPassenger(pasajero2);
        vuelo1.addPassenger(pasajero3);
        vuelo1.addPassenger(pasajero4);
        vuelo1.addPassenger(pasajero5);

        //Hacemos llamada a la función "listPassenger" y se muestran los pasajeros de vuelo1.
        vuelo1.listPassenger();

        //borramos los pasajeros con los pasaporter indicados.
        vuelo1.delPassenger("90967541W");
        vuelo1.delPassenger("71056056Z");

        //Hacemos llamada a la función "listPassenger" y se muestran los pasajeros de vuelo1.
        vuelo1.listPassenger();

        //Hacemos llamada a la función "addPassenger" y añadimos pasajero1 a vuelo1.
        vuelo1.addPassenger(pasajero1);

        //Hacemos llamada a la función "listPassenger" y se muestran los pasajeros de vuelo1.
        vuelo1.listPassenger();

    }
}
