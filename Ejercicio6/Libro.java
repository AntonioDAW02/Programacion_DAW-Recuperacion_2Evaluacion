package com.company.Ejercicio6;

import java.util.Objects;

/* Clase Libro con sus atributos y métodos y que hereda de la clase Publicación.
 * Hereda la clase Publicacion padre para poder usar sus atributos.
 * Implementa la interfaz Prestable para poder usar sus métodos.
 */
public class Libro extends Publicacion implements Prestable{
    //Declaracion de los atributos con sus tipos asignandole el modificador private.
    private boolean prestado = false;

    //Constructor principal de la clase que recibe parámetros que seran guardados en las variables.
    public Libro(int codigo, String titulo, int anioPublicacion) {
        //Con el super hace la llamada a los atributos de la clase padre Publicación.
        super(codigo, titulo, anioPublicacion);
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Libro libro = (Libro) o;
        return prestado == libro.prestado;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prestado);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    //Con super.toString() estamos haciendo una llamada al toString de la clase padre.
    @Override
    public String toString() {
        return super.toString() + "Libro: " +
                "prestado = " + prestado;
    }

    /* Método presta implementado con la interfaz prestable.
     * Éste método realiza la función de prestar un libro cambiando prestado a true.
     * Devuelve otro mensaje si ya está prestado
    */
    @Override
    public void presta() {
        if (!prestado) {
            System.out.println("Presta el libro " + this.getTitulo());
            prestado = true;
        } else {
            System.out.println("El libro " + this.getTitulo() + " ya ha sido prestado.");
        }
    }

    /* Método devuelve implementado con la interfaz prestable.
     * Este método nos devuelve el libro si estaba prestado.
     * Y devuelve otro mensaje en caso contrario.
    */

    @Override
    public void devuelve() {
        //Imprime un mensaje
        System.out.println("Devuelve el libro " + this.getTitulo() + ".");
        //Cambia prestado a false indicando asi que ya no está prestado.
        prestado = false;
    }

    //Método estaPrestado implementado con la interfaz prestable.
    //Éste método nos indica si el libro esta prestado o no.
    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}
