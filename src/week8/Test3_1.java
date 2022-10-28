package week8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 645. 错误的集合
 * @date 2022/10/26 17:15:13
 */
public class Test3_1 {
    public static void main(String[] args) {
        int[] a = {1,2,2,4};
        int[] nums = new Test3_1().findErrorNums(a);
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        System.out.println();
        int a = -1, b = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                a = nums[i];
                b = i == 0 ? 1 : nums[i - 1] + 1;
            }
        }
        return new int[]{a, b};
    }
    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }



}
