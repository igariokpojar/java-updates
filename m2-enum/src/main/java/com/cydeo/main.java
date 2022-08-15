package com.cydeo;

public class main {

    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME; // Object of Currency class
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all the constant?");
        Currency[] currencies = Currency.values();
    }
}
