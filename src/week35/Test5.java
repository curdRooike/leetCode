package week35;

import util.SoutUtil;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 283. 移动零
 * @date 2023/5/18 13:33:19
 */
public class Test5 {
    public static void main(String[] args) {
        new Test5().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int n;
        if ((n = nums.length) == 0)
            return;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }

        }
        SoutUtil.ArrayOut(nums);
    }
}
