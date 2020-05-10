package com.company.Ejercicio3;

import java.util.*;

//Creamos la clase Vuelo con sus propiedades y métodos.
public class Vuelo {
    //Declaración de propiedades con sus tipos de datos.
    private Avion avion;
    private String fecha;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private Pasajero[] listaPasajeros;

    //Constructor principal, que recibe parámetros y guarda los valores en las variables.
    public Vuelo(Avion avion, String fecha, String aeropuertoOrigen, String aeropuertoDestino) {
        this.avion = avion;
        this.fecha = fecha;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
    }

    //Declaración de getter y setter de cada propiedad.
    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public String getEropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setEropuertoDestino(String eropuertoDestino) {
        this.aeropuertoDestino = eropuertoDestino;
    }

    public Pasajero[] getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(Pasajero[] listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    //Creamos el método addPassenger.
    public boolean addPassenger(Pasajero pasajero) {
        //Compruebo que el array no está vacio.
        if (listaPasajeros != null) {
            //Variable de tipo boolean inicializada a true.
            boolean existe = true;
            //Recorro el array "listaPasajeros".
            for (int i = 0; i < listaPasajeros.length; i++) {
                //Compruebo que algún elemento del array es igual al objeto pasajero.
                if (listaPasajeros[i].equals(pasajero)) {
                    //Devuelvo el siguiente mensaje.
                    System.out.println("Este pasajero ya se encuentra en la lista.");
                } else {
                    //En caso de no existir, cambio el valor de "existe" a false.
                    existe = false;
                }
            }

            //En caso de que existe es false, es decir, no existe el pasajero.
            if (existe == false) {
                //Añade al pasajero si no se encuentra en la lista.
                //Creamos el nuevo vector con la nueva capacidad.
                Pasajero[] nuevaLista = new Pasajero[listaPasajeros.length + 1];

                //Recorremos el array antiguo.
                for (int i = 0; i < listaPasajeros.length; i++) {
                    //Copio lo que tenia en el nuevo array.
                    nuevaLista[i] = listaPasajeros[i];
                }

                //Añade pasajero en la última posición de nuevaLista.
                nuevaLista[listaPasajeros.length] = pasajero;
                //Cambio el nuevo array por el antiguo.
                listaPasajeros = nuevaLista;
                //Devuelvo true.
                return true;
            }
        } else {
            //Caso en el que lista de pasajero es null.
            //Se le asigna una capacidad de 1 a "listaPasajeros".
            listaPasajeros = new Pasajero[1];
            //Se le añade el pasajero pasado por parámetro a la unica posición de "listaPasajeros".
            listaPasajeros[0] = pasajero;
        }
        return false;
    }

    //Creamos el método delPassenger.
    public void delPassenger(String pasaporte) {
        //Variable de tipo boolean inicializada a false.
        boolean existe = false;
        //Recorro el array "listaPasajeros".
        for (int i = 0; i < listaPasajeros.length; i++) {
            //Compruebo si algún pasaporte de los pasajeros de "listPasajero" coincide con el pasado por parámetro.
            if (listaPasajeros[i].getPasaporte() == pasaporte) {
                //Devuelve un mensaje por pantalla.
                System.out.println("Se ha borrado el pasajero con pasaporte: " + pasaporte);
                //Cambia el valor de existe a true.
                existe = true;
            }
        }

        //Caso en que existe es true, es decir, existe el pasajero.
        if (existe) {
            //Borramos el pasajero.
            //Creamos la nueva lista de pasajeros con capacidad uno menos que "listaasajeros".
            Pasajero[] nuevaLista = new Pasajero[listaPasajeros.length - 1];
            //Creamos una nueva variable inicializada a 0.
            int k = 0;

            //Recorremos la lista antigua "listaPasajeros".
            for (int j = 0; j < listaPasajeros.length; j++) {
                //Compruebo los pasaportes que no coinciden con el pasado por parámetro.
                if (listaPasajeros[j].getPasaporte() != pasaporte) {
                    //Copia el valor en la lista nueva.
                    nuevaLista[k] = listaPasajeros[j];
                    //Incrementa en 1 cada vez que no coincen los pasaportes.
                    k++;
                }
            }
            /* Como siempre vamos a usar la lista antigua, después de copiarla en la nueva
             * sin copiar el pasaporte que coincide, asignamos la lista nueva a la antigua.
             */
            listaPasajeros = nuevaLista;
        } else {
            //Caso en que existe es false, es decir, no existe el pasajero.
            System.out.println("No existe un pasajero con éste pasaporte");
        }
    }

    //Creamos el método listPassenger.
    public void listPassenger() {
        //Imprimimos por pantalla un mensaje.
        System.out.println("Lista de pasajeros: ");

        //Recorremos la lista de pasajeros.
        for (int i = 0; i < listaPasajeros.length; i++) {
            //Imprime cada pasajero de la lista.
            System.out.println(listaPasajeros[i]);
        }
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(avion, vuelo.avion) &&
                Objects.equals(fecha, vuelo.fecha) &&
                Objects.equals(aeropuertoOrigen, vuelo.aeropuertoOrigen) &&
                Objects.equals(aeropuertoDestino, vuelo.aeropuertoDestino) &&
                Arrays.equals(listaPasajeros, vuelo.listaPasajeros);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        int result = Objects.hash(avion, fecha, aeropuertoOrigen, aeropuertoDestino);
        result = 31 * result + Arrays.hashCode(listaPasajeros);
        return result;
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Vuelo: " +
                "avion = " + avion +
                ", fecha = " + fecha +
                ", aeropuertoOrigen = '" + aeropuertoOrigen + '\'' +
                ", eropuertoDestino = '" + aeropuertoDestino + '\'' +
                ", listaPasajeros = " + Arrays.toString(listaPasajeros);
    }
}
