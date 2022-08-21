package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,45);

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);

        // Find the total number of calories
        System.out.println("Dish calories total");
        Optional<Integer> calTotal = Optional.of(DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum)
                .get());

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        //COUNT
        System.out.println("COUNT");

       long dishCount =  DishData.getAll().stream().count();
        System.out.println(dishCount);
    }
}
