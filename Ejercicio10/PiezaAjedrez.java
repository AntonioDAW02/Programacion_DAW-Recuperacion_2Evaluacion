package com.company.Ejercicio10;

//Clase abstracta Pieza Ajedrez que hereda de la clase PiezaTablero y que implementa la interfaz Movible.
//Al ser una clase abstracta no se pueden crear objetos de la misma.
//La implementación de la interfaz Movible permite la llamada a las funciones que contiene la misma.
public abstract class PiezaAjedrez extends PiezaTablero implements Movible{
    //Contructor principal que utiliza el super para llamar a los atributos de la clase padre.
    public PiezaAjedrez(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    //Método que recibe dos parámetros de tipo entero y nos dice si si se puede mover al lugar indicado.
    public boolean esMovible(int x, int y) {
        //si las posiciones de x e y estan entre los siguientes requisitos.
        if (x >= 1 && x <= 8 && y >= 1 && y <=8){
            //si las posiciones indicadas cumplen los siguiente requisitos.
            if (this.getPosicionX()+this.getPosicionY() == x+y
                || this.getPosicionX()-x == this.getPosicionY()-y
                || this.getPosicionX()-x == this.getPosicionY()-y
                || this.getPosicionX() == x || this.getPosicionY() == y){

                //Devuelve un true, es decir, puede realizar el movimiento.
                return true;
            }else {
                //Caso contrario, en el que el movimiento será no válido y devolvera false.
                return false;
            }
        }
        return false;
    }

    //Método que recibe dos parámetros de tipo entero y mueve las piezas al lugar indicado.
    @Override
    public void mover(int x, int y) {
        //si es movible es true, se moverá la pieza.
        if (esMovible( x, y)){
            //asignamos el nuevo valor a this.setPosicionX y a this.setPosicionY.
            this.setPosicionX(x);
            this.setPosicionY(y);
            //Imprimimos el siguiente mensaje.
            System.out.println("La pieza se ha movido.");
        }else {
            //Caso contrario en el que no se puede mover a la posición indicada y delvuelve el siguiente mensaje.
            System.out.println("No se puede mover a esta posición.");
        }
    }
}
