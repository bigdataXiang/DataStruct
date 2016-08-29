package com.bigdataXiang.find;

import com.bigdataXiang.util.Log;

/**
 * Created by timeloveboy on 16/8/30.
 * 查找 平衡数Index=k
 * Sum(A[0:k-1])==Sum(A[k+1:])
 */
public class BalanceNum {
    public static int Solute(int[] N){
        int sum=Sum(N);
        int leftsum=0;
        for(int i=1;i<N.length-1;i++){
            int left_right=(sum-N[i])/2;
            leftsum+=N[i-1];
            if(left_right==leftsum){
                return i;
            }
        }
        return -1;
    }
    public static int Sum(int[] N){
        int sum=0;
        for(int i=0;i<N.length;i++)
            sum+=N[i];
        return sum;
    }
    public static void main(String[] args){
        int[] v={1,2,3,4,5,7,8,9,8,7,5,4,3,2,1};
        Log.v(Solute(v));
    }
}
