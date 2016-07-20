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
        //step2:从两边同时开始和comparer做对比，分别找到可以交换的元素,同时进行一次交换,使得两侧一边小、一边大

        int i=from,j=to;
        while(i<j)
        {
            j=findSmall(array,comparer,i,j);
            array[i] = array[j];
            i=findBig(array,comparer,i,j);
            array[j] = array[i];
        }
        array[i] = comparer;
        return i;
    }
    public static int findSmall(Comparable[] array,Comparable comparer,int left,int j){
        while(left<j && !less(array[j],comparer))//从右侧开始向左找,找第一个小于等于comparer的元素
            j--;
        return j;
    }
    public static int findBig(Comparable[] array,Comparable comparer,int i,int right){
        while(i<right&& !less(comparer,array[i]))//从左侧开始向右找,找第一个大于等于comparer的元素
            i++;
        return i;
    }
}
