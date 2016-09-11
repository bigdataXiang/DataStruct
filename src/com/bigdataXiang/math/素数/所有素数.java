package com.bigdataXiang.math.素数;

import com.bigdataXiang.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timeloveboy on 16-9-11.
 */
public class 所有素数 {
    public static void main(String[] args) {
        Log.v(new 所有素数().Compute(100));
    }

    public List<Integer> Compute(int input) {
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 1; i < input; i++) {
            if (Is素数(i)) {
                nums.add(i);
            }
        }
        return nums;
    }

    /**
     * @param number
     * @return
     */
    private boolean Is素数(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
