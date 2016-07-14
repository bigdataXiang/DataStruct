package com.svail.rank_algorithm;

import java.util.Comparator;

/**
 * Created by ZhouXiang on 2016/7/13.
 */
public class InsertionSort {
    public static void insertionSort(Integer[] array){
        int j;
        for(int i=0;i<array.length;i++){
            int tmp=array[i];
            for(j=i;j>0&&new Integer(tmp).compareTo(new Integer(array[j-1]))<0;j--){
                array[j]=array[j-1];
            }
            array[j]=tmp;
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
