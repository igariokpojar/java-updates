package com.cydeo.java14;

public class UserTest {

    public static void main(String[] args) {

        User user = new User("Mike","VA");// we create object
        System.out.println(user.name());
        System.out.println(user.toString());
    }
}
