package com.bigdataXiang.sort;


/**
 * Created by ZhouXiang on 2016/7/19.
 */
public class QuickSort extends Sortable {
    public static void sort(Comparable[] array){
        sort(array,0,array.length-1);
    }

    /**
     * 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小
     * @param array
     * @return
     */
    private static void sort(Comparable[] array,int from,int to){
        if(from<to)
        {
            int compareSortedIndex = partition(array,from,to);//分组,并设置array[compareSortedIndex]=切分器
            sort(array,from,compareSortedIndex-1);//左递归
            sort(array,compareSortedIndex+1,to);//右递归
        }
    }
    public static int partition(Comparable[] array,int from,int to){

        //step1:选择一个划分标准，一般使用数组第一个元素
        Comparable comparer = array[from];
        //step2:从两边同时开始和comparer做对比，同时进行一次交换
        int i=from,j=to;

        while (i<j){

            //从左侧开始，找到一个大的
            int big=findfirstBigIndexFromLeft(array,i,comparer);


            //从右侧开始，找到一个小的
            int small=findfirstSmallIndexFromRight(array,j,comparer);


            exch(array, big, small);
            i=big+1;
            j=small-1;
            //之所以要在 顶层while里面，做2个while，是为了完成一个交换
        }
        int comparableSortedIndex=i;
        array[comparableSortedIndex]=comparer;
        return comparableSortedIndex;
    }
    private static int findfirstBigIndexFromLeft(Comparable[] arr,int from,Comparable comparable){
        int i=from;
        for(;i<arr.length;i++){
            if(big(arr[i],comparable))
                return i;
        }
        return i;
    }
    private static int findfirstSmallIndexFromRight(Comparable[] arr,int to,Comparable comparable){
        int i=to;
        for(;i>arr.length;i--){
            if(less(arr[i],comparable))
                return i;
        }
        return to;
    }
}
