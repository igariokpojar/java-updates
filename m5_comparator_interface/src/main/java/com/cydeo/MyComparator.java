package com.cydeo;

import java.util.Comparator;
import java.util.function.Consumer;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)? -1 : (o1<o2) ? 1:0; // if o1>02 then return -1; if o1<o2 then return 1; if not  then is equal;
    }
}
