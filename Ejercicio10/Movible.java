package com.company.Ejercicio10;

//Interfaz Movible en la que se definen las funciones esMovible() y mover() y que se implementaran en las clases correspondientes.
public interface Movible {
    //Método es movible. Ésta función devuelve true o false dependiendo si se puede mover a las posiciones que serán
    //las que pasaremos por parámetro.
    public boolean esMovible(int x, int y);
    //Método mover() que mueve la pieza a la nueva posición siempre y cuando la funcion esMOvible() devuelva true.
    public void mover(int x, int y);
}
