package com.bigdataXiang.sort;

import com.bigdataXiang.util.Log;
import com.bigdataXiang.util.RandomArray;

import java.util.Date;

/**
 * Created by timeloveboy on 16/7/19.
 */
public class TestSort {

    public static void main(String[] args) {
        Integer[] a1=new RandomArray(100000,0,100000).getArray();

        testSelectionSort(a1);
    }
    public static void testSelectionSort(Integer[] a1){
        long start=new Date().getTime();
        Log.v("选择排序(n="+a1.length+"):\n");
        SelectionSort.sort(a1);
        long end=new Date().getTime();
        Log.v("花费时间:"+(end-start)+"毫秒");
    }
}
