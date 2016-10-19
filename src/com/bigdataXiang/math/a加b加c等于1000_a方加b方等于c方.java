package com.bigdataXiang.math;

import com.bigdataXiang.util.Log;

public class a加b加c等于1000_a方加b方等于c方 {
    public static void main(String[] args){
        for(int a=0;0<1000;a++){
            for(int b=0;b<1000-a;b++){
                int c=1000-a-b;
                if(c<0||a<0||b<0){
                    return;
                }
                if(a*a+b*b==c*c){
                    Log.v(a,"*",a,"+",b,"*",b,"=",c,"*",c," a=",a," b=",b," c=",c);
                }
            }
        }
    }
}