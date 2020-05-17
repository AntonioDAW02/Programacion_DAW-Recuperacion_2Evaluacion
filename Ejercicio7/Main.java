package com.company.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        //Creamos objetos de la clase Revista y le pasamos los parámetros necesarios.
        Revista revista1 = new Revista("10/05/2020",12345, "Estadio Deportivo", 2015, 150);
        Revista revista2 = new Revista("10/05/2020",21345, "EL Desmarque", 2010, 200);
        Revista revista3 = new Revista("10/05/2020",32145, "Mundo Deportivo", 2013, 250);
        Revista revista4 = new Revista("10/05/2020",43215, "Diario AS", 2017, 300);
        Revista revista5 = new Revista("10/05/2020",54321, "Marca", 2005, 350);

        //Creamos objetos de la clase Libro y le pasamos los parámetros necesarios.
        Libro libro1 = new Libro("10/05/2020",21345,"Puro Fútbol",1995);
        Libro libro2 = new Libro("10/05/2020",23145,"Golazo",1999);
        Libro libro3 = new Libro("10/05/2020",23415,"Ole mi Sevilla",2013);
        Libro libro4 = new Libro("10/05/2020",23451,"El Método Monchi",2015);
        Libro libro5 = new Libro("10/05/2020",32145,"A Balón Parado",2017);

        //Llamada al metodo toString de la revista1.
        System.out.println(revista1.toString());

        //Llamada al metodo toString de la libro1.
        System.out.println(libro1.toString());

        //Comprobamos la fecha de compra del libro2.
        System.out.println(libro2.fechaCompra);

        //Llamamos al método presta() al objeto libro3.
        libro3.presta();
        System.out.println(libro3.estaPrestado());
    }
}
