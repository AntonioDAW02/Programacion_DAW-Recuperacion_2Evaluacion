package com.company.Ejercicio19;

import java.io.*;
import java.util.*;

public class EstacionMeteorologica implements Serializable{
    private List<Medicion> lista = new ArrayList<>();
    private Coordenadas coordenadas;
    File ficheroMediaciones;

    /*todo - El constructor de la EstacionMeteorologica recibirá un nombre de un
       fichero binario que contendrá las mediciones, y un objeto de tipo Coordenadas*/
    //todo - falta que se le pase un fichero binario con las mediaciones, el cual debe crearse arriba.
    //Para probarlo al principio, create un archivo vacío "datos.dat" o con el nombre que quieras.
    public EstacionMeteorologica(File ficheroMediaciones, Coordenadas coordenadas) {
        this.ficheroMediaciones = ficheroMediaciones;
        this.coordenadas = coordenadas;
    }

    public List<Medicion> getLista() {
        return lista;
    }

    public void setLista(List<Medicion> lista) {
        this.lista = lista;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    //Método para añadir medicción a la lista.
    public boolean addMedicion(Medicion medicion){
        //Si la lista no contiene el objeto mediación.
        if (!lista.contains(medicion)){
            //Añadimos el objeto a la lista.
            lista.add(medicion);
            return true;
        }else {
            //Devuelve false en el caso de que no se añada porque la lista ya contiene ese objeto mediación.
            return false;
        }
    }

    //Método que ordena las temperaturas de manera ascendente.
    public void ordenaTemperaturasAsc(){
        //Hacemos la llamada del metodo sort de Collections, pasandole la lista.
        Collections.sort(lista);
        //Imprimimos la lista ordenada por temperatura ascendente.
        System.out.println("Lista ordenada por temperatura ascendente: "+lista);
    }

    //Método "ordenaHumedadesDesc" que ordene la lista por orden descendente de humedades.
    public  void ordenaHumedadesDesc(){
        //Hacemos la llamada del metodo sort de Collections, pasandole la lista y el comparator, para comparar en este caso por humedad.
        Collections.sort(lista, new Comparator<Medicion>() {
            @Override
            public int compare(Medicion medicion, Medicion t1) {
                return t1.getHumedad()-medicion.getHumedad();
            }
        });

        //Collections.sort(lista);
        //Imprimimos la lista ordenada por humedadad en orden descendente.
        System.out.println("Lista ordenada por humedad descendente: "+lista);
    }

    //Método "presionMaxima" que devuelva el objeto Medicion de mayor presion.
    public void presionMaxima(){

    }

    //Método guardarFichero que reciba el nombre de un fichero y guarde los datos de
    //la lista en ese fichero binario.
    public void guardarFichero(File fichero) throws IOException {
        //Procesamos los datos para guardarlo en el fichero indicado.
        ObjectOutputStream oosMedicion = new ObjectOutputStream(new FileOutputStream(fichero));

        //Escribimos en el fichero la lista que contiene objetos de mediación.
        oosMedicion.writeObject(lista);
    }

    //método "buscaMedicion" que reciba un objeto de tipo Medicion y devuelva true o
    //false dependiendo de si lo encuentra o no.
    public void buscarMediacion(Medicion medicion){
        //Comprobamos que la lista contiene el objeto mediación que recibimos por parámetro.
        if (lista.contains(medicion)){
            //Imprimimos el objeto mediación si se encuentra en la lista.
            System.out.println("Se ha encontrado la medición"+medicion);
        }else {
            //Imprime el mensaje de que no se ha encontrado la mediación en la lista.
            System.out.println("Ésta medición no existe.");
        }
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstacionMeteorologica that = (EstacionMeteorologica) o;
        return Objects.equals(lista, that.lista) &&
                Objects.equals(coordenadas, that.coordenadas);
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(lista, coordenadas);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return "Estación de meterología: \n" +
                " lista = " + lista +
                ", \n\t coordenadas = " + coordenadas ;
    }
}
