package com.bigdataXiang.math.三角形;

import com.bigdataXiang.util.Log;

public class a加b加c等于1000_a方加b方等于c方 {
    private static int sum=1000;
    public static void main(String[] args){
        for(int a=0;0<sum;a++){
            for(int b=0;b<sum-a;b++){
                int c=sum-a-b;
                if(c<0||a<0||b<0){
                    return;
                }
                if(a*a+b*b-c*c==0){
                    Log.v(a,"*",a,"+",b,"*",b,"=",c,"*",c," a=",a," b=",b," c=",c);
                }
            }
        }
    }
}