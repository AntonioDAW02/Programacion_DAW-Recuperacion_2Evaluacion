package com.company.Ejercicio12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del archivo");
        String nombre = sc.nextLine();
        System.out.println("Introduce el tamaño del archivo");
        int tam = sc.nextInt();
        System.out.println("Introduce la unidad del archivo");
        int unidad = sc.nextInt();

        File archivo = new File(nombre);
        float peso = archivo.length();
        float partes = peso/tam;

        System.out.println("1- Byte / 2- Kilobyte / 3- Megabyte");

        switch (unidad){
            case 1:
                System.out.println("Has elegido Byte.");
            break;
            case 2:
                System.out.println("Has elegido Kylobyte.");
                break;
            case 3:
                System.out.println("Has elegido Megabyte.");
                break;
            default:
                System.out.println("Has introducido un número que no corresponde con ninguna unidad.");
        }

        //Comprobamos que no introduzca un número negativo para el tamaño del archivo.
        if (tam < 0){
            System.out.println("El tamaño no puede ser negativo");
            System.out.println("Introduce el tamaño del archivo");
            tam = sc.nextInt();
        }

        System.out.println();
        System.out.println(partes);

        //Comprobar que el nombre del archivo es correcto.





        /******************************************/

        try {
            BufferedReader leer = new BufferedReader(new FileReader((archivo)));

            String linea = leer.readLine();
            char[] array = new char[tam];

            //int cont = 0;

            while (linea!=null){
                String[] letras = linea.split("");
                //recorremos el array de string
                for (int i = 0; i < letras.length; i++) {
                    array[i] = letras[i].charAt(0);
                }
                linea = leer.readLine();
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }












    }
}
