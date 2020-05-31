package com.company.Ejercicio16;

import java.util.Objects;

public class Carta {
    //Declaracion de variables con su tipo de datos y añadiendole private.
    private String nombreFigura;
    private String tipoFigura;

    //Constructor principal que recibe parámetros indicando sus tipos y que se guardaran en las variables correspondientes.
    public Carta() {
        //Creamos los arrays de las figuras y los palos.
        String[] figuras = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
        String[] palos = {"oro","copa","basto","espada"};

        //Creamos figuras aleatorias con el método Marh.random que saca una posición aleatoria de cada array.
        int aleatorio = (int) (Math.random()*10);
        int aleatorioPalos = (int) (Math.random()*4);

        //Guardamos las posiciones generadas aleatoriamente en los atributos correspondientes.
        this.nombreFigura = figuras[aleatorio];
        this.tipoFigura = palos[aleatorioPalos];
    }

    //Métodos getter y setter de cada una de las variables.
    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(nombreFigura, carta.nombreFigura) &&
                Objects.equals(tipoFigura, carta.tipoFigura);
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(nombreFigura, tipoFigura);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return  nombreFigura  + " de " +
                tipoFigura;
    }
}
