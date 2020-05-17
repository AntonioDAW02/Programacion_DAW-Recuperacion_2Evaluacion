package com.company.Ejercicio6;

import java.util.Objects;

//Clase Publicación con sus atributos y métodos.
public abstract class Publicacion {
    //Declaracion de los atributos con sus tipos asignandole el modificador private.
    private int codigo;
    private String titulo;
    private int anioPublicacion;

    //Constructor principal de la clase que recibe parámetros que seran guardados en las variables.
    public Publicacion(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publicacion that = (Publicacion) o;
        return codigo == that.codigo &&
                anioPublicacion == that.anioPublicacion &&
                Objects.equals(titulo, that.titulo);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(codigo, titulo, anioPublicacion);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Publicacion: " +
                "código = " + codigo +
                ", título = '" + titulo + '\'' +
                ", año de publicación = " + anioPublicacion;
    }
}
