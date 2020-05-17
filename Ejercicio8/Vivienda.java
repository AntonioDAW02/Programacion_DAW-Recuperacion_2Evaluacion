package com.company.Ejercicio8;

import java.util.ArrayList;
import java.util.Objects;

//Clase Vivienda con sus atributos y métodos.
public class Vivienda extends Inmueble implements Comparable<Oferta>{
    //Declaración de sus atributos con sus tipo y asignandoles el modificador private.
    private Persona persona;
    private Tipo tipo;
    private boolean disponibilidad;
    private ArrayList<Oferta> listaOfertas;

    //Constructor principal que recibe una serie de parámetros y los guarda en las variables.
    public Vivienda(String referencia, int anioConstruccion, Domicilio domicilio, Persona persona, Tipo tipo, boolean disponibilidad, ArrayList<Oferta> listaOfertas) {
        super(referencia, anioConstruccion, domicilio);
        this.persona = persona;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
        this.listaOfertas = listaOfertas;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }

    public void setListaOfertas(ArrayList<Oferta> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        //Crea un objeto de tipo vivienda y la iguala a la variable o que la castea a tipo Vivienda.
        Vivienda vivienda = (Vivienda) o;
        //Si la referencia de la vivienda es igual que la del objeto creado, son iguales
        if (this.getReferencia().equals(vivienda.getReferencia())){
            return true;
        }else {
            //Caso en el que los objetos no son iguales.
            return false;
        }
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), persona, tipo, disponibilidad, listaOfertas);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    //Con super.toString() estamos haciendo una llamada al toString de la clase padre.
    @Override
    public String toString() {
        return super.toString() + "Vivienda: " +
                "persona = " + persona +
                ", tipo = " + tipo +
                ", disponibilidad = " + disponibilidad + "\n" +
                ", lista de ofertas = " + listaOfertas;
    }

    //Método ordenaOfertas que ordene el listado de ofertas por precio.
    public boolean ordenaOfertas( boolean ascendente){  //todo sin terminar



        return ascendente;
    }

    //La ordenación natural de las ofertas es por precio ascendente.
    @Override
    public int compareTo(Oferta oferta) {               //todo sin terminar
        int res = 0;



        return res;
    }
}
