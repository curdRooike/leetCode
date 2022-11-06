package week9;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 643. 子数组最大平均数 I
 * @date 2022/11/2 17:36:45
 */
public class Test3 {
    public static void main(String[] args) {
        int[]a = {1,12,-5,6,50,3};
        System.out.println(new Test3().findMaxAverage(a, 4));
    }
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }
}
