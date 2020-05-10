package com.company.Ejercicio5;

public class Main {
    public static void main(String[] args) {

        //Creamos objetos de la clase Salida.
        Salida salida1 = new Salida("10/05/2020", TipoSalida.DEPORTE);
        Salida salida2 = new Salida("08/05/2020", TipoSalida.COMPRA);
        Salida salida3 = new Salida("04/05/2020", TipoSalida.PASEO);
        Salida salida4 = new Salida("04/05/2020", TipoSalida.DEPORTE);
        Salida salida5 = new Salida("04/05/2020", TipoSalida.PASEO);
        Salida salida6 = new Salida("04/05/2020", TipoSalida.DEPORTE);

        //Creamos objetos de la clase Ciudadano.
        Ciudadano ciudadano1 = new Ciudadano("Pepe","39009716L");
        Ciudadano ciudadano2 = new Ciudadano("Rosa","90171210A");

        //Añadir salidas a un ciudadano.
        ciudadano1.addSalida(salida1);
        ciudadano1.addSalida(salida2);
        ciudadano2.addSalida(salida3);
        ciudadano2.addSalida(salida4);
        ciudadano2.addSalida(salida5);
        ciudadano2.addSalida(salida6);

        //Comprobar salidas del ciudadano.
        System.out.println("Número de salidas de " + ciudadano1.getNombre() + " : " + ciudadano1.comprobarSalidas("10/05/2020"));
        System.out.println("Número de salidas de " + ciudadano2.getNombre() + " : " + ciudadano2.comprobarSalidas("04/05/2020"));

        ponerMulta(ciudadano1, "10/05/2020");
        ponerMulta(ciudadano2, "04/05/2020");

    }

    //Método que recibe un ciudadano y una fecha en la que se va a comprobar si ha salido mas de una vez a hacer lo mismo.
    static public void ponerMulta(Ciudadano ciudadano, String fecha){
        //Creamos los atributos necesarios.
        int multa = 600;
        int contC = 0;
        int contD = 0;
        int contP = 0;
        int contTotalMultas = 0;

        //Creamos la lista de salidas del ciudadano.
        Salida[] lista = ciudadano.getSalida();

        //Recorremos la lista de salidas del ciudadano.
        for (int i = 0; i < ciudadano.getSalida().length; i++) {
            //Si una de las fechas en la lista coincide con la fecha pasada por parámetro.
            if (lista[i].getFecha().equals(fecha)) {
                //Si el tipo de salida en la lista coincide con el tipo salida "COMPRA".
                if (lista[i].getTipoSalida().equals(TipoSalida.COMPRA)) {
                    //Aumentamos en uno el contador de salidas para comprar.
                    contC++;
                    //Si el contador de salidas para comprar es mayor a 1.
                    if (contC > 1) {
                        //Sumamos uno al contador de multas totales.
                        contTotalMultas++;
                    }
                    //Si el tipo de salida en la lista coincide con el tipo salida "DEPORTE".
                } else if (lista[i].getTipoSalida().equals(TipoSalida.DEPORTE)) {
                    //Aumentamos en uno el contador de salidas para hacer deporte.
                    contD++;
                    //Si el contador de salidas para hacer deporte es mayor a 1.
                    if (contD > 1) {
                        //Sumamos uno al contador de multas totales.
                        contTotalMultas++;
                    }
                    //Si el tipo de salida en la lista coincide con el tipo salida "PASEO".
                } else if (lista[i].getTipoSalida().equals(TipoSalida.PASEO)) {
                    //Aumentamos en uno el contador de salidas para dar un paseo.
                    contP++;
                    //Si el contador de salidas para dar un paseo es mayor a 1.
                    if (contP > 1) {
                        //Sumamos uno al contador de multas totales.
                        contTotalMultas++;
                    }
                }
            }
        }

        //Si el contador de multas es igual a 0, es decir, el ciudadano no hace dos veces lo mismo en el mismo dia.
        if (contTotalMultas == 0){
            //Devuelvo éste mensaje.
            System.out.println("El ciudadano " + ciudadano.getNombre() + " con DNI: " + ciudadano.getDni() + " no tiene multa.");
        }else {
            //Devuelve este mensaje con la multa total al ciudadano.
            System.out.println("El ciudadano " + ciudadano.getNombre() + " con DNI: " + ciudadano.getDni() + " tiene una multa de: " + multa*contTotalMultas + " €.");
        }
    }
}
