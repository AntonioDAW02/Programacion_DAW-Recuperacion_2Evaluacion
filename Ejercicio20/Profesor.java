package com.company.Ejercicio20;

import java.util.Objects;

//Creamos la clase Profesor con sus correspondientes atributos y métodos.
public class Profesor {
    //Creamos los atributos necesarios indicando su tipo de datos y que es private.
    private String nombre;
    private String dni;
    private String profesion;
    private int id;
    private int idDepartamento;

    //Contructor de la clase que recibe una serie de parámetro y se guardan en sus correspondientes atributos.
    public Profesor(String nombre, String dni, String profesion, int id, int idDepartamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.profesion = profesion;
        this.id = id;
        this.idDepartamento = idDepartamento;
    }

    //Creamos los getter y setter de cada uno de los atributos de la clase.
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return id == profesor.id &&
                Objects.equals(nombre, profesor.nombre) &&
                Objects.equals(dni, profesor.dni) &&
                Objects.equals(profesion, profesor.profesion) &&
                Objects.equals(idDepartamento, profesor.idDepartamento);
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(nombre, dni, profesion, id, idDepartamento);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return "Profesor: " +
                "nombre = '" + nombre + '\'' +
                ", dni = '" + dni + '\'' +
                ", profesión = '" + profesion + '\'' +
                ", id = " + id +
                ", id departamento = " + idDepartamento;
    }
}
