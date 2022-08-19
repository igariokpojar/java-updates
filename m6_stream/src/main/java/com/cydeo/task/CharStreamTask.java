package com.cydeo.task;

import java.util.*;

public class CharStreamTask {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream().map(String::length).forEach(System.out::println);
    }
}
