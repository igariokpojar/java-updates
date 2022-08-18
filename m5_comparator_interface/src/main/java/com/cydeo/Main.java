package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,15);
        System.out.println(list);
           // Ascending way
        Collections.sort(list);  // sort the list. accepting one parameter
        System.out.println(list);
            // Descending
        Collections.sort(list, new MyComparator()); // accepting 2 parameters
        System.out.println(list);

        // passed the action directly implement lambda repression
        Collections.sort(list,((o1,o2) ->(o1>o2)? -1 : (o1<o2) ? 1:0)); // using lambda

        // Ascending order
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        // Descending order
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);




    }
}
