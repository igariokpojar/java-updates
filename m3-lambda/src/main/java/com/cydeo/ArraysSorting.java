package com.cydeo;

public class ArraysSorting {

    public static void main(String[] args) {

        ArraysSorting as = new ArraysSorting();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

    }

    private void sort(Sorting sorting){
        sorting.sort();

    }
}
