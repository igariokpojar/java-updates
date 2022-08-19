package com.cydeo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicates ap = new ApplePredicates() { // AppleHeavyPredicates
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        System.out.println("************* Predicate ****************");// Predicates is a functional Interfaces

        Predicate<Integer> lesserThan = i -> i <18; // implementation of method inside of Interface
        System.out.println(lesserThan.test(20));

        System.out.println("************* Consumer ****************");
        Consumer<Integer> display = i -> System.out.println();
        display.accept(10);













    }
}
