package week33;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 209. 长度最小的子数组
 * @date 2023/5/5 22:41:50
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().
                minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int n = nums.length;
        int res = n + 1;
        int sum = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left++];
            }
        }
        return res <= n ? res : 0;
    }
}
