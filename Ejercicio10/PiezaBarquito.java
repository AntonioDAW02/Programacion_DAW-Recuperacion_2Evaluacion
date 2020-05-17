package com.company.Ejercicio10;

//Clase PiezaBarquito que hereda de la clase PiezaTablero.
public class PiezaBarquito extends PiezaTablero{
    //Contructor principal que utiliza el super para llamar a los atributos de la clase padre.
    public PiezaBarquito(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    //Comparamos las piezas en por orden natural de menor a mayor usando el super para referenciar a la funcion de la clase padre.
    @Override
    public int compareTo(PiezaTablero o) {
        return super.compareTo(o);
    }
}
