package com.cydeo;

import java.util.*;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        Comparator<Apple> sortApple =comparing((Apple apple) -> apple.getWeight()); // we must import the comparator -> (import static java.util.Comparator.comparing;)
        inventory.sort(sortApple);
        System.out.println(inventory);

         // Shor cut
        inventory.sort (comparing(Apple::getWeight));
        System.out.println(inventory);

        // reversed
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        //Chaining
        inventory.
                sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));  // color sorting alphabetical




    }
}
