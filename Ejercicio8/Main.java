package com.company.Ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList<>();
        Persona p1 = new Persona("03576058P","Pepe");
        Persona p2 = new Persona("46584567A","Laura");
        Persona p3 = new Persona("34981244Z","Luisa");
        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);

        ArrayList<Oferta> listaOfertas = new ArrayList<>();
        listaOfertas.add(new Oferta(p1,200000));
        listaOfertas.add(new Oferta(p1,175000));
        listaOfertas.add(new Oferta(p2,180000));

        ArrayList<Domicilio> listaDomicilios = new ArrayList<>();
        Domicilio d1 = new Domicilio("calle sevilla", 20, "otros", 12120);
        listaDomicilios.add(d1);

        ArrayList<Vivienda> listaViviendas = new ArrayList<>();
        Vivienda v1 = new Vivienda("1234",2015,d1,p2,Tipo.CASA,true,listaOfertas);
        Vivienda v2 = new Vivienda("3784",2018,d1,p3,Tipo.PISO,true,listaOfertas);
        Vivienda v3 = new Vivienda("4312",2020,d1,p3,Tipo.CASA,true,listaOfertas);

        Inmobiliaria i1 = new Inmobiliaria(listaViviendas);

        //i1.altaVivienda(v2);
        //System.out.println();

        i1.altaVivienda(v1);
        i1.altaVivienda(v2);
        i1.altaVivienda(v3);

        //i1.bajaVivienda(v2);
        //i1.bajaVivienda(v3);

        Oferta o4 = new Oferta(p2,180000);
        Oferta o5 = new Oferta(p2,185000);
        System.out.println();
        i1.altaOferta(v3,o4);
        System.out.println();
        i1.altaOferta(v3,o5);
        System.out.println();
        i1.bajaVivienda(v3);
        System.out.println(v3.getListaOfertas());
    }
}
