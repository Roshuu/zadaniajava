package com.company;

public class KontoBankowe {

    int saldo;


    KontoBankowe(int saldo)
    {
        this.saldo=saldo;
    }


    public void pokazSaldo()
    {
        System.out.println(saldo);
    }


    public void kredyt(int wez)
    {
        saldo+=wez;
    }

    public void debet(int zabierz)
    {
        saldo-=zabierz;
    }

}
