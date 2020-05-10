package com.company.Ejercicio5;

import java.util.Objects;

//Clase Ciudadano con sus atributos y métodos.
public class Ciudadano {
    private String nombre;
    private String dni;
    private Salida[] listaSalida;

    public Ciudadano(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Getter y Setter de cada uno de los atributos.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Salida[] getSalida() {
        return listaSalida;
    }

    public void setSalida(Salida[] salida) {
        this.listaSalida = salida;
    }

    //Añadir una salida a un ciudadano en una fecha determinada.
    public boolean addSalida(Salida salida){
        //Compruebo que la lista no este vacia.
        if(listaSalida!=null) {
            //Creo una variable existe de tipo boolean.
            boolean existe = true;
            //Recorro el array "listaSalida".
            for (int i = 0; i < listaSalida.length; i++) {
                //Compruebo que algun elemento del array es igual al objeto pasajero.
                if (listaSalida[i].equals(listaSalida)) {
                    //Imprimimos un mensaje.
                    System.out.println("Esta salida ya se encuentra en la lista de este ciudadano.");
                } else {
                    //Cambiamos el valor de existe a false.
                    existe = false;
                }
            }

            //En el caso de que existe sea igual a false, es decir, que no exista el ciudadano.
            if (existe == false) {
                //Añade al ciudadano si no se encuentra en la lista.
                //Creamos el nuevo vector con la nueva capacidad.
                Salida[] nuevaLista = new Salida[listaSalida.length + 1];

                //Recorro el array de salidas "listaSalida".
                for (int i = 0; i < listaSalida.length; i++) {
                    //Copio lo que tenia en el nuevo array.
                    nuevaLista[i] = listaSalida[i];
                }

                //Añado la nueva salida en la última posición de la lista nueva.
                nuevaLista[listaSalida.length] = salida;
                //Cambio el nuevo array por el antiguo.
                listaSalida = nuevaLista;
                //Devuelvo true.
                return true;
            }
        }else {
            //En el caso de que la lista esté vacia, creo un array de dimension 1.
            listaSalida = new Salida[1];
            //Añado el nuevo ciudadano, es decir, estoy inicializando el array.
            listaSalida[0] = salida;
        }
        //Devuelvo false.
        return false;
    }

    //Método que compruebe el número de salidas en una fecha determinada.
    public int comprobarSalidas(String fecha){
        //Creo una variable contador de salidas.
        int cont = 0;

        //Recorremos la lista de salidas.
        for (int i = 0; i < listaSalida.length; i++) {
            //Comprueba que si coincide la fecha pasada con alguna fecha del array de salidas.
            if (listaSalida[i].getFecha().equals(fecha)){
                //Incrementa en 1 el contador
                cont++;
            }
        }
        //Devuelve contador, que será el número de salidas en una fecha determinada.
        return cont;
    }

    public void mostrarMulta(String fecha, Salida[] listaSalida, Salida tipo){
        int multa = 600;

        for (int i = 0; i < listaSalida.length; i++) {
            if (listaSalida[i].getFecha().equals(fecha) && tipo.getTipoSalida().equals(tipo)){

            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudadano ciudadano = (Ciudadano) o;
        return Objects.equals(nombre, ciudadano.nombre) &&
                Objects.equals(dni, ciudadano.dni) &&
                Objects.equals(listaSalida, ciudadano.listaSalida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, listaSalida);
    }

    @Override
    public String toString() {
        return "Ciudadano: " +
                "nombre = '" + nombre + '\'' +
                ", dni = '" + dni + '\'' +
                ", salida = " + listaSalida;
    }
}
