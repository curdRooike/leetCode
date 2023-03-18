package week25;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2389. 和有限的最长子序列
 * @date 2023/3/17 08:52:46
 */
public class Test7 {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length, m = queries.length;
        int[] res = new int[m];
        Arrays.sort(nums);
        int[] f = new int[n + 1];
        for (int i = 0; i < n; i++) {
            f[i + 1] = f[i] + nums[i];
        }
        for (int i = 0; i < m; i++) {
            res[i] = binarySearch(f, queries[i]) - 1;
        }
        return res;
    }
    public int binarySearch(int[] f, int target) {
        int low = 1, high = f.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (f[mid] > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
