package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class USerTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Alla","Cibotarean",35));
        users.add(new User("Alex","Fornea",5));
        users.add(new User("Igor","Vasil",39));

        // Print all elements in the list

        printName(users,user -> true);
        // Print all people that last name start with C

        printName(users,user -> user.getLastName().startsWith("C"));
    }

    // Write Method

    private static void printName(List<User> users, Predicate<User>p){
        for (User user : users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
