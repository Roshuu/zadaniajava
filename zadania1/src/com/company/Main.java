package com.company;

public class Main {

    public static void main(String[] args) {


        Rower rower1 = new Rower();
        Rower rower2 = new Rower();




        rower1.wyswietlStan();
        rower2.wyswietlStan();

        rower2.przyspiesz(30);
        rower1.przyspiesz(20);

        rower1.wyswietlStan();
        rower2.wyswietlStan();


        rower2.stop();

        rower1.wyswietlStan();
        rower2.wyswietlStan();


    }
}
