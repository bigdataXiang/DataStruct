package com.svail.rank_algorithm;


/**
 * Created by ZhouXiang on 2016/7/13.
 */
public class InsertionSort {
    /**
     *
     * @param array 数组
     * @param sorttype 排序类型,Sort.DESC,Sort.ASC
     * @return
     */
    public static Integer[]  insertionSort(Integer[] array,boolean sorttype){
        int j;
        for(int i=0;i<array.length;i++){
            int tmp=array[i];
            for(j=i;j>0&&new Integer(tmp).compareTo(new Integer(array[j-1]))<0;j--){
                array[j]=array[j-1];
            }
            array[j]=tmp;
        }

       return array;
    }

}
