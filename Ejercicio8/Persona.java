package com.company.Ejercicio8;

import java.util.Objects;

//Clase Persona con sus atributos y métodos.
public class Persona {
    //Declaración de sus atributos con sus tipo y asignandoles el modificador private.
    private String nif;
    private String nombre;

    //Constructor principal que recibe una serie de parámetros y los guarda en las variables.
    public Persona(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nif, persona.nif) &&
                Objects.equals(nombre, persona.nombre);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Persona: " +
                "nif = '" + nif + '\'' +
                ", nombre = '" + nombre + '\'';
    }
}
