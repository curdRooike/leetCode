package week15;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 976. 三角形的最大周长
 * @date 2023/1/5 20:22:29
 */
public class Test7 {
    public static void main(String[] args) {
        int []a = {2,1,2};
        System.out.println(new Test7().largestPerimeter(a));
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i - 1] + nums[i - 2] + nums[i];
            }
        }
        return 0;
    }
}
