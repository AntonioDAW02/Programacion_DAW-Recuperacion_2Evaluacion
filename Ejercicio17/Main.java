package com.company.Ejercicio17;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Creamos un escaner para leer lo que el usuario nos pase.
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario una palabra oara mostrar sus sinónimos.
        String palabra = "";

        //Creamos un mapa con clave "String" y valor "String".
        Map<String, String> diccionario = new HashMap<>();
        //Creamos un arrayList donde vamos a guardar los sinónimos de la palabra que pasa el usuario por escaner.
        ArrayList<String> listaSinonimos = new ArrayList<>();

        //Añadimos palabras y su traducción al diccionario.
        diccionario.put("caliente", "hot");
        diccionario.put("ardiente", "hot");
        diccionario.put("abrasador", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        //Mientras la palabra sea diferente a salir.
        while (!(palabra.equals("salir"))) {
            //Pedimos al usuario que introduzca la palabra.
            System.out.println("\n Introduce una palabra y le diremos los sinónimos");
            //Guardamos lo que nos pasa el usuario en el atributo.
            palabra = sc.nextLine().toLowerCase();
            //Usamos containsKey para comprobar si el mapa diccionario contiene el valor de "palabra" como clave.
            if (diccionario.containsKey(palabra)) {
                //Guardamos la traduccion al ingles de la palabra(si existe).
                String traduccion = diccionario.get(palabra);
                boolean existe = false;

                //Creamos un iterator y recorremos las claves del mapa.
                //Con keySet guardamos en un set las claves.
                Iterator it = diccionario.keySet().iterator();

                //Con el método hasNext comprobamos que haya un siguiente elemento.
                while (it.hasNext()) {
                    //Creamos un atributo donde vamos a guardar cada clave de Mapa.
                    String clave = (String) it.next();
                    //Si la clave es diferente a la clave que pasa el usuario.
                    if (!clave.equals(palabra)) {
                        //Guardamos el valor de cada una de las claves en la variable sinónimo.
                        String sinonimo = diccionario.get(clave);
                        //Si las la variable sinónimo coincide con la variable traducción.
                        if (sinonimo.equals(traduccion)) {
                            //Cambiamos el valor de existe a true.
                            existe = true;
                            //Añadimos a la lista de sinónimos las claves.
                            listaSinonimos.add(clave);
                        }
                    }
                }

                //Si existe un sinónimo de la palabra.
                if (existe) {
                    //Imprime la lista de sinónimos.
                    System.out.println(listaSinonimos);
                } else {
                    //C¡IMprime el siguiente mensaje.
                    System.out.println("No conozco sinónimos de ésta palabra");
                }

            } else {
                //Imprime el siguiente mensaje
                System.out.println("La palabra " + palabra + " no se encuentra en el diccionario");
            }
        }
        //Imprime el siguiente mensaje.
        System.out.println("Has salido del programa");
        //System.out.println(diccionario);
    }
}