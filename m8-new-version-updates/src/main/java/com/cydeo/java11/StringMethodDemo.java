package com.cydeo.java11;

public class StringMethodDemo {

    public static void main(String[] args) {

        var str = "Mike \n Alex";
        str.lines().forEach(System.out::println);
    }
}
