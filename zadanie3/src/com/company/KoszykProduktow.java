package com.company;

import java.util.LinkedList;

public class KoszykProduktow {

    private LinkedList produkty = new LinkedList();


    public void dodajProdukt(String produkt) {
        produkty.add(produkt);
    }


    public void wyswietlProdukty() {

        System.out.println(produkty);
    }


}