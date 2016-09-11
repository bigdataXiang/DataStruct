package com.bigdataXiang.math.素数;

import com.bigdataXiang.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by timeloveboy on 16-9-11.
 */
public class 过滤素数 {
    public static void main(String[] args) {
        test(100);
        test(1000);
        test(10000);
        test(100000);
        test(1000000);
    }

    public static void test(int n) {
        long start = new Date().getTime();
        new 过滤素数().Compute(n);
        long end = new Date().getTime();
        Log.v(n, "\t", end - start);
    }

    public List<Integer> 素数表 = new ArrayList<Integer>();

    /**
     * (1000000)=11628
     *
     * @param input
     * @return
     */
    public List<Integer> Compute(int input) {
        int n = 2;
        while (n <= input) {
            Is素数(n);
            n++;
        }
        return 素数表;
    }

    private boolean Is素数(int number) {
        boolean result = true;
        for (int i = 0; i < 素数表.size(); i++) {
            if (number % 素数表.get(i) == 0) {
                result = false;
                break;
            }
        }
        if (result) {
            素数表.add(number);
        }

        return result;
    }
}
