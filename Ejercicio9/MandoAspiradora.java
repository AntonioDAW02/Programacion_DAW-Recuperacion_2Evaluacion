package com.company.Ejercicio9;

import java.util.Objects;

//Clase MandoAspiradora que contiene los atributos y métodos necesarios.
//Hereda los atributos de la clase MandoADistancia con extends.
public class MandoAspiradora extends MandoADistancia implements SubirBajarVelocidad{
    private int velocidad;

    //Constructor principal que recibe unos parámetros y los guarda en los atributos.
    //con super() llamamos a los atributos de la clase padre MandoADistancia.
    public MandoAspiradora(String modelo, String anchura, String altura, Double precio, Estado estado, int velocidad) {
        super(modelo, anchura, altura, precio, estado);
        this.velocidad = velocidad;
    }

    //Declaración de getter y setter de cada atributo.
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Hacemos un override del método encender que se encarga de cambiar el estado a ENCENDIDO.
    @Override
    public void encender() {
        //Llamamos al metodo encender de la clase padre MandoADistancia.
        super.encender();
        //Imprime un mensaje indicando que se ha encendido.
        System.out.println("Se ha " + this.getEstado() + " la aspiradora con modelo: " + this.getModelo());
    }

    //Hacemos un override del método apagar que se encarga de cambiar el estado a APAGADO.
    @Override
    public void apagar() {
        //Llamamos al metodo apagar de la clase padre MandoADistancia.
        super.apagar();
        //Imprime un mensaje indicando que se ha apagado.
        System.out.println("Se ha " + this.getEstado() + " la aspiradora con modelo: " + this.getModelo());
    }

    //Usamos el método subirVelocidad con la implementación de la Interfaz subirBajarVelocidad.
    @Override
    public void subirVelocidad() {
        //Obtenemos la velocidad y en el caso de que sea >=100.
        if (this.getVelocidad() >= 100){
            //Devuelve el siguiente mensaje.
            System.out.println("No se puede subir más.");
        } else {
            //En caso contrario, la velocidad sera menor a 100 y se incrementa en 1.
            velocidad++;
            //Imprime el siguiente mensaje.
            System.out.println("La velocidad es de: " + this.getVelocidad() + ".");
        }
    }

    //Usamos el método bajarVelocidad con la implementación de la Interfaz subirBajarVelocidad.
    @Override
    public void bajarVelocidad() {
        //Obtenemos la velocidad y en el caso de que sea <=0.
        if (this.getVelocidad() <= 0){
            //Devuelve el siguiente mensaje.
            System.out.println("No se puede bajar más.");
        } else {
            //En caso contrario, la velocidad sera mayor a 0 y se incrementa en 1.
            velocidad--;
            //Imprime el siguiente mensaje.
            System.out.println("La velocidad es de: " + this.getVelocidad() + ".");
        }
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MandoAspiradora that = (MandoAspiradora) o;
        return velocidad == that.velocidad;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), velocidad);
    }

    /* Método toString que devuelve en un string los valores de las propiedades.
     * Con super.toString() estamos haciendo una llamada al toString de la clase padre.
     */
    @Override
    public String toString() {
        return super.toString() + "Mando Aspiradora: " +
                "velocidad=" + velocidad;
    }
}
