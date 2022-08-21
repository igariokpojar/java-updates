package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {


        System.out.println("ALL MATCH");
        boolean isHealthy  = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }
        System.out.println("NON MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
       Optional<Dish> dish =  DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2 =  DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        // PARALLEL STREAMS (Async) the action can happen randomly
        System.out.println(IntStream.range(0,100).parallel().findAny()); // Is creating number between 0-100 randomly
        System.out.println(IntStream.range(0,100).parallel().findFirst()); // Is getting firsts base on the condition

    }


}
