package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);

        // empty - isPresent

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); // returning false because nothing isPresent

        System.out.println(Optional.of(number).isPresent()); //returning true because  isPresent

        // ifPresent
         Optional<Integer> bigNumber = number.stream().filter(x->x>100).findAny();
         bigNumber.ifPresent(System.out::println); // the condition is wrong

         //get
      //  System.out.println(bigNumber.get());

        // orElse
        System.out.println(bigNumber.orElse(5));
    }
}