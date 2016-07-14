package com.svail;

import com.svail.rank_algorithm.InsertionSort;
import com.svail.rank_algorithm.Sort;


public class Main {

    public static void main(String[] args) {
        Integer[] array={34,8,64,51,32,21};
        for (int i:array) {
            System.out.print(i+"\t");
        }
        System.out.println();
        Integer[] arr=InsertionSort.insertionSort(array, Sort.ASC);
        for (int i:arr) {
            System.out.print(i+"\t");
        }
    }
}
