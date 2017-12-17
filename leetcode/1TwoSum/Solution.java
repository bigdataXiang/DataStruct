import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return null;
        }
        int[] res = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                res[0] = m.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            m.put(nums[i], i);
        }
        return null;
    }
}