package week7;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 283. 移动零
 * @date 2022/10/20 08:49:27
 */
public class Test4 {
    public static void main(String[] args) {
        int []a = {0,1,0,3,12};
        new Test4().moveZeroes(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
    public void moveZeroes(int[] nums)  {
        int length;
        if ((length = nums.length) == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (i > j) {// #1
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
            for (int num : nums) {
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }

}
