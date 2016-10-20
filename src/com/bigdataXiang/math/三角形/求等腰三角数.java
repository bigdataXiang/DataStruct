package com.bigdataXiang.math.三角形;

import com.bigdataXiang.util.Log;
import java.util.*;

/**
 * Created by timeloveboy on 16/10/20.
 */
public class 求等腰三角数 {
    public static void main(String[] args){

        for(int i=1;i<1001;i++){
            int result=new 求等腰三角数().computing(i);
            if(result>0){
                Log.v(result," ",i);
            }
        }
    }
    public int computing(int sum){
        int count=0;
        for(int a=0;a<sum;a++){
            for(int b=0;b<sum-a;b++){
                int c=sum-a-b;
                if(c<=0||a<=0||b<=0||a>b){
                    continue;
                }
                if(a*a+b*b-c*c==0){
                    //Log.v("    ",a,"+",b,"+",c,"=",a+b+c);
                    count++;
                }
            }
        }
        return count;
    }
}
