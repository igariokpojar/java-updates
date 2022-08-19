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
        //Filtering with a predicate : The stream interface supports a filter method.
        //This operation takes as argument a predicate (a function returning a boolean) and
        //returns a stream including all elements that matches the predicate.

        list.stream().filter(i -> i%2==0).forEach(System.out::println);

        System.out.println("----------Distinct------------------------------");
        //Filtering unique elements : The stream interface supports a distinct method. This
        //operation returns a stream with unique elements.
        // Distinct
        Stream<Integer> str = list.stream().filter(i -> i%2==0).distinct();
        str.forEach(System.out::println); // Steam is close here

        System.out.println("---------------Limit----------------------------------");
        //The stream interface supports a limit(n) method. This operation returns
        //a stream that’s no longer than a given size.

        list.stream().filter(i -> i%2==0).limit(1).forEach(System.out::println);

        System.out.println("----------------Skip---------------------------");
        //The stream interface supports a skip(n) method. This operation returns
        //a stream that discards the first n element.
        //If the stream has fewer than n elements, an empty stream is returned.

        list.stream().filter(i -> i%2==0).skip(1).forEach(System.out::println);

        System.out.println("----------------Map---------------");
        //The stream interface supports a map method. This operation takes a
        //function as argument. The function is applied to each element,
        //mapping it to a new element.

        list.stream().map(number ->number*2).filter(i ->i%3==0).forEach(System.out::println);






    }
}
