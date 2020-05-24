package com.company.Ejercicio15;

import java.util.Objects;

//Creamos la clase Avión con sus propiedades y métodos.
public class Avion {
    //Declaración de propiedades con sus tipos de datos.
    private String aerolinea;
    private double longitud;
    private String modelo;
    private ModoVuelo modoVuelo;

    //Constructor principal, que recibe parámetros y guarda los valores en las variables.
    public Avion(String aerolinea, double longitud, String modelo, ModoVuelo modoVuelo) {
        this.aerolinea = aerolinea;
        this.longitud = longitud;
        this.modelo = modelo;
        this.modoVuelo = modoVuelo;
    }

    //Declaración de getter y setter de cada propiedad.
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ModoVuelo getModoVuelo() {
        return modoVuelo;
    }

    public void setModoVuelo(ModoVuelo modoVuelo) {
        this.modoVuelo = modoVuelo;
    }

    //Método despegar que devuelve un mensaje.
    public void despegar(){
        System.out.println("El avión ha despegado.");
    }

    //Método volar que devuelve un mensaje.
    public void volar(){
        System.out.println("El avión está volando.");
    }

    //Método aterrizar que devuelve un mensaje.
    public void aterrizar(){
        System.out.println("El avión ha aterrizado.");
    }


    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Avion avion = (Avion) o;
        return Double.compare(avion.longitud, longitud) == 0 &&
                Objects.equals(aerolinea, avion.aerolinea) &&
                Objects.equals(modelo, avion.modelo) &&
                modoVuelo == avion.modoVuelo;
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(aerolinea, longitud, modelo, modoVuelo);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Avion: " +
                "aerolinea = '" + aerolinea + '\'' +
                ", longitud = " + longitud +
                ", modelo = '" + modelo + '\'' +
                ", modo de vuelo = '" + modoVuelo ;
    }
}
