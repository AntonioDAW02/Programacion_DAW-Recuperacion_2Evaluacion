package com.company.Ejercicio9;

import java.util.Objects;

//Clase MandoMiniCadena que contiene los atributos y métodos necesarios.
//Hereda los atributos de la clase MandoADistancia con extends.
public class MandoMiniCadena extends MandoADistancia implements SubirBajarVolumen{
    private int volumen;

    //Constructor principal que recibe unos parámetros y los guarda en los atributos.
    //con super() llamamos a los atributos de la clase padre MandoADistancia.
    public MandoMiniCadena(String modelo, String anchura, String altura, Double precio, Estado estado, int volumen) {
        super(modelo, anchura, altura, precio, estado);
        this.volumen = volumen;
    }

    //Declaración de getter y setter de cada atributo.
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    //Hacemos un override del método encender que se encarga de cambiar el estado a ENCENDIDO.
    @Override
    public void encender() {
        //Llamamos al metodo encender de la clase padre MandoADistancia.
        super.encender();
        //Imprime un mensaje indicando que se ha encendido.
        System.out.println("Se ha " + this.getEstado() + " la mini cadena con modelo: " + this.getModelo());
    }

    //Hacemos un overrride del método apagar que se encarga de cambiar el estado a APAGADO.
    @Override
    public void apagar() {
        //Llamamos al metodo apagar de la clase padre MandoADistancia.
        super.apagar();
        //Imprime un mensaje indicando que se ha encendido.
        System.out.println("Se ha " + this.getEstado() + " la mini cadena con modelo: " + this.getModelo());
    }

    //Usamos el método subirVolumen con la implementación de la Interfaz subirBajarVolumen.
    @Override
    public void subirVolumen() {
        //Obtenemos el volumen y en el caso de que sea >=100.
        if (this.getVolumen() >= 100){
            //Imprime el siguiente mensaje.
            System.out.println("No se puede subir más.");
        } else {
            //En caso contrario, el volumen sera menor a 100 y se incrementa en 1.
            volumen++;
            //Imprime el siguiente mensaje.
            System.out.println("El volumen es de: " + this.getVolumen() + ".");
        }
    }

    //Usamos el método bajarVolumen con la implementación de la Interfaz subirBajarVolumen.
    @Override
    public void bajarVolumen() {
        //Obtenemos el volumen y en el caso de que sea <=0.
        if (this.getVolumen() <= 0){
            //Imprime el siguiente mensaje.
            System.out.println("No se puede bajar más.");
        } else {
            //En caso contrario, el volumen sera mayor a 0 y se incrementa en 1.
            volumen--;
            //Imprime el siguiente mensaje.
            System.out.println("El volumen es de: " + this.getVolumen() + ".");
        }
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MandoMiniCadena that = (MandoMiniCadena) o;
        return volumen == that.volumen;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volumen);
    }

    /* Método toString que devuelve en un string los valores de las propiedades.
     * Con super.toString() estamos haciendo una llamada al toString de la clase padre.
     */
    @Override
    public String toString() {
        return super.toString() + "Mando mini cadena: " +
                "volumen = " + volumen;
    }
}
