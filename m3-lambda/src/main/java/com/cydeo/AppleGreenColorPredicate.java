package com.cydeo;

public class AppleGreenColorPredicate implements ApplePredicates {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN); // we are using Enum-(Green)

    }
}
