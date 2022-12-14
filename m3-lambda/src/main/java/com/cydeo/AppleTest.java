package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple>inventory = new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN)); // created apples
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(400,Color.GREEN));
        inventory.add(new Apple(350,Color.RED));

        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        List<Apple> greenApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(greenApple);

        System.out.println("__________________ using lambda___________________");

        ApplePredicates weightApple =  apple -> apple.getWeight()>200;
        filterApples(inventory,weightApple);



    }

    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicates applePredicates){ // get al the apple base on the action give the result
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicates.test(apple)){
                result.add(apple);
            }
        }
        return result;

    }
}
