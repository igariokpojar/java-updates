package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,45);

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);
    }
}
