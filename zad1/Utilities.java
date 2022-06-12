package com.company.zad1;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Utilities {



    public static void podziel (){
        System.out.println("Podaj wartosc");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("wynik to");

        for (int i=1; i<=s.length(); i++)
        {
            int dlugosc=s.length();
            if(dlugosc%2==0){
            char[] actualValue = s.toCharArray();
            if(i%2==0){
                System.out.print("'");
                System.out.print(actualValue[i-2]);
                 System.out.print(actualValue[i-1]);
                System.out.print("'");
               System.out.print(",");}
        }
            if(dlugosc%2!=0){
                char[] actualValue = s.toCharArray();
                if (i==s.length())
                {
                    System.out.print("'");
                    System.out.print(actualValue[i-1]);
                    System.out.print("+");
                    System.out.print("'");
                }
               else if(i%2==0){
                    System.out.print("'");
                    System.out.print(actualValue[i-2]);
                    System.out.print(actualValue[i-1]);
                    System.out.print("'");
                    System.out.print(",");}
            }


    }
        System.out.println();
}}
