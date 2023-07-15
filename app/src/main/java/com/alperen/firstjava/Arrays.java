package com.alperen.firstjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        int[] intarray= new int[5];
        intarray[0]=1;
        intarray[1]=2;
        intarray[2]=3;
        //eğer bütün arrayleri genişliği bitecek kadar tanımlamazsam ne olur?
        System.out.println(intarray[2]);
        //sorunsuz çalıştı ve getirdi.
        //tanımlanmayan ama indeks yeri açılmış yeri istersem?

        System.out.println(intarray[3]);
        //Çalıştı ve 0 yazdırdı.
        //sonrasında eleman tanımlarsam değişir mi?
        intarray[3]=4;
        intarray[4]=5;
        //bir şey değişmedi.
        //iki kere aynı arrayi tanımlarsam?
        intarray[0]=2;
        System.out.println(intarray[0]);
        //yeni tanımı verdi.


        //lists
        ArrayList<String>myMusicians=new ArrayList<>();
        myMusicians.add("dan");
        myMusicians.add("ran");
        myMusicians.add("John");
        myMusicians.add("mamut");
        //neden myMusician.add(index:1,element:"a"); metodu çalışmıyor?

        //Set
        HashSet<String>mySet=new HashSet<String>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());
        // AYNI ELEMANI 2 KERE YAZMANI KABUL ETMİYOR

        //MAP
        HashMap<String,Integer>mySecondMap=new HashMap<>();
        mySecondMap.put("run",120);
        mySecondMap.put("baseball",141);
        System.out.println(mySecondMap.get("baseball"));
    }
}

