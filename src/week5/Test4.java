package week5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 219. 存在重复元素 II
 * @date 2022/10/6 11:50:48
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {1,0,1,1};
        System.out.println(new Test4().containsNearbyDuplicate(a, 1));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
