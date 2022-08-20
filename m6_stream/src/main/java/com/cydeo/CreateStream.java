package com.cydeo;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class CreateStream {

    public static void main(String[] args) {

        // Creating stream from Array

        String[] course = {"Java","Spring","Agile"};

       Stream<String> courseStream  = Arrays.stream(course);

       // Creating Stream from Collection

        List<String> courseList = Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("MS",102));

        // How to create Stream?
        Stream<Course> myCourseStream = myCourses.stream(); // Stream creation

        // Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);





    }
}
