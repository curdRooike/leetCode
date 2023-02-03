package week19;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 628. 三个数的最大乘积
 * @date 2023/1/28 04:50:09
 */
public class Test2 {
    public static void main(String[] args) {
        int []a = {1,2,3,4};
        System.out.println(new Test2().maximumProduct(a));
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
}
