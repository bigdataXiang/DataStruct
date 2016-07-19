package com.bigdataXiang.sort;

/**
 * Created by timeloveboy on 16/7/19.
 */
public class SelectionSort extends Sortable {
    public static void sort(Comparable[] array){
        int N=array.length;
        for(int i=0;i<N;i++){
            int min=findMinIndex(array,i,N);
            exch(array,i,min);
        }
    }
    public static int findMinIndex(Comparable[] array,int from,int to){
        int min=from;
        for(int j=from+1;j<to;j++){
            if(less(array[j],array[min])){
                min=j;
            }
        }
        return min;
    }

}
