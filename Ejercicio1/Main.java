package com.company.Ejercicio1;

public class Main {

    public static void main(String[] args) {
	    //Creamos dos objetos de la clase Avión.
        Avion avion1 = new Avion("Ryanair", 70.67, "Boeing 737-800", ModoVuelo.CRUCERO);
        Avion avion2 = new Avion("Iberia", 74.80, "Airbus A350", ModoVuelo.CRUCERO);

        //Creamos cinco objetos de la clase Pasajero.
        Pasajero pasajero1 = new Pasajero("Antonio", "Calle Sevilla 32", "34567687Z", Estado.EMBARCADO);
        Pasajero pasajero2 = new Pasajero("Alfredo", "Calle Almeria 12", "56987678Z", Estado.PENDIENTE);
        Pasajero pasajero3 = new Pasajero("Raul", "Calle Cadiz 30", "12874768Z", Estado.PENDIENTE);
        Pasajero pasajero4 = new Pasajero("Maria", "Calle Malaga 50", "90967545Z", Estado.EMBARCADO);
        Pasajero pasajero5 = new Pasajero("Laura", "Calle Huelva 41", "71056056Z", Estado.EMBARCADO);

        //Implementamos los métodos de la clase Avión.
        avion1.aterrizar();
        avion2.despegar();
        avion1.volar();
        System.out.println(avion1.toString());
        System.out.println(avion2.toString());

        //Implementamos los métodos de la clase Pasajero.
        pasajero1.andar();
        pasajero2.embarcar();
        pasajero3.sonreir();
        System.out.println(pasajero1.toString());
        System.out.println(pasajero2.toString());
        System.out.println(pasajero3.toString());
        System.out.println(pasajero4.toString());
        System.out.println(pasajero5.toString());
    }
}
