package com.company.Ejercicio20;

import java.io.*;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

//Creamos el método Instituto con sus atributos y métodos.
public class Instituto {
    //Creamos los atributos necesarios indicando su tipo de datos y que es private
    private Set<Departamento> departamentos = new TreeSet<>();
    private String nombre;
    private int codigo;

    //Contructor principal al que le pasamos un fichero de profesores, el mombre y el código del instituto.
    public Instituto(String nombreFichero, String nombre, int codigo) {
        File ficheroProfesores = new File(nombreFichero + ".dat");
        this.nombre = nombre;
        this.codigo = codigo;

        try{
            //Lectura del fichero que recibimos por parámetro.
            ObjectInputStream oisProfedores = new ObjectInputStream(new FileInputStream(ficheroProfesores));

            //Guardardamos cada objeto dentro del fichero.
            Profesor objetoProf = (Profesor) oisProfedores.readObject();

            //Mientras que no este vacio.
            while(objetoProf != null){
                //Creamos el departamento con el id al que pertenece el profesor
                Departamento nuevoDept = new Departamento(objetoProf.getIdDepartamento());
                //Si el departamento se encuentra dentro del conjunto de departamentos.
                if (contieneDepto(nuevoDept)){
                    //Recorremos la lista de profesores.
                    for (Profesor prof: nuevoDept.getListaProfesores()) {
                        //Añadimos el profesor a la lista.
                        nuevoDept.getListaProfesores().add(prof);
                    }
                }else {
                    //Si el departamento no se encuentra dentro del conjunto de departamento, lo añadimos.
                    departamentos.add(nuevoDept);
                }
            }
        //Caso en el que se produce alguna excepcion.
        }catch (IOException | ClassNotFoundException e){
            e.getMessage();
        }
    }

    //Creamos los getter y setter de los atributos de la clase.
    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Método que comprueba si el conjunto de departamentos contiene el departamento ue se le pasa por parámetro.
    public boolean contieneDepto(Departamento d){
        //Creamos un iterator para recorrer el conjunto set.
        Iterator it = departamentos.iterator();
        //Mientras haya un proximo elemento dentro del conjunto.
        while (it.hasNext()){
            //Comprobamos si ese proximo elemento del conjunto es igual al objeto pasado por parámetro.
            if (it.next().equals(d)){
                //Devolvemos true porque existe.
                return true;
            }
        }
        //Devolvemos false porque no existe.
        return false;
    }

    //Método que devuelve el objeto de tipo departamento si el conjunto de departamento lo contiene.
    Departamento getDepartamento(Departamento d){
        Departamento dept = null;
        //Si el conjunto de departamento contiene el objeto d de tipo Departamentço.
        if (departamentos.contains(d)){
            //guardamos d en el objeto dept.
            dept = d;
        }
        //Devolvemos dept.
        return dept;
    }

    //Metodo anadeDepto que comprueba si el conjunto contiene el departamento pasado por parámetro y si no, lo añadimos.
    boolean anadeDepto(Departamento d){
        //Si el departamento se encuentra dentro del conjunto de departamentos.
        if (contieneDepto(d)){
            //Devolvemos false, porque no lo vamos a añadir otra vez.
            return false;
        }else {
            //Añadimos el departamento y devolvemos true.
            departamentos.add(d);
            return true;
        }
    }

    //Método que se encarga de guardar los profesores en un fichero.
    void guardarProfesoresEnFichero(String nomfichero) throws IOException {
        //Creamos un fichero con el nombre que le pasamos por parámetro.
        File ficheroProfesores = new File(nomfichero + ".dat");
        //Escribimos sobre el fichero
        ObjectOutputStream oosProfesores = new ObjectOutputStream(new FileOutputStream(ficheroProfesores));
        //Recorremos el conjunto de departamentos pasando por cada departamento
        for (Departamento dept: departamentos) {
            //Creamos una nueva lista de profesores.
            TreeSet listaProfesores = (TreeSet) dept.getListaProfesores();
            //Escribimos esa lista dentro del fichero.
            oosProfesores.writeObject(listaProfesores);
        }
    }

    //Método equals que comprueba que los objetos son del mismo tipo y se llaman igual.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return codigo == instituto.codigo &&
                Objects.equals(departamentos, instituto.departamentos) &&
                Objects.equals(nombre, instituto.nombre);
    }

    //Método hashCode que devuelve un número que representa la instancia de la clase.
    @Override
    public int hashCode() {
        return Objects.hash(departamentos, nombre, codigo);
    }

    //Método toString que devuelve en un string los tipoFiguraes de las propiedades.
    @Override
    public String toString() {
        return "Instituto: " +
                "departamentos = " + departamentos +
                ", nombre = '" + nombre + '\'' +
                ", código = " + codigo;
    }
}
