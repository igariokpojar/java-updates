package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        // toCollection(Supplier) : is used to create a Collection using Collector

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> numberList = numbers.stream().filter(x-> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream().filter(x -> x%2==0).collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("TO LIST"); // return Collector interface that gathers the input data into a new list

       List<Integer> numberList2 =  numbers.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet return Collector interface that gathers the input data into a new set

        Set<Integer> numberSet2 =  numbers.stream().filter(x -> x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        // toMap(Function,Function) returns a collector interface that gather the input data into a new map

        Map<String,Integer>dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        // summingInt (ToIntFunction) : returns a Collector that produces the sum of an Integer-valued function
       Integer sum =  DishData.getAll().stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting : returns a Collector that counts the number of elements
        Long evenCount = numbers.stream().filter(x ->x%2==0).collect(Collectors.counting());
        System.out.println(evenCount);

        //averageInt(ToIntFunction) returns the average of integer pas values

         Double calorieAverage = DishData.getAll().stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        // joining() : is used to join various elements of characters or string array into a single object

        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream().collect(Collectors.joining(","));
        System.out.println(str);




    }
}
