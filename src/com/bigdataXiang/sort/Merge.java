package com.bigdataXiang.sort;

/**
 * Created by ZhouXiang on 2016/7/26.
 */
public class Merge extends Sortable{
    public static Comparable[] aux;
    public static void merge(Comparable[] a,int lo,int mid ,int hi){
        //将数组中的low到mid中元素、mid+1到hi元素归并
        int i=lo;
        int j=hi;

        //将a数组赋值给aux数组
        aux=new Comparable[a.length];
        for(int k=lo;k<a.length;k++){
            aux[k]=a[k];
        }

        for(int k=lo;k<a.length;k++){
            if(i>mid){
                a[k]=aux[j++];       //左半边用尽（取右半边的元素）
            }else if(j>hi){
                a[k]=aux[i++];       //右半边用尽（取左半边的元素）
            }else if(less(aux[j],aux[i])){
                a[k]=aux[j++];   //右半边的当前元素小于左半边的当前元素（取右半边的元素）
            }else{
                a[k]=aux[i++];    //右半边的当前元素大于等于左半边的当前元素（取左半边的元素）
            }

        }


    }
}
