package com.company.Ejercicio20;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Creamos la clase Departamento con sus correspondientes atributos y métodos.
public class Departamento {
    List<Profesor> listaProfesores = new ArrayList<>();
    private int id;

    //Constructor principal que recibe un parámetro y lo guarda en su correspondiente atributo.
    public Departamento(int id) {
        this.id = id;
    }

    //Creamos los getter y setter de los atributos de la clase.
    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return id == that.id &&
                Objects.equals(listaProfesores, that.listaProfesores);
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(listaProfesores, id);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return "Departamento: \n" +
                "lista de profesores = " + listaProfesores +
                ", id = " + id;
    }
}
