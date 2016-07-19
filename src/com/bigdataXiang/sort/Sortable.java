package com.bigdataXiang.sort;

/**
 * Created by timeloveboy on 16-7-14.
 */
public class Sortable {
    /**
     * 从大到小
     */
    public static final Boolean DESC=false;
    /**
     * 从小到大
     */
    public static final Boolean ASC=true;

    /**
     * 比较
     * @param a
     * @param b
     * @return
     */
    protected static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    /**
     * 交换
     * @param array
     * @param a
     * @param b
     */
    protected static void exch(Comparable[] array,int a,int b){
        Comparable t=array[a];
        array[a]=array[b];
        array[b]=t;
    }


}
