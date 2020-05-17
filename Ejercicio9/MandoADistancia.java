package com.company.Ejercicio9;

import java.util.Objects;

//Clase MandoADistancia que contiene los atributos y métodos necesarios.
//Esta clase es abstracta por lo que no se pueden crear objetos de éste tipo.
public abstract class MandoADistancia implements Comparable<MandoADistancia>{
    //Creamos los atributos indicando su tipo y asignandole el modificador private.
    private  String modelo;
    private  String anchura;
    private  String altura;
    private  Double precio;
    private Estado estado = Estado.APAGADO;

    //Constructor principal que recibe unos parámetros y los guarda en los atributos.
    public MandoADistancia(String modelo, String anchura, String altura, Double precio, Estado estado) {
        this.modelo = modelo;
        this.anchura = anchura;
        this.altura = altura;
        this.precio = precio;
        this.estado = estado;
    }

    //Declaración de getter y setter de cada atributo.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnchura() {
        return anchura;
    }

    public void setAnchura(String anchura) {
        this.anchura = anchura;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //Método encender.
    //Éste método cambia el estado a ENCENDIDO, es decir, se encarga de encender los diferentes aparatos.
    public void encender(){
        //Compruebo si el estado actual es APAGADO.
        if (this.getEstado().equals(Estado.APAGADO)) {
            //Cambio el estado del mando usando el setEstado a ENCENDIDO.
            setEstado(Estado.ENCENDIDO);
        }
    }

    //Método apagar.
    //Éste método cambia el estado a APAGADO, es decir, se encarga de encender los diferentes aparatos.
    public void apagar(){
        //Compruebo si el estado actual es ENCENDIDO.
        if (this.getEstado().equals(Estado.ENCENDIDO)) {
            //Cambio el estado del mando usando el setEstado a APAGADO.
            setEstado(Estado.APAGADO);
        }
    }

    //Creamos el método compareTo, para comparar dos objetos por precio y nos devolverá un orden de menor a mayor.
    //Recibimos por parámetro un objeto MandoADistancia llamado "o".
    @Override
    public int compareTo(MandoADistancia o) {
        //COmprobamos si el precio de un objeto es menor que el precio del objeto pasado por parámetro.
        if (this.precio < o.precio){
            return -1;
        } else {
            return 1;
        }
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MandoADistancia that = (MandoADistancia) o;
        return Objects.equals(modelo, that.modelo) &&
                Objects.equals(anchura, that.anchura) &&
                Objects.equals(altura, that.altura) &&
                Objects.equals(precio, that.precio) &&
                estado == that.estado;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(modelo, anchura, altura, precio, estado);
    }

    /* Método toString que devuelve en un string los valores de las propiedades.
     * Con super.toString() estamos haciendo una llamada al toString de la clase padre.
     */
    @Override
    public String toString() {
        return "Mando a distancia: " +
                "modelo = '" + modelo + '\'' +
                ", anchura = '" + anchura + '\'' +
                ", altura = '" + altura + '\'' +
                ", precio = " + precio +
                ", estado = " + estado;
    }
}
