

package com.bigdataXiang.math.整除与求余;

import com.bigdataXiang.util.Log;

/**
 * Created by timeloveboy on 16-9-11.
 */
public class 最大公约数 {
    /**
     * 欧几里德算法
     *
     * @param a
     * @param b
     * @return 最大公约数
     */
    public static int gcd(int a, int b) {
        if (a < b) {
            int A = b, B = a;
            return gcd(A, B);
        }
        //现在a>b
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int g = gcd(100, 35);
        Log.v(g);
    }
}
