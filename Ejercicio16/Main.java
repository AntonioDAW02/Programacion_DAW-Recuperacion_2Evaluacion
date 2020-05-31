package com.company.Ejercicio16;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> baraja = new HashMap<>();
        int totalPuntos = 0;

        baraja.put("as", 11);
        baraja.put("dos", 0);
        baraja.put("tres",10);
        baraja.put("cuatro",0);
        baraja.put("cinco",0);
        baraja.put("seis",0);
        baraja.put("siete",0);
        baraja.put("sota",2);
        baraja.put("caballo",3);
        baraja.put("rey",4);

        for (int i = 0; i < 5; i++) {
            Carta carta = new Carta();

            System.out.println(carta.toString());

            int puntos = baraja.get(carta.getNombreFigura());
            totalPuntos+= puntos;

        }
        System.out.println("Total de puntos: " + totalPuntos);
    }
}
