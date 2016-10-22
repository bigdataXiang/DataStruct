package com.bigdataXiang.tree;

/**
 * Created by timeloveboy on 2016/10/22.
 */
public class ComparedNode<T> extends Node implements Comparable{
    public ComparedNode(T value) {
        super(value);
    }

    public int compareTo(Object o) {
        try {
            Double d= Double.parseDouble(o.toString());
            Double self=Double.parseDouble(super.toString());
            if(d-self>0){
                return 1;
            }else if(d-self==0){
                return 0;
            }else {
                return -1;
            }
        }catch (Exception e){
            return 0;
        }
    }

}
