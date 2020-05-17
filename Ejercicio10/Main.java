package com.company.Ejercicio10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*PiezaDamas dama1 = new PiezaDamas(14, 5,Color.BLANCO);

        System.out.println(dama1.esMovible(6,8));

        dama1.mover(7,8);*/


        /************************************************************************/


        /*ArrayList<PiezaTablero> piezasMovibles = new ArrayList<>();
        ArrayList<PiezaTablero> piezasMoviblesoNO = new ArrayList<>();*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor para la posición X. Debe ser un número entre 0 y 9");
        int posX = sc.nextInt();
        System.out.println("Introduce el valor para la posición Y. Debe ser un número entre 0 y 9");
        int posY = sc.nextInt();
        System.out.println("Introduce el valor para el color de la pieza. Debe ser negro o blanco.");
        int color = sc.nextInt();*/

        /*for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el valor para la posición X. Debe ser un número entre 0 y 9");
            posX = sc.nextInt();
            System.out.println("Introduce el valor para la posición Y. Debe ser un número entre 0 y 9");
            posY = sc.nextInt();
            System.out.println("Introduce el valor para el color de la pieza. Debe ser negro o blanco.");
            color = sc.nextInt();
        }*/

        /*
        // Añadimos 10 Elementos en el ArrayList
        for (int i=1; i<=10; i++){
            nombreArrayList.add("Elemento "+i);
        }
         */

        //Nuevo ArrayList y ordenación por posicionY
        ArrayList<PiezaTablero> nuevaLista = new ArrayList<>();

        nuevaLista.add(new Reina(4,5,Color.BLANCO));
        nuevaLista.add(new PiezaDamas(5,7,Color.BLANCO));
        nuevaLista.add(new PiezaDamas(7,8,Color.NEGRO));
        nuevaLista.add(new Reina(4,8,Color.BLANCO));
        nuevaLista.add(new PiezaDamas(3,6,Color.NEGRO));

        //Utilizamos el método sort de la clase Collections, para ordenar de menor a mayor el ArrayList.
        Collections.sort(nuevaLista);       // Ejemplo uso ordenación natural

        //Imprimimos un mensaje por pantalla junto a la lista ordenada por lo indicado en el método.
        System.out.println("Piezas ordenadas por orden natural, es decir, por posicion Y \n" + nuevaLista);



    }
}
