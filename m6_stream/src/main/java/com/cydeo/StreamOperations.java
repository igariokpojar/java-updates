package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,6);
        list.forEach((x) -> System.out.println(x));
        list.forEach(System.out::println); // or use above

        System.out.println("---------Filter--------------------------------");

        //Filter
        list.stream().filter(i -> i%2==0).forEach(System.out::println);

        System.out.println("----------Distinct------------------------------");
        // Distinct
        Stream<Integer> str = list.stream().filter(i -> i%2==0).distinct();
        str.forEach(System.out::println); // Steam is close here

        System.out.println("---------------Limit----------------------------------");

        list.stream().filter(i -> i%2==0).limit(1).forEach(System.out::println);

        System.out.println("----------------Skip---------------------------");

        list.stream().filter(i -> i%2==0).skip(1).forEach(System.out::println);


    }
}
