package week25;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1480. 一维数组的动态和(前缀和练习)
 * @date 2023/3/16 16:18:38
 */
public class Test6_2 {
    public static void main(String[] args) {
        int []a = {1,2,3,4};
        System.out.println(Arrays.toString(new Test6_2().runningSum(a)));
    }
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
