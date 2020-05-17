package com.company.Ejercicio8;

import java.util.Objects;

//Clase Domicilio con sus atributos y métodos.
public class Domicilio {
    //Declaración de sus atributos con sus tipo y asignandoles el modificador private.
    private String nombreVia;
    private int numero;
    private String otrosDatos;
    private int codigoPostal;

    //Constructor principal que recibe una serie de parámetros y los guarda en las variables.
    public Domicilio(String nombreVia, int numero, String otrosDatos, int codigoPostal) {
        this.nombreVia = nombreVia;
        this.numero = numero;
        this.otrosDatos = otrosDatos;
        this.codigoPostal = codigoPostal;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOtrosDatos() {
        return otrosDatos;
    }

    public void setOtrosDatos(String otrosDatos) {
        this.otrosDatos = otrosDatos;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domicilio domicilio = (Domicilio) o;
        return numero == domicilio.numero &&
                codigoPostal == domicilio.codigoPostal &&
                Objects.equals(nombreVia, domicilio.nombreVia) &&
                Objects.equals(otrosDatos, domicilio.otrosDatos);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(nombreVia, numero, otrosDatos, codigoPostal);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Domicilio: " +
                "nombre via = '" + nombreVia + '\'' +
                ", número = " + numero +
                ", otros datos = '" + otrosDatos + '\'' +
                ", código postal = " + codigoPostal;
    }
}
