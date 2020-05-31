package com.company.Ejercicio19;

import java.util.Objects;

public class Coordenadas {
    private int latitud;
    private int longitud;

    //Constructor principal que recibe parámetros indicando sus tipos y que se guardaran en las variables correspondientes.
    public Coordenadas(int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    //Métodos getter y setter de cada una de las variables.
    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordenadas that = (Coordenadas) o;
        return latitud == that.latitud &&
                longitud == that.longitud;
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(latitud, longitud);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return "Coordenadas: " +
                "latitud = " + latitud +
                ", longitud =" + longitud ;
    }
}
