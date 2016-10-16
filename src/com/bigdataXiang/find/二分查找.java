package com.bigdataXiang.find;

import com.bigdataXiang.util.Log;

/**
 * Created by timeloveboy on 16/10/16.
 */
public class 二分查找 {
    public static int findone(int[] data,int one){
        if(one<data[0]||one>data[data.length-1]){
            return -2;
        }
        return find(data,one,0,data.length-1);
    }
    private static int find(int[] data,int one,int low,int high){
        if(low<=high) {
            int mid = (low+high)/2;
            if(data[mid]==one){
                return mid;
            }else if(data[mid]>one){
                return find(data,one,low,mid-1);
            }else {
                return find(data,one,mid+1,high);
            }
        }else {
            return -1;
        }
    }
    public static void main(String[] args){
        int[] d={1,2,3,4,5,7,9,12,34,133,442,1212,3234,12423,22323,122323};
        Log.v(findone(d,5));
    }

}
