package com.bigdataXiang.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ZhouXiang on 2016/7/19.
 */
public class QuickSort extends Sortable {
    public static void sort(Comparable[] array){

        split(Arrays.asList(array),0,array.length);
    }

    /**
     * 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小
     * @param array
     * @return
     */
    public static void split(List<Comparable> array,int from,int to){

        Comparable comparer = array.get(from);
        //选择一个划分标准，一般使用数组第一个元素

        //递归

            split(array,);

            split(big);
        }

        //合并
        List<Comparable> result=new ArrayList<Comparable>();
        result.addAll(small);
        result.addAll(big);
        array=result;
    }
}
