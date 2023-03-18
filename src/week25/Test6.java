package week25;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2488. 统计中位数为 K 的子数组
 * @date 2023/3/16 13:49:15
 */
public class Test6 {
    public static void main(String[] args) {
        int []a = {1,2,3};
        System.out.println(new Test6().countSubarrays(a, 2));
    }
    public int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int kIndex = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                kIndex = i;
                break;
            }
        }

        int ans = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sign(nums[i] - k);
            System.out.println(sum);
            if (i < kIndex) {
                counts.put(sum, counts.getOrDefault(sum, 0) + 1);
            } else {
                int prev0 = counts.getOrDefault(sum, 0);
                int prev1 = counts.getOrDefault(sum - 1, 0);
                ans += prev0 + prev1;
            }
        }
        System.out.println(counts);
        return ans;
    }

    public int sign(int num) {
        if (num == 0) {
            return 0;
        }
        return num > 0 ? 1 : -1;
    }

}
