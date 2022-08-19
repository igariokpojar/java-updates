package com.cydeo;

import java.util.function.*;

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

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("*************BI Consumer ****************");

        BiConsumer<Integer,Integer> addTwo = (x,y) ->System.out.println(x+y); //if we have two parameters we need two parentheses
        addTwo.accept(1,2);

        System.out.println("*************FUNCTION ****************");

        Function<String,String> fun = s -> "Hello " + s; // s - represent String
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************* Bi FUNCTION ****************");
        BiFunction<Integer,Integer,Integer> func = (x1,x2) -> x1+x2;
        System.out.println(func.apply(2,3));

        System.out.println("*************SUPPLIER ****************");

        Supplier<Double> randomValue = () -> Math.random();
        randomValue.get();
        System.out.println(randomValue.get());

















    }
}
