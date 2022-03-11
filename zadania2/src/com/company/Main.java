package com.company;

public class Main {

    public static void main(String[] args) {

        KontoBankowe konto=new KontoBankowe(5534245);

            konto.pokazSaldo();
            konto.kredyt(4544);
            konto.pokazSaldo();
            konto.debet(15524324);
            konto.pokazSaldo();



    }
}
