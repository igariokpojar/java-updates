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
    }

    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicates applePredicates){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicates.test(apple)){
                result.add(apple);
            }
        }
        return result;

    }
}
