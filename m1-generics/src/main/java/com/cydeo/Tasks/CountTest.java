package com.cydeo.Tasks;

import java.util.*;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }

    // we need generic that can accept all type of predicates

    private static <T> int countIf(List<T> c, UnaryPredicate<T>p){

        int count = 0;
        for (T elem : c){
            if (p.test(elem)){
                ++count;
            }
        }
        return count;

    }
}
