package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { // ArrayList only accept Objects belongs to Integer class

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("Apple"); // here we have String Object

        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> items){
        for (Integer i : items){
            System.out.println(i*2);

        }
    }
}
