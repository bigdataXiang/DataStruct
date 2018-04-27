import com.bigdataXiang.util.Log;

class Solution {
    public static void main(String[] args) {
        Log.v(new Solution().isPalindrome(1000030001));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int i = 1, y = x, number = (int) Math.log10(y) + 1;
        while (i <= number / 2) {

            int a = y / (int) Math.pow(10, number - i * 2 + 1), b = y % 10;

            if (a != b) {
                return false;
            }
            y = (y - a * (int) Math.pow(10, number - i * 2 + 1)) / 10;
            Log.v(a, b, y);

            if (0 < y && y < 10) {
                if (number / 2.0 - number / 2 == 0.5) {
                    if (number / 2.0 == i + 0.5)
                        return true;
                    else
                        return false;
                } else {
                    if (number / 2.0 == i)
                        return true;
                    else
                        return false;
                }
            }
            i++;
        }
        return true;
    }
}