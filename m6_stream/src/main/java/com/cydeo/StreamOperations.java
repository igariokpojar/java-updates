package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,6);
        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println); // or use above

        System.out.println("Filter"); // Method
        //Filtering with a predicate : The stream interface supports a filter method.
        //This operation takes as argument a predicate (a function returning a boolean) and
        //returns a stream including all elements that match the predicate.

        list.stream().filter(i -> i%2==0).forEach(System.out::println);

        System.out.println("Distinct"); // Method
        //Filtering unique elements : The stream interface supports a distinct method. This
        //operation returns a stream with unique elements.

        Stream<Integer> str = list.stream().filter(i -> i%2==0).distinct();
        str.forEach(System.out::println); // Stream is close here

        System.out.println("Limit"); // Method
        //The stream interface supports a limit(n) method. This operation returns
        //a stream that’s no longer than a given size, limit 1 or any limits

        list.stream().filter(i -> i%2==0).limit(2).forEach(System.out::println);

        System.out.println("Skip"); // Method
        //The stream interface supports a skip(n) method. This operation returns
        //a stream that discards the first n element.
        //If the stream has fewer than n elements, an empty stream is returned.

        list.stream().filter(i -> i%2==0).skip(1).forEach(System.out::println);

        System.out.println("Map"); // Map Method is changing some characteristics of the Object
        //The stream interface supports a map method. This operation takes a
        //function as argument. The function is applied to each element,
        //mapping it to a new element.

        list.stream().filter(i ->i%3==0).map(number ->number*2).forEach(System.out::println);

        System.out.println("----------------------------------");








    }
}
