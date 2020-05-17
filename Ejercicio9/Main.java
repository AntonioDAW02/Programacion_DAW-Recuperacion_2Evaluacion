package com.company.Ejercicio9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Creamos los objetos necesarios de las diferentes clases que tenemos.
        //Importante saber que de la clase MandoADistancia no podemos crear objetos porque es abstracta.
        MandoTV mandotv1 = new MandoTV("Samsung M7", "100cm", "60cm", 1000.00, Estado.APAGADO,20,6);
        MandoAspiradora aspiradora1 = new MandoAspiradora("modelo1","60cm","30com",250.00,Estado.APAGADO,10);

        //Usamos los métodos que necesitemos de los objetos que hemos creamos anteriormente.
        //mandotv1.encender();

        //aspiradora1.encender();

        //mandotv1.apagar();
        //System.out.println(mandotv1.getEstado());

        //System.out.println(mandotv1.getVolumen());
        //mandotv1.subirVolumen();
        //mandotv1.subirVolumen();
        //mandotv1.subirVolumen();
        //mandotv1.subirVolumen();
        //System.out.println(mandotv1.getVolumen());

        //System.out.println(aspiradora1.getVelocidad());
        //aspiradora1.subirVelocidad();
        //aspiradora1.subirVelocidad();
        //aspiradora1.subirVelocidad();
        //aspiradora1.subirVelocidad();
        //System.out.println(aspiradora1.getVelocidad());


        /****************************/

        //Vector de 10 objetos MandosADistancia , rellenadlo y mostrarlo ordenador por precios y por superficie(altura*anchura).
        MandoADistancia[] mandos = new MandoADistancia[10];

        //Rellenamos el array de tipo MandoADistancias, con diferentes objetos de clases hijas de ésta clase padre abstracta.
        mandos[0] = new MandoTV("Samsung L11", "100cm", "60cm", 1900.00, Estado.APAGADO,0,1);
        mandos[1] = new MandoTV("Samsung L20", "120cm", "75cm", 1500.00, Estado.APAGADO,0,1);
        mandos[2] = new MandoTV("Samsung S10", "80cm", "55cm", 750.00, Estado.APAGADO,0,1);
        mandos[3] = new MandoAspiradora("ABBA","55cm","35com",230.00,Estado.APAGADO,0);
        mandos[4] = new MandoAspiradora("ABBC","50cm","30com",280.00,Estado.APAGADO,0);
        mandos[5] = new MandoAireAcondicionado("Roca X100","75cm","30cm",170.00,Estado.APAGADO,Modo.FRIO);
        mandos[6] = new MandoAireAcondicionado("Roca Z50","70cm","30cm",190.00,Estado.APAGADO,Modo.FRIO);
        mandos[7] = new MandoAireAcondicionado("Roca Z55","65cm","25cm",230.00,Estado.APAGADO,Modo.FRIO);
        mandos[8] = new MandoMiniCadena("Roca Z50","70cm","30cm",190.00,Estado.APAGADO, 0);
        mandos[9] = new MandoAireAcondicionado("Roca Z50","70cm","30cm",190.00,Estado.APAGADO,Modo.FRIO);

        //Método que recibe un array de objetos y lo ordena teniendo en cuenta las condiciones del compareTo.
        Arrays.sort(mandos);

        //Recorremos el array mandos.
        for (int i = 0; i < mandos.length; i++) {
            //Imprime por pantalla cada uno de los objetos que contiene, ya ordenador de menor a mayor.
            System.out.println(mandos[i]);
        }

    }
}
