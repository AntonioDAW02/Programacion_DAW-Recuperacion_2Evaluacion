package com.company.Ejercicio20;

public class Main {
    public static void main(String[] args) {
        //Creamos un objeto de la clase instituto.
        Instituto instituto = new Instituto("profesores", "I.E.S Alixar", 5498);

        //Cremaos los objetos de la clase departamentos.
        Departamento departamento1 = new Departamento(1);
        Departamento departamento2 = new Departamento(2);

        //Creamos los objetos de la clase profesor.
        Profesor profesor1 = new Profesor("Pedro", "57490019A", "informatico", 21, 1);
        Profesor profesor2 = new Profesor("Juan", "98001871Q", "matematicas", 20, 2);

        //Llamamos al metodo anadeDepto que añade un departamento al conjunto de departamentos del instituto.
        instituto.anadeDepto(departamento1);


    }
}
