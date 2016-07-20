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
    protected static boolean big(Comparable a,Comparable b){

        return a.compareTo(b)>0;
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
    /**
     * 打印数组a中的所有元素
     * @param a
     */
    public static void print(Comparable[] a){
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=0;i<a.length;i++){
            if(less(a[i],a[i-1]))
                return false;
        }
        return true;
    }

}
