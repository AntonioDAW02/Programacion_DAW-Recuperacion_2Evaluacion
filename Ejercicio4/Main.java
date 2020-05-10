package com.company.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        //Creamos un array de pasajero.
        //Pasajero[] pasajeros = null;

        //Creamos dos objetos de la clase Pasajero.
        Pasajero pasajero1 = new Pasajero("Antonio", "Calle Sevilla 20", "43987801D", Estado.EMBARCADO);
        Pasajero pasajero2 = new Pasajero("Alfredo", "Calle Almeria 12", "56987678Z", Estado.PENDIENTE);
        Pasajero pasajero3 = new Pasajero("Raul", "Calle Cadiz 30", "12874768X", Estado.PENDIENTE);
        Pasajero pasajero4 = new Pasajero("Maria", "Calle Malaga 50", "90967545D", Estado.EMBARCADO);
        Pasajero pasajero5 = new Pasajero("Laura", "Calle Huelva 41", "71056056S", Estado.EMBARCADO);
        Pasajero pasajero6 = new Pasajero("Ruben", "Calle Jaen 41", "90801771F", Estado.PENDIENTE);
        
        //Creamos dos objetos de la clase Avión.
        Avion avion1 = new Avion("Ryanair", 70.67, "Boeing 737-800", ModoVuelo.PILOTO_AUTOMATICO);
        Avion avion2 = new Avion("Iberia", 74.80, "Airbus A350", ModoVuelo.CRUCERO);

        //Creamos dos objetos de la clase Aeropuerto.
        Aeropuerto aeropuerto1 = new Aeropuerto("Sevilla","2020/05/01");
        Aeropuerto aeropuerto2 = new Aeropuerto("Bilbao", "2020/05/05");
        Aeropuerto aeropuerto3 = new Aeropuerto("Valencia", "2020/05/05");

        //Creamos 4 objetos de la clase Vuelo.
        Vuelo vuelo1 = new Vuelo(avion1, "2020/05/01", "Sevilla", "Bilbao");
        Vuelo vuelo2 = new Vuelo(avion1, "2020/05/05", "Bilbao", "Sevilla");
        Vuelo vuelo3 = new Vuelo(avion1, "2020/05/05", "Sevilla", "Valencia");
        Vuelo vuelo4 = new Vuelo(avion1, "2020/05/05", "Valencia", "Sevilla");

        vuelo1.addPassenger(pasajero1);
        vuelo1.addPassenger(pasajero2);
        vuelo1.addPassenger(pasajero3);
        vuelo1.addPassenger(pasajero4);
        vuelo1.addPassenger(pasajero5);
        vuelo1.addPassenger(pasajero6);

        aeropuerto1.mostrarVuelo("2020/05/01");
        System.out.println();

        aeropuerto1.addVuelo(vuelo1);
        aeropuerto1.addVuelo(vuelo2);

        aeropuerto1.mostrarVuelo("2020/05/07");
        System.out.println();
        aeropuerto1.mostrarVuelo("2020/05/01");

        aeropuerto1.addVuelo(vuelo3);
        aeropuerto1.addVuelo(vuelo4);

        aeropuerto1.mostrarVuelo("2020/05/07");
        System.out.println();
        aeropuerto1.mostrarVuelo("2020/05/01");

        aeropuerto1.delVuelo(vuelo3);

        aeropuerto1.mostrarVuelo("2020/05/07");
    }
}
