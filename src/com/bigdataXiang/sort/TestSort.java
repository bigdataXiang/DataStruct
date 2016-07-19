package com.bigdataXiang.sort;

import com.bigdataXiang.util.Log;
import com.bigdataXiang.util.RandomArray;

import java.util.Date;

/**
 * Created by timeloveboy on 16/7/19.
 */
public class TestSort {

    public static void main(String[] args) {
        Integer[] a1=new RandomArray(100,0,100).getArray();

        //testSelectionSort(a1);
        testQuickSort(a1);
        Sortable.print(a1);
    }
    public static void testSelectionSort(Integer[] a1){
        long start=new Date().getTime();
        Log.v("选择排序(n="+a1.length+"):\n");
        SelectionSort.sort(a1);
        long end=new Date().getTime();
        Log.v("花费时间:"+(end-start)+"毫秒");
    }
    public static void testQuickSort(Integer[] a1){
        long start=new Date().getTime();
        Log.v("快速排序(n="+a1.length+"):\n");
        QuickSort.sort(a1);
        long end=new Date().getTime();
        Log.v("花费时间:"+(end-start)+"毫秒");
    }

}
