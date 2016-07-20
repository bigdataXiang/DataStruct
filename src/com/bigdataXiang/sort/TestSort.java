package com.bigdataXiang.sort;

import com.bigdataXiang.util.Log;
import com.bigdataXiang.util.RandomArray;

import java.util.Date;

/**
 * Created by timeloveboy on 16/7/19.
 */
public class TestSort {

    public static void main(String[] args) {
        Integer[] a1=new RandomArray(100000,0,1000000).getArray();
        //Sortable.print(a1);
        testSelectionSort(a1);
        a1=new RandomArray(100000,0,1000000).getArray();
        testQuickSort(a1);
        //Sortable.print(a1);
    }
    public static void testSelectionSort(Integer[] a1){
        long start=new Date().getTime();
        Log.v("\n选择排序(n="+a1.length+"):");
        SelectionSort.sort(a1);
        long end=new Date().getTime();
        Log.v("\n花费时间:"+(end-start)+"毫秒");
    }
    public static void testQuickSort(Integer[] a1){
        long start=new Date().getTime();
        Log.v("\n快速排序(n="+a1.length+"):");
        QuickSort.sort(a1);
        long end=new Date().getTime();
        Log.v("\n花费时间:"+(end-start)+"毫秒");
    }

}
