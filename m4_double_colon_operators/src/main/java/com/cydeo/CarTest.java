package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // Zero argument Constructor

        Supplier<Car> c1 = () -> new Car(); // Car object
        System.out.println(c1.get().getModel());

        // Convert to double colon
        Supplier<Car> c2 = Car::new; // (new) is constructor

        // One argument constructor

        Function<Integer,Car> f1 = model ->new Car(model);
        Function<Integer,Car> f2 = Car :: new;

        // Two argument constructor

        BiFunction<String,Integer,Car> f3 = Car::new;
       Car tesla =  f3.apply("Tesla",2023);
        System.out.println(tesla.getMake()+ " " +tesla.getModel());


    }
}
