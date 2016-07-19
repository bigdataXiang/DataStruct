package com.bigdataXiang.util;

/**
 * Created by timeloveboy on 16/7/19.
 */
public class RandomArray {
    public Integer[] getArray() {
        return array;
    }

    Integer[] array;
    public RandomArray(int arrayLength, int startNum,int numRange) {
        //数组长度和最大随机数以参数形式传入
        array = new Integer[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] =startNum+ (int) (Math.random() * numRange);
        }
    }
}