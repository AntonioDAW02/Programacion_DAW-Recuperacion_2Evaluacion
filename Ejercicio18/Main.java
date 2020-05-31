package com.company.Ejercicio18;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Creamos un escaner para leer lo que el usuario nos pase.
        Scanner sc = new Scanner(System.in);

        //Creamos las variables necesarias.
        String palabra = "";
        String traduccion = "";
        String sinonimo = "";
        String respuesta = "";

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
                traduccion = diccionario.get(palabra);
                boolean existe = false;

                //Creamos un iterator y recorremos las claves del mapa.
                //Con keySet guardamos en un set las claves.
                Iterator it = diccionario.keySet().iterator();

                //Con el metodo hasNext comprobamos que haya un siguiente elemento.
                while (it.hasNext()) {
                    String clave = (String) it.next();
                    if (!clave.equals(palabra)) {
                        sinonimo = diccionario.get(clave);
                        if (sinonimo.equals(traduccion)) {
                            existe = true;
                            listaSinonimos.add(clave);
                        }
                    }
                }

                //Si existe un sinónimo de la palabra.
                if (existe) {
                    //Imprime la lista de sinónimos.
                    System.out.println(listaSinonimos);
                } else {
                    //Imprime los siguientes mensajes.
                    System.out.println("No conozco sinónimos de ésta palabra");
                    System.out.println("¿Quiere introducir un sinónimo para ésta palabra?");
                    respuesta = sc.nextLine();
                    //Cuando reciba un "si" del usuario.
                    if (respuesta.equals("si")){
                        //Imprime el siguiente mensaje.
                        System.out.println("Introduce un sinónimo de: " + palabra);
                        //Guarda lo que el usuario introduce en la variable sinónimo.
                        sinonimo = sc.nextLine();
                        //Añadimos el nuevo elemento al Mapa.
                        diccionario.put(sinonimo,traduccion);
                    }
                }

            } else {
                //Imprimimos los siguientes mensajes
                System.out.println("La palabra " + palabra + " no se encuentra en el diccionario");
                System.out.println("¿Quiere añadir la palabra al diccionario?");
                //Guardamos lo que introduce el usuario en la variable respuesta.
                respuesta = sc.nextLine();
                //Si la respuesta del usuario es "si".
                if (respuesta.equals("si")){
                    //Imprime el siguiente mensaje.
                    System.out.println("Añade su tradicción en inglés");
                    //Lo guarda en la variable traducción.
                    traduccion = sc.nextLine();
                    //Lo añade al mapa.
                    diccionario.put(palabra,traduccion);
                }
            }
        }
        System.out.println("Has salido del programa");
        //System.out.println(diccionario);
    }
}