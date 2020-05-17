package com.company.Ejercicio10;

public class PiezaDamas extends PiezaTablero implements Movible{
    //Contructor principal que utiliza el super para llamar a los atributos de la clase padre.
    public PiezaDamas(int posicionX, int posicionY, Color color) {
        super(posicionX, posicionY, color);
    }

    //Método que recibe dos parámetros de tipo entero.
    //Estos parámetros son las posicones donde queremos mover la pieza.
    @Override
    public boolean esMovible(int x, int y) {
        //Comprobamos que las posiciones estén entre 1 y 8, posciones incluidas.
        if (x >= 1 && x <= 8 && y >= 1 && y <=8){
            //Comprobamos que cumpla lo siguiente que será las posciones donde se puede mover.
            if (this.getPosicionX()+this.getPosicionY() == x+y || this.getPosicionX()-x == this.getPosicionY()-y){
                //En caso de cumplirlo deuelve true.
                return true;
            }
        }
        //Si no cumple pues devuelve false.
        return false;
    }

    //Método mover que permite mover la pieza siempre y cuando devuelva true la función esMovible.
    @Override
    public void mover(int x, int y) {
        //si es movible es true, se moverá la pieza.
        if (esMovible( x, y)){
            //asignamos el nuevo valor a this.setPosicionX y a this.setPosicionY.
            this.setPosicionX(x);
            this.setPosicionY(y);
            System.out.println("La pieza se ha movido.");
        }else {
            System.out.println("No se puede mover a esta posición.");
        }
    }

    //Método que compara las piezas y las ordena por orden natural de menor a mayor posición Y.
    @Override
    public int compareTo(PiezaTablero o) {
        return super.compareTo(o);
    }
}
