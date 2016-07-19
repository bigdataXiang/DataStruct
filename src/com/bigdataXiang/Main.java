package com.bigdataXiang;

import com.bigdataXiang.sort.InsertionSort;
import com.bigdataXiang.sort.SelectionSort;
import com.bigdataXiang.sort.Sortable;


public class Main {

    public static void main(String[] args) {
        Integer[] array={34,8,64,51,32,21};
        for (int i:array) {
            System.out.print(i+"\t");
        }
        System.out.println();
        SelectionSort.sort(array);
        for (int i:array) {
            System.out.print(i+"\t");
        }
    }
}
