package com.company.Ejercicio15;

import java.util.Objects;

//Creamos la clase Pasajero con sus propiedades y métodos.
public class Pasajero {
    //Declarción de propiedades con sus tipos de datos.
    private String nombre;
    private String direccion;
    private String pasaporte;
    private Estado estado;

    //Constructor principal, que recibe parámetros y guarda los valores en las variables.
    public Pasajero(String nombre, String direccion, String pasaporte, Estado estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pasaporte = pasaporte;
        this.estado = estado;
    }

    //Declaración de getter y setter de cada propiedad.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //Método embarcar que devuelve un mensaje.
    public void embarcar(){
        System.out.println("EL pasajero ha embarcado.");
    }

    //Método sonreir que devuelve un mensaje.
    public void sonreir(){
        System.out.println("El pasajero esta feliz.");
    }

    //Método andar que devuelve un mensaje.
    public void andar(){
        System.out.println("El pasajero está andando.");
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(nombre, pasajero.nombre) &&
                Objects.equals(direccion, pasajero.direccion) &&
                Objects.equals(pasaporte, pasajero.pasaporte) &&
                estado == pasajero.estado;
    }

    //Método hashCOde que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, pasaporte, estado);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Pasajero: " +
                "nombre = '" + nombre + '\'' +
                ", direccion = '" + direccion + '\'' +
                ", pasaporte = '" + pasaporte + '\'' +
                ", estado = " + estado ;
    }
}
