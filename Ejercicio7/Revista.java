package com.company.Ejercicio7;


import java.util.Objects;

/* Clase Revista con sus atributos y métodos y que hereda de la clase Publicación.
 * Hereda la clase Publicacion padre para poder usar sus atributos.
 * Implementa la interfaz Prestable para poder usar sus métodos.
 */
public class Revista extends Publicacion {
    //Declaracion de los atributos con sus tipos asignandole el modificador private.
    private int numero;

    //Constructor principal de la clase que recibe parámetros que seran guardados en las variables.
    public Revista(String fechaCompra, int codigo, String titulo, int anioPublicacion, int numero) {
        super(fechaCompra, codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Revista revista = (Revista) o;
        return numero == revista.numero;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numero);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return super.toString() + " Revista: " +
                "numero = " + numero;
    }
}
