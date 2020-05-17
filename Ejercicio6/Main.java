package com.company.Ejercicio6;

public class Main {
    public static void main(String[] args) {

        //Creamos objetos de la clase Revista y le pasamos los parámetros necesarios.
        Revista revista1 = new Revista(12345, "Estadio Deportivo", 2015, 150);
        Revista revista2 = new Revista(21345, "EL Desmarque", 2010, 200);
        Revista revista3 = new Revista(32145, "Mundo Deportivo", 2013, 250);
        Revista revista4 = new Revista(43215, "Diario AS", 2017, 300);
        Revista revista5 = new Revista(54321, "Marca", 2005, 350);

        //Llamamos al método toString definido en la clase Revista a cada uno de los objetos creados.
        //System.out.println(revista1.toString());
        //System.out.println();
        //System.out.println(revista2.toString());
        //System.out.println();
        //System.out.println(revista3.toString());
        //System.out.println();
        //System.out.println(revista4.toString());
        //System.out.println();
        //System.out.println(revista5.toString());

        //Creamos objetos de la clase Libro y le pasamos los parámetros necesarios.
        Libro libro1 = new Libro(21345,"Puro Fútbol",1995);
        Libro libro2 = new Libro(23145,"Golazo",1999);
        Libro libro3 = new Libro(23415,"Ole mi Sevilla",2013);
        Libro libro4 = new Libro(23451,"El Método Monchi",2015);
        Libro libro5 = new Libro(32145,"A Balón Parado",2017);

        //Llamada de las funciones implementadas con la interfaz Prestable.
        System.out.println(libro1.isPrestado());

        //Llamamos al método presta() al objeto libro2.
        libro2.presta();
        //Llamamos al método estaPrestado() que nos devuelve true ya que anteriormente lo prestamos.
        System.out.println(libro2.estaPrestado());

        //Llamamos al método devuelve() al objeto libro2.
        libro2.devuelve();
        //Llamamos al método estaPrestado() que nos devuelve false ya que anteriormente lo hemos devuelto.
        System.out.println(libro2.estaPrestado());
    }
}
