package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(2,4,56,8);

        List<Integer> unmodifiableList  = List.copyOf(numList);
    }


}
