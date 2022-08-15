package com.cydeo;


public enum Currency { // Enum is a special type of class that holding Constants Objects


    // Enum are the Constant Objects of Currency class
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);



     private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
