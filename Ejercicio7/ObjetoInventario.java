package com.company.Ejercicio7;

import java.util.Objects;

//Clase ObjetoInventario con sus atributos y métodos.
//Al ser obstracta no se pueden instanciar objetos de esta clase.
public abstract class ObjetoInventario {
    //Declaracion de los atributos con sus tipos asignandole el modificador private.
    String fechaCompra;

    //Constructor principal de la clase que recibe parámetros que seran guardados en las variables.
    public ObjetoInventario(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    //Getter y setter de cada uno de los atributos de la clase.
    public String getfechaCompra() {
        return fechaCompra;
    }

    public void setfechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoInventario that = (ObjetoInventario) o;
        return Objects.equals(fechaCompra, that.fechaCompra);
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(fechaCompra);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Objeto Inventario: " +
                "fecha de compra = '" + fechaCompra + '\'';
    }
}
