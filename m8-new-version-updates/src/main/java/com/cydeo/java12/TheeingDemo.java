package com.cydeo.java12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TheeingDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"A",100),
                new Employee(2,"B",200),
                new Employee(3,"C",300),
                new Employee(4,"D",400)
        );

        HashMap<String,Employee>result = employeeList.stream().collect(Collectors.teeing( // is getting two Collectors Max and Min
                Collectors.maxBy(Comparator.comparing(Employee::getSalary)), // assign to e1
                Collectors.minBy(Comparator.comparing(Employee::getSalary)),// assign to e2
                (e1,e2) ->{
                    HashMap<String,Employee> map = new HashMap<>(); // create a map and assign the value
                    map.put("MAX",e1.get());
                    map.put("MIN",e2.get());
                    return map;
                }

        ));
        System.out.println(result);
    }

}



