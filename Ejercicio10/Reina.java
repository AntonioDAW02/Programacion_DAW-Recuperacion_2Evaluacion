package com.company.Ejercicio10;

//Clase Reina que extiende de la clase PiezaAjedrez
public class Reina extends PiezaAjedrez{
    //Contructor principal que utiliza el super para llamar a los atributos de la clase padre.
    public Reina(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    //Comparamos las piezas por orden natural de menor a mayor usando el super para referenciar al método de la clase padre.
    @Override
    public int compareTo(PiezaTablero o) {
        return super.compareTo(o);
    }
}
