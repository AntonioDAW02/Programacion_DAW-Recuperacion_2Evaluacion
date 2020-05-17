package com.company.Ejercicio8;

import java.util.Objects;

//Clase Oferta con sus atributos y métodos.
public class Oferta {
    //Declaración de sus atributos con sus tipo y asignandoles el modificador private.
    private Persona persona;
    private int importe;

    //Constructor principal que recibe una serie de parámetros y los guarda en las variables.
    public Oferta(Persona persona, int importe) {
        this.persona = persona;
        this.importe = importe;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return importe == oferta.importe &&
                Objects.equals(persona, oferta.persona);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(persona, importe);
    }

    //Método toString que devuelve en un string los valores de las propiedades./
    @Override
    public String toString() {
        return "Oferta: " +
                "persona = " + persona +
                ", importe = " + importe;
    }
}
