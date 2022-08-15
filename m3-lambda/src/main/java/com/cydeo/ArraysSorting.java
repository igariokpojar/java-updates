package com.cydeo;

public class ArraysSorting {

    public static void main(String[] args) {

        ArraysSorting as = new ArraysSorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick Sorting");
        as.sort(quickSort);

        as.sort(() -> System.out.println("Quick Sorting"));

        // With Java 8 - you have access to a bunch of ready functional interfaces


    }

    private void sort(Sorting sorting){
        sorting.sort();

    }
}
