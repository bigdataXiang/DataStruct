package com.svail;

import com.svail.rank_algorithm.InsertionSort;

public class Main {

    public static void main(String[] args) {
        Integer[] array={34,8,64,51,32,21};
        array[0]=10;
        System.out.println(array[0]);
	// write your code here
        InsertionSort.insertionSort(array);
    }
}
