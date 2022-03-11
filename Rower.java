package com.company;

public class Rower {

    boolean wRuchu;
    int predkosc;




    public void start()
    {
        wRuchu=true;
    }

    public void przyspiesz(int zwieksz)
    {
        predkosc=zwieksz;
        System.out.println("prędkość: "+predkosc+"\n");
        wRuchu=true;

    }

    public void stop()
    {
        wRuchu=false;
        predkosc=0;
    }

    public void wyswietlStan()
    {
        System.out.println("prędkość: "+predkosc);
        System.out.println("Czy w ruchu "+(wRuchu?"tak":"nie")+"\n");
    }

}