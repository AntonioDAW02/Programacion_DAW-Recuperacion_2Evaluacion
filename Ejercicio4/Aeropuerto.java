package com.company.Ejercicio4;

import java.util.Arrays;

import java.util.Objects;

//Clase Aeropuerto con sus atributos y métodos.
public class Aeropuerto {
    //Creamos los atributos cada uno con su tipo y asignandole private.
    private String nombre;
    private Vuelo[] listaVuelos;
    private String fecha;

    //Constructor principal que recibe dos parametros y los guarda en sus respectivas.
    public Aeropuerto(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    //Creamos los getter y los setter.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo[] getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(Vuelo[] listaVuelos) {
        this.listaVuelos = listaVuelos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //Método para añadir vuelos al aeropuerto.
    public boolean addVuelo(Vuelo vuelo){
        //Compruebo que el array no está vacio.
        if (listaVuelos!=null){
            //Creamos una variable de tipo boolean inicializada a true.
            boolean existe = true;
            //Recorro el array "listaVuelos".
            for (int i = 0; i < listaVuelos.length; i++) {
                //Compruebo que algún elemento del array es igual al objeto pasajero.
                if (listaVuelos[i].equals(vuelo)){
                    //Compruebo si algunos de los aeropuertos de origen de la lista coincide con el parámetro "vuelo".
                    if (listaVuelos[i].getAeropuertoOrigen()==nombre){
                        //Devuelve un mensaje.
                        System.out.println("Este vuelo ya se encuentra en el aeropuerto.");
                    }
                }else {
                    //En caso de que ningun elemento del array sea igual al objeto pasajero, cambio existe a false.
                    existe = false;
                }
            }

            //En el caso de que existe sea igual a false, es decir, que no exista el pasajero.
            if (existe==false){
                //Añade al pasajero si no se encuentra en la lista.
                //Creamos el nuevo vector con la nueva capacidad.
                Vuelo[] nuevaLista = new Vuelo[listaVuelos.length+1];

                //Recorremos la lista de vuelos.
                for (int i = 0; i < listaVuelos.length; i++) {
                    //Copio lo que tenia en el nuevo array.
                    nuevaLista[i] = listaVuelos[i];
                }

                //ListaVuelos={vuelo1,vuelo2,vuelo3} length=3 ultima posición=2
                //nuevaLista={vuelo1,vuelo2,vuelo3,null} length=4 ultima posición=3
                //Guarda vuelo vuelo en la última posición de la nueva lista.
                nuevaLista[listaVuelos.length] = vuelo;
                //Cambio el nuevo array por el antiguo.
                listaVuelos = nuevaLista;
                //Devuelve true.
                return true;
            }
        }else{
            //En el caso de que el array esté vacio, le decimos que sea de dimension 1
            listaVuelos = new Vuelo[1];
            listaVuelos[0] = vuelo;
        }
        return false;
    }

    //Método para eliminar vuelos de un aeropuerto.
    public void delVuelo(Vuelo vuelo){
        if (listaVuelos!=null){
            boolean existe = false;
            for (int i = 0; i < listaVuelos.length; i++) {
                if (listaVuelos[i].equals(vuelo)){
                    System.out.println("Se ha borrado el vuelo: " + vuelo);
                    existe = true;
                }
            }

            if (existe){
                //Borramos el vuelo.
                Vuelo[] nuevaLista = new Vuelo[listaVuelos.length-1];

                int k = 0;
                for (int j = 0; j < listaVuelos.length; j++) {
                    if (!listaVuelos[j].equals(vuelo)){
                        nuevaLista[k] = listaVuelos[j];
                        k++;
                    }
                }
                listaVuelos = nuevaLista;
            }else {
                System.out.println("Este vuelo no existe");
            }
        }else{
            listaVuelos = new Vuelo[1];
            listaVuelos[0] = vuelo;
        }
    }

    //Método para mostrar vuelos en una fecha determinada.
    public void mostrarVuelo(String fecha){
        boolean noExiste = true;
        if (listaVuelos!=null) {
            System.out.println("Lista de vuelos con fecha: " + fecha);
            for (int i = 0; i < listaVuelos.length; i++) {
                if (listaVuelos[i].getFecha() == fecha) {
                    System.out.println(listaVuelos[i]);
                    noExiste = false;
                }
            }
        }else {
            System.out.println("No hay una lista de vuelos.");
        }

        if (noExiste){
            System.out.println("No hay vuelos en esta fecha");
        }
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aeropuerto that = (Aeropuerto) o;
        return Objects.equals(nombre, that.nombre) &&
                Arrays.equals(listaVuelos, that.listaVuelos);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(listaVuelos);
        return result;
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Aeropuerto: " +
                "nombre = '" + nombre + '\'' +
                ", lista de vuelos = " + Arrays.toString(listaVuelos);
    }
}
