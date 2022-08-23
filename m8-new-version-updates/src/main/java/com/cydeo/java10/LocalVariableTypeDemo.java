package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        // Type inference (auto detect data type)


        String s;
        s = "Alex";

        var abc = "Cydeo"; // var = variable  is use vor Local variable only
        var number = 5;
        byte x = 1;
        var y = 1; //  understudy as integer

        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for (var eachNumber : numbers){
            sum = sum+number;
        }








    }
}
