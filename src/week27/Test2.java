package week27;

import java.util.HashSet;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2395. 和相等的子数组
 * @date 2023/3/26 01:41:34
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().findSubarrays(new int[]{1,2,3,4,5}));
    }
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {

                if (!set.add(nums[i]+ nums[i + 1])) {
                    return true;
                }

        }
        return false;
    }
}
