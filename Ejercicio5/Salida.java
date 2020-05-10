package com.company.Ejercicio5;

import java.util.Objects;

//Clase Salida con sus atributos y métodos necesarios.
public class Salida {
    //Creamos las variables necesarias cada una de su tipo y asignandole private.
    private String fecha;
    private TipoSalida tipoSalida;

    //Constructor principal que recibe dos parámetro y lo guarda las variables.
    public Salida(String fecha, TipoSalida tipoSalida) {
        this.fecha = fecha;
        this.tipoSalida = tipoSalida;
    }

    //Getter y setter de los atributos de la clase
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public TipoSalida getTipoSalida() {
        return tipoSalida;
    }

    public void setTipoSalida(TipoSalida tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    //El método equals comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salida salida = (Salida) o;
        return Objects.equals(fecha, salida.fecha) &&
                tipoSalida == salida.tipoSalida;
    }

    //Devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(fecha, tipoSalida);
    }

    //Método toString que devuelve en un string los valores de las propiedades.
    @Override
    public String toString() {
        return "Salida: " +
                "fecha = '" + fecha + '\'' +
                ", tipo de salida = " + tipoSalida;
    }
}
