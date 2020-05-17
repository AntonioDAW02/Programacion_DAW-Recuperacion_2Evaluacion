package com.company.Ejercicio10;

import java.util.ArrayList;
import java.util.Objects;

//Clase abstracta PiezaTablero que implementa el metodo comparable para poder usar los métodos de ésta interfaz.
public abstract class PiezaTablero implements Comparable<PiezaTablero>{
    //Atributos de la clase con su tipo e indicando que son private
    private int posicionX;
    private int posicionY;
    private Color color;

    //Constructor principal que recibe paámetros indicando su tipo y guardandola en variables.
    public PiezaTablero(int posicionX, int posicionY, Color color) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
    }

    //Getter y setter de los atributos de la clase.
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PiezaTablero that = (PiezaTablero) o;
        return posicionX == that.posicionX &&
                posicionY == that.posicionY &&
                color == that.color;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(posicionX, posicionY, color);
    }

    /* Método toString que devuelve en un string los valores de las propiedades.
     * Con super.toString() estamos haciendo una llamada al toString de la clase padre.
     */
    @Override
    public String toString() {
        return "Pieza de tablero: " +
                "posición X = " + posicionX +
                ", posición Y = " + posicionY +
                ", color = " + color + "\n";
    }

    /*
     * El orden natural de las piezas viene indicado por
     * su componente Y. Es decir, una pieza se considera menor que otra si su
     * posiciónY es menor que la posiciónY de la otra.
     */
    public int compareTo(PiezaTablero o) {
        //Inicializamos una variable res a 0.
        int res = 0;

        //si la posicion Y de un objeto es menor que la posición Y del otro objeto.
        if (this.posicionY < o.posicionY){res = -1;}
        //Caso contrario en el que la posición Y del primer objeto es mayor que la posicion Y del otro objeto.
        if (this.posicionY > o.posicionY){res = 1;}

        return res;

    }
}
