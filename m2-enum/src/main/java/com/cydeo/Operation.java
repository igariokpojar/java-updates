package com.cydeo;

public enum Operation {
    // each Constant is Objects(new) of Operation Class
    PlUS,MINUS,MULTIPLY,DIVIDE;

    Operation() { // this constructor can not be public... must be private

        System.out.println("Constructor");
    }
}
