package com.company;

public class Main {

    public static void main(String[] args) {

        Punkt punkt1= new Punkt(6,5);
        Punkt punkt2= new Punkt(334,87);

        Linia linia1= new Linia(punkt1,punkt2);


        System.out.println(linia1.koniec.x);
        System.out.println(linia1.poczatek.y);









    }
}
