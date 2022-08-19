package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange>inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300,Color.GREEN)); // created oranges
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(400,Color.GREEN));
        inventory.add(new Orange(350,Color.RED));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight()+ "g"; //  give as: An apple of 80g
        prettyPrintApple(inventory,orangeLambda);

        prettyPrintApple(inventory,orange -> "An orange of " + orange.getWeight()+ "g"); // same implementation as above
    }

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter formatter){
        for (Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }
}
/*
Write a prettyPrintApple method that takes aList of Apples and that can be
parameterized with multiple ways ->(multiple interface) to generate a String output from an apple
public static void prettyPrintApple(List<Apple> inventory, ???){
 for(Apple apple : inventory){
 String output = ???.???(apple);
 System.out.println(output);
 }
}
Sample Output :
 A Light GREEN apple
 A Heavy RED apple
 A Light GREEN apple
Sample Output :
 An apple of 80g
 An apple of 155g
 An apple of 120g
 */