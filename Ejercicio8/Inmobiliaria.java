package com.company.Ejercicio8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

//Clase Inmobiliaria con sus atributos y métodos.
public class Inmobiliaria {
    //Declaración de sus atributos con sus tipo y asignandoles el modificador private.
    ArrayList<Vivienda> listaViviendas;

    //Constructor principal que recibe una serie de parámetros y los guarda en las variables.
    public Inmobiliaria(ArrayList<Vivienda> listaViviendas) {
        this.listaViviendas = listaViviendas;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public ArrayList<Vivienda> getListaViviendas() {
        return listaViviendas;
    }

    public void setListaViviendas(ArrayList<Vivienda> listaViviendas) {
        this.listaViviendas = listaViviendas;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inmobiliaria that = (Inmobiliaria) o;
        return Objects.equals(listaViviendas, that.listaViviendas);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(listaViviendas);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Inmobiliaria: " +
                "lista de viviendas = " + listaViviendas;
    }

    //Método que añade una nueva vivienda a la lista.
    public void altaVivienda(Vivienda vivienda){
        //Si la lista de vivienda contiene a la vivienda que le pasamos.
        if (listaViviendas.contains(vivienda)){
            //Si está en la lista cambio disponibilidad a true.
            vivienda.setDisponibilidad(true);
            //Imprime el siguiente mensaje.
            System.out.println("La vivienda pasa a estar disponible.");
        } else {
            //Añado la vivienda a la lista.
            listaViviendas.add(vivienda);
            //Cambio disponibilidad a true.
            vivienda.setDisponibilidad(true);
            //Imprime el siguiente mensaje.
            System.out.println("Se ha añadido la vivienda con referencia " + vivienda.getReferencia() + " y pasa a estar disponible.");
        }

        //Creamos un objeto iterator llamado it.
        /*Iterator<Vivienda> it = listaViviendas.iterator();

        //Recorrer la lista y presentamos por pantalla sus elementos.
        while (it.hasNext()){
            if (listaViviendas.contains(vivienda)){
                //Si está en la lista cambio disponibilidad a true.     //todo cambiar disponibilidad a true.
                vivienda.setDisponibilidad(true);
                System.out.println("La vivienda pasa a estar disponible.");
                break;
            } else {
                //Añado la vivienda a la lista y cambio disponibilidad a true.
                listaViviendas.add(vivienda);
                vivienda.setDisponibilidad(true);
                System.out.println("Se ha añadido la vivienda y pasa a estar disponible.");
                break;
            }
        }*/
    }

    //Método que añade una oferta a una la lista de ofertas de una vivienda.
    public void altaOferta(Vivienda vivienda, Oferta oferta){
        //Comprobamos si la lista de ofertas de la vivienta contiene la oferta que le pasamos.
        if (vivienda.getListaOfertas().contains(oferta)){
            //Imprime el siguiente mensaje.
            System.out.println("Esta oferta de " + oferta.getImporte() + "€ ya existe");
        } else {
            //En caso de que no se encuentre en la lista de ofertas de la vivienda que queremos ofertar.
            //Añadimos la oferta a la lista de ofertas de la vivienda.
            vivienda.getListaOfertas().add(oferta);
            //Imprimimos el siguiente mensaje.
            System.out.println("Se ha añadido correctamente la oferta de " + oferta.getImporte() +
                                "€, a la vivienda con referencia " + vivienda.getReferencia());
        }
    }

    public void bajaVivienda(Vivienda vivienda){
        if (listaViviendas.contains(vivienda)){
            vivienda.setDisponibilidad(false);
            vivienda.getListaOfertas().removeAll(vivienda.getListaOfertas());
            System.out.println("La lista de ofertas de la vivienda con referencia "
                            + vivienda.getReferencia() +" han sido eliminadas.");
        }else {
            System.out.println("La vivienda con referencia " + vivienda.getReferencia()
                                + " no se enuentra en la inmobiliaria.");
        }



        //Si la lista de vivienda contiene a la vivienda que le pasamos.
        /*if(listaViviendas.contains(vivienda)){
            //Eliminamos con el remove la vivienda de la lista.
            listaViviendas.remove(vivienda);
            //Imprime el siguiente mensaje.
            System.out.println("La vivienda con referencia " + vivienda.getReferencia() +" ha sido eliminada de la inmobiliaria.");
        }else {
            //Imprime el siguiente mensaje.
            System.out.println("La vivienda con referencia " + vivienda.getReferencia() + " no se enuentra en la inmobiliaria.");
        }*/

        /*Iterator<Vivienda> it = listaViviendas.iterator();

        while(it.hasNext()){
            if(listaViviendas.contains(it.next())){
                it.remove();
                System.out.println("La vivienda ha sido eliminada.");
            }else {
                System.out.println("Esta vivienda no se enuentra en la lista de viviendas.");
            }
        }*/
    }
}
