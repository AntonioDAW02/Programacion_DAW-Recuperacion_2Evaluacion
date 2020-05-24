package com.company.Ejercicio11;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Creamos un escaner para leer por teclado.
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca el nombre de una fichero.
        System.out.println("Introduce el nombre de un fichero");
        //Guardamos en la variable fichero lo que el usuario escribe por teclado.
        String fichero = sc.nextLine();

        //Creamos un fichero con el nombre que guardamos en la variable "fichero".
        File archivo = new File(fichero);

        //Si existe un archivo con este nombre.
        if (archivo.exists()){
            //Pide al usuario que escriba por teclado una cadena para buscar en el archivo.
            System.out.println("Introduce una cadena de texto");
            //Guardamos en la variable contenido lo que el usuario escribe por teclado.
            String contenido = sc.nextLine();

            //Leemos el fichero que le hemos pasado.
            BufferedReader leer = new BufferedReader(new FileReader(archivo));

            //Variable para guardar cada linea.
            String linea = "";

            //Variable contador que guarda el número de veces que encuentra la cadena.
            int contCadena = 0;

            //Lee por linea y lo guarda en la variable.
            while ((linea = leer.readLine()) != null){
                //Si alguna de las lineas contiene lo que el usuario pasa por teclado y guarda en "contenido".
                if (linea.contains(contenido)){
                    contCadena++;
                }
            }

            //Si el archivo contiene la cadena 1 o mas veces.
            if (contCadena > 0){
                //Devuelve el siguiente mensaje, mostrando el número de veces que ha encontrado la cadena.
                System.out.println("La cadena '" + contenido + "' se ha encontrado " + contCadena + " veces.");
            } else {
                //En caso contrario,en el que el fichero no contenga la cadena pasada por teclado por el usuario.
                System.out.println("La cadena '" + contenido + "' no se ha encontrado en el fichero.");
            }

        }else {
            System.out.println("El fichero no existe.");
        }
    }
}
