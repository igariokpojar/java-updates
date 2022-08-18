package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,15);
        System.out.println(list);

        Collections.sort(list);  // sort the list
        System.out.println(list);

        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1,o2) ->(o1>o2)? -1 : (o1<o2) ? 1:0)); // using lambda


    }
}