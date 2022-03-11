package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {



        KoszykProduktow koszyk= new KoszykProduktow();


        koszyk.dodajProdukt("p1");
        koszyk.dodajProdukt("p2");
        koszyk.dodajProdukt("p3");

        koszyk.wyswietlProdukty();


    }
}
