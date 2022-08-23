package com.cydeo.java10;

import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        Optional<String>str = Optional.empty();
        System.out.println(str.get());

        if (str.isPresent()){
            System.out.println(str.get());
        }else {
            //exception heading
        }
        System.out.println(str.orElseThrow());
    }
}
