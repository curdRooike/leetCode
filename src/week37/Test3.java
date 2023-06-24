package week37;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2465. 不同的平均值数目
 * @date 2023/6/4 22:50:49
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().
                distinctAverages(new int[]{4, 1, 4, 0, 3, 5}));
    }
    public int distinctAverages(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>(n / 2);
        int i = 0, j = n - 1;
        Arrays.sort(nums);
        for (; i < j; i++,--j) {
            set.add(nums[i] + nums[j]);
        }
        return set.size();
    }
}
