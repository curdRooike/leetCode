package greedyAlgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1. 两数之和
 * @date 2023/3/28 22:56:54
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test3().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i])){
                return new int[]{hash.get(target - nums[i]),i};
            }
            hash.put(nums[i],i);
        }
        return new int[0];
    }
}
