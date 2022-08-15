package com.cydeo;

public class AppleHeavyPredicate implements ApplePredicates{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
