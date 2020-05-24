package com.company.Ejercicio14;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main implements Serializable{

    //Declaracion de las listas.
    static Avion[] listaAviones = new Avion[50];
    static Pasajero[] listaPasajeros = new Pasajero[50];

    //Declaracion de contadores.
    static int contAviones = 0;
    static int contPasajeros = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido!");

        File ficheroAviones = new File("aviones.dat");
        File ficheroPasajeros = new File("pasajeros.dat");


        boolean res;

        try{
            //Hacemos la lectura del fichero binario que guarda los aviones.
            ObjectInputStream oisAviones = new ObjectInputStream(new FileInputStream((ficheroAviones)));

            //Tipo de datos que quiero sacar del fichero.
            Avion avion;

            //Leemos el fichero objeto a objeto hasta que encuentre un null.
            while((avion = (Avion) oisAviones.readObject())!=null){
                //Si pasamos de la capacidad del array.
                if (contAviones >= listaAviones.length){
                    //Redimensionamos el array con el método copyOf pasandole el array y la nueva dimensión.
                    Avion[] listaAux = Arrays.copyOf(listaAviones,contAviones+1);
                    listaAviones = listaAux;
                }

                //guardamos el objeto leido que lo casteamos a tipo avion.
                listaAviones[contAviones] = avion;
                //Aumento el contador de aviones.
                contAviones++;
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //Caso en el numero de aviones leidos sea menor a la longitud de la lista
        if (contAviones < listaAviones.length){
            if (contAviones == 0){
                listaAviones = new Avion[1];
            }else {
                //Redimensionamos con la cantidad de aviones leidos.
                Avion[] listaAux = Arrays.copyOf(listaAviones, contAviones);
                listaAviones = listaAux;
            }
        }

        try{
            //Hacemos la lectura del fichero binario que guarda los pasajeros.
            ObjectInputStream oisPasajeros = new ObjectInputStream(new FileInputStream((ficheroPasajeros)));

            //Tipo de datos que quiero sacar del fichero.
            Pasajero pasajero;

            //Leemos el fichero objeto a objeto hasta que encuentre un null.
            while((pasajero = (Pasajero) oisPasajeros.readObject())!=null){
                //Si pasamos de la capacidad del array.
                if (contPasajeros >= listaPasajeros.length){
                    //Redimensionamos el array con el método copyOf pasandole el array y la nueva dimensión.
                    Pasajero[] listaAux = Arrays.copyOf(listaPasajeros,contPasajeros+1);
                    listaPasajeros = listaAux;
                }

                //guardamos el objeto leido que lo casteamos a tipo pasajero.
                listaPasajeros[contPasajeros] = pasajero;
                //Aumento el contador de pasajeros.
                contPasajeros++;
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        //Caso en el que el número de pasajeros leidos sea menor a la longitud de la lista.
        if (contPasajeros < listaPasajeros.length){
            if (contPasajeros == 0){
                listaPasajeros = new Pasajero[1];
            }else {
                //Redimensionamos con la cantidad de aviones leidos.
                Pasajero[] listaAux = Arrays.copyOf(listaPasajeros, contPasajeros);
                listaPasajeros = listaAux;
            }
        }

        //Creamos dos objetos de la clase Avión.
        Avion avion1 = new Avion("Ryanair", 70.67, "Boeing 737-800", ModoVuelo.CRUCERO);
        Avion avion2 = new Avion("Iberia", 74.80, "Airbus A350", ModoVuelo.CRUCERO);
        Avion avion3 = new Avion("Rusia", 64.80, "Airbus A950", ModoVuelo.MANUAL);
        //Creamos dos objetos de la clase Pasajero.
        Pasajero pasajero1 = new Pasajero("Antonio","sevilla 22", "90812345T", Estado.EMBARCADO);
        Pasajero pasajero2 = new Pasajero("Pedro","Almeria 21", "18276709A", Estado.PENDIENTE);

        int opcion = 1;

        while(opcion != 0) {

            System.out.println("Selecciona: \n" +
                    "1 - Añadir un nuevo Avión \n" +
                    "2 - Eliminar un Avion \n" +
                    "3 - Añadir un Pasajero \n" +
                    "4 - Eliminar un Avión \n" +
                    "5 - Mostrar la lista de Aviones \n" +
                    "6 - Mostrar la lista de Pasajeros \n" +
                    "0 - Salir de la aplicación");

            opcion = sc.nextInt();

            sc.nextLine();

            //Usamos un switch para permitir al usuario elegir uno de los caso que se les mostrará.
            switch (opcion) {
                case 1:
                    //Caso1: Hace llamada de la función addAvion y recibe los parámetros que necesita.
                    System.out.println("Has seleccionado 1. Añade un nuevo Avión");
                    Avion avion = new Avion();
                    System.out.println("Indica la aerolinea");

                    avion.setAerolinea(sc.nextLine());

                    System.out.println("Indica la longitud");

                    avion.setLongitud(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Indica el modelo");

                    avion.setModelo(sc.nextLine());

                    //System.out.println("Indica el modo de vuelo");
                    //avion.setModoVuelo();

                    res = addAvion(avion);

                    if (res) {
                        System.out.println("Has añadido un avión.");
                    } else {
                        System.out.println("No se ha podido introducir el avión. Vuelve a intentarlo");
                    }
                    break;
                case 2:
                    //Caso2: Hace llamada de la función delAvion y recibe los parámetros que necesita.
                    System.out.println("Has seleccionado 2. Borra un Avión");
                    res = delAvion(listaAviones, avion1, contAviones);

                    if (res) {
                        System.out.println("Has borrado un avión.");
                    } else {
                        System.out.println("No se ha podido borrar el avión. Vuelve a intentarlo");
                    }
                    break;
                case 3:
                    //Caso3: Hace llamada de la función addPasajero y recibe los parámetros que necesita.
                    System.out.println("Has seleccionado 3. Añade un nuevo Pasajero");
                    res = addPasajero(listaPasajeros, pasajero1, contPasajeros);

                    if (res) {
                        System.out.println("Has añadido un pasajero.");
                    } else {
                        System.out.println("No se ha podido introducir el pasajero. Vuelve a intentarlo");
                    }
                    break;
                case 4:
                    //Caso4: Hace llamada de la función delPasajero y recibe los parámetros que necesita.
                    System.out.println("Has seleccionado 2. Borra un Pasajero");

                    res = delPasajero(listaPasajeros, pasajero1, contPasajeros);

                    if (res) {
                        System.out.println("Has borrado un avión.");
                    } else {
                        System.out.println("No se ha podido borrar el avión. Vuelve a intentarlo");
                    }

                    break;
                case 5:
                    //Caso5: Hace llamada de la función listAviones y recibe los parámetros que necesita.
                    System.out.println("Has seleccionado 2. Muestra la lista de Aviones");
                    listAviones();
                    break;
                case 6:
                    //Caso6: Hace llamada de la función listPasajeros y recibe los parámetros que necesita.
                    System.out.println("Has seleccionado 2. Muestra la lista de Pasajeros");
                    listPasajeros(listaPasajeros);
                    break;
                case 0:
                    //En este caso se entrará cuando el usuario quiera salir de la aplicación.
                    System.out.println("Sales de la aplicación");
                    //Guardamos lo que hemos añadido a los arrays en los correspondientes ficheros binarios.
                    guardarAviones(listaAviones, ficheroAviones);
                    //guardarPasajeros(listaPasajeros);
                    break;

                default:
                    //En este caso se entrará cuando el usuario elija una opción que sea inválida.
                    System.out.println("Error al seleccionar una opción. Inténtelo de nuevo");
            }

        }

        for (int i = 0; i < listaAviones.length; i++) {
            System.out.println(listaAviones[i]);
        }

    }

    //Método para guardar los objetos en el fichero binario.
    public static void guardarAviones(Avion[] listaAviones, File ficheroAviones){ //todo sin terminar
        try {
            //Hacemos la escritura en un fichero binario.
            ObjectOutputStream oosAvion = new ObjectOutputStream(new FileOutputStream((ficheroAviones)));

            //Escribimos los objetos en el fichero.
            oosAvion.writeObject(listaAviones);

            //Recorremos todos los elementos del array.
            /*for (int i = 0; i < listaAviones.length; i++) {
                //Escribimos cada objeto en el fichero con el método writeObject
                oosAvion.writeObject(listaAviones[i]);
            }*/

            oosAvion.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    //Método para guardar los objetos en el fichero binario.
    public static void guardarPasajeros(Pasajero[] listaPasajeros){
        try {
            //Hacemos la escritura en un fichero binario.
            ObjectOutputStream oosPasajero = new ObjectOutputStream(new FileOutputStream(new File("aviones.dat")));

            //Recorremos todos los elementos del array.
            for (int i = 0; i < listaPasajeros.length; i++) {
                //Escribimos cada objeto en el fichero con el método writeObject
                oosPasajero.writeObject(listaPasajeros[i]);
            }

            oosPasajero.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    //Método para añadir un avión a un array.
    public static boolean addAvion(Avion avion){
        boolean res = false;
        //Compruebo que el array no esté vacio.
        if (listaAviones!=null){
            //Creamos una variable inicializada a true.
            boolean existe = true;
            //Recorremos la lista de aviones pasando por cada elemento (avion).
            for (int i = 0; i < listaAviones.length; i++) {
                //Compruebo si algun elemento del array coincide con el pasado por parametro
                if (avion.equals(listaAviones[i])){
                    System.out.println("Ya existe este avión");
                    break;
                } else {
                    //En caso de que no exista el avión que pasamos por parámetro, cambiamos existe a false.
                    existe = false;
                }
            }
            
            //En el caso de que no exista el avión.
            if (!existe){
                //Redimensionamos el array cpn el copyOf pasandole el array y la nueva dimensión.
                Avion[] listaAux = Arrays.copyOf(listaAviones, contAviones+1);
                listaAviones = listaAux;

                //guardamos el objeto en el array.
                listaAviones[contAviones] = avion;
                //Aumento el contador de aviones.
                contAviones++;
                res = true;
             }
        } else {
            //En el caso de que el array esté vacio, le decimos que sea de dimension 1
            listaAviones[contAviones] = avion;
            contAviones++;
            res = true;
        }
        return res;
    }

    public static boolean delAvion(Avion[] listaAviones, Avion avion, int contAviones){
        boolean res = false;
        //Creamos una variable inicializada a true.
        boolean existe = true;
        for (int i = 0; i < listaAviones.length; i++) {
            if (avion.equals(listaAviones[i])){
                //Devuelve un mensaje por pantalla.
                System.out.println("Se ha borrado el avion");
                //Cambia el valor de existe a true.
                existe = false;
            }
        }

        if (!existe){
            //Redimensionamos el array cpn el copyOf pasandole el array y la nueva dimensión.
            Avion[] listaAux = Arrays.copyOf(listaAviones, contAviones);
            //Guardamos la lista auxiliar en la lista de aviones.
            listaAviones = listaAux;

            //Disminuyo el contador de aviones.
            contAviones--;
            res = true;
        }
        return res;
    }

    //Creamos el método addPassenger.
    public static boolean addPasajero(Pasajero[] listaPasajeros, Pasajero pasajero, int contPasajeros) {
        boolean res = false;
        //Compruebo que el array no esté vacio.
        if (listaPasajeros!=null){
            //Creamos una variable inicializada a true.
            boolean existe = true;
            //Recorremos la lista de aviones pasando por cada elemento (avion).
            for (int i = 0; i < listaPasajeros.length; i++) {
                //Compruebo si algun elemento del array coincide con el pasado por parámetro.
                if (pasajero.equals(listaPasajeros[i])){
                    //Imprime el siguiente mensaje.
                    System.out.println("Ya existe este pasajero");
                    break;
                } else {
                    //En caso de que no exista el avión que pasamos por parámetro, cambiamos existe a false.
                    existe = false;
                }
            }

            //En el caso de que no exista el avión.
            if (!existe){
                //Redimensionamos el array cpn el copyOf pasandole el array y la nueva dimensión.
                Pasajero[] listaAux = Arrays.copyOf(listaPasajeros, contPasajeros+1);
                listaPasajeros = listaAux;

                //guardamos el objeto en el array.
                listaPasajeros[contPasajeros] = pasajero;
                //Aumento el contador de aviones.
                contPasajeros++;
                res = true;
            }
        } else {
            //En el caso de que el array esté vacio, le decimos que sea de dimension 1
            listaPasajeros[0] = pasajero;
            contPasajeros++;
            res = true;
        }
        //Devuelve el valor de res dependiendo de si el pasajero existia o lo ha insertado.
        return res;
    }

    //Método para borrar el pasajero de la lista.
    public static boolean delPasajero(Pasajero[] listaPasajeros, Pasajero pasajero, int contPasajeros){
        //Creamos la variable res inicializada a false.
        boolean res = false;
        //Creamos la variable existe inicializada a true.
        boolean existe = true;
        //Recorremos la lista de pasajeros pasando por cada uno de sus elementos.
        for (int i = 0; i < listaPasajeros.length; i++) {
            //si alguno de los elementos coincide con el objeto tipo pasajero pasado por parametro.
            if (pasajero.equals(listaPasajeros[i])){
                //Devuelve un mensaje por pantalla.
                System.out.println("Se ha borrado el avion");
                //Cambia el valor de existe a true.
                existe = false;
            }
        }

        //En el caso de que no exista.
        if (!existe){
            //Redimensionamos el array cpn el copyOf pasandole el array y la nueva dimensión.
            Pasajero[] listaAux = Arrays.copyOf(listaPasajeros, contPasajeros);
            //Guardamos la lista auxiliar en la lista de aviones.
            listaPasajeros = listaAux;

            //Disminuyo el contador de aviones.
            contPasajeros--;
            res = true;
        }
        return res;
    }

    //Método para mostrar los aviones.
    //Creamos el método listAviones.
    public static void listAviones() {
        //Imprimimos por pantalla un mensaje.
        System.out.println("Lista de aviones: ");

        //Recorremos la lista de pasajeros.
        for (int i = 0; i < listaAviones.length; i++) {
            //Imprime cada pasajero de la lista.
            System.out.println(listaAviones[i]);
        }
    }

    //Método para mostrar los pasajeros.
    //Creamos el método listPassenger.
    public static void listPasajeros(Pasajero[] listaPasajeros) {
        //Imprimimos por pantalla un mensaje.
        System.out.println("Lista de pasajeros: ");

        //Recorremos la lista de pasajeros.
        for (int i = 0; i < listaPasajeros.length; i++) {
            //Imprime cada pasajero de la lista.
            System.out.println(listaPasajeros[i]);
        }
    }
}
