package com.company.Ejercicio19;

import java.util.Comparator;
import java.util.Objects;

//Clase Meadiacion con sus atributos y métodos.
public class Medicion implements Comparable {
    //Creamos los atrubutos necesarios indicando el tipo de dato y que es private
    private int temperatura;
    private int humedad;
    private int presion;

    //Contructor principal que recibe parámetros y los guarda en sus correspondientes atributos.
    public Medicion(int temperatura, int humedad, int presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    //Getter y setter de los atributod de la clase.
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicion medicion = (Medicion) o;
        return temperatura == medicion.temperatura &&
                humedad == medicion.humedad &&
                presion == medicion.presion;
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(temperatura, humedad, presion);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return "\n Medicion: " +
                "temperatura = " + temperatura +
                ", humedad = " + humedad +
                ", presión = " + presion;
    }

    @Override
    public int compareTo(Object o) {
        Medicion p = (Medicion) o;
        return p.getTemperatura()-this.getTemperatura();
    }
}
