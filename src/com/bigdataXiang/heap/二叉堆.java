package com.bigdataXiang.heap;

import com.bigdataXiang.util.Log;

/**
 * Created by timeloveboy on 16-9-29.
 */
public class 二叉堆 {
    public static void main(String[] args){
        BinaryHeap<Integer> binaryHeap=new BinaryHeap<Integer>();

        binaryHeap.insert(100);
        binaryHeap.insert(10);
        binaryHeap.insert(23);
        binaryHeap.insert(12);

        Log.v(binaryHeap);
    }
}
