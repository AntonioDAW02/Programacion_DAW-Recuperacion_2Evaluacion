package com.company.Ejercicio8;

import java.util.Objects;

//Clase Inmueble con sus atributos y métodos.
public class Inmueble {
    //Declaración de sus atributos con sus tipo y asignandoles el modificador private.
    private String referencia;
    private int anioConstruccion;
    private Domicilio domicilio;

    //Constructor principal que recibe una serie de parámetros y los guarda en las variables.
    public Inmueble(String referencia, int anioConstruccion, Domicilio domicilio) {
        this.referencia = referencia;
        this.anioConstruccion = anioConstruccion;
        this.domicilio = domicilio;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getanioConstruccion() {
        return anioConstruccion;
    }

    public void setanioConstruccion(int anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return anioConstruccion == inmueble.anioConstruccion &&
                Objects.equals(referencia, inmueble.referencia) &&
                Objects.equals(domicilio, inmueble.domicilio);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(referencia, anioConstruccion, domicilio);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Inmueble :" +
                "referencia = '" + referencia + '\'' +
                ", año de construcción = " + anioConstruccion +
                ", domicilio = " + domicilio;
    }
}

