package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

      Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;  // implementation for the abstract method belongs to functional interface

        Calculate sum = (x,y) -> System.out.println(x+y); // implementation of abstract method Calculate by using lambda

        Calculate s1 = Calculator::findSum;// is the same as above ( just call the method) same implementation or Lambda implementation

        // Reference to Static Method
        Calculate s2 = Calculator::findSum; // shortcut for findSum (::)
        s2.calculate(10,20);// call the method and pass the parameters

        // Reference to an instance method
        Calculator obj = new Calculator();// create an object to call the interface method
        // (Interface method can not be call by class name, only by objects)
        Calculate s3 = obj::findMultiply;

        Calculate s4 = new Calculator()::findMultiply;
        BiFunction<String,Integer,String> fun = (str,i) -> str.substring(i);
        BiFunction<String,Integer,String> fun2 = String :: substring; // same as above

        Function<Integer,Double> b = new MyClass() ::method; // new MyClass is an object
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method;


      Consumer<Integer> display = i-> System.out.println();
      Consumer<Integer> display2 = System.out::println; // same as above or shortcut


    }
}
