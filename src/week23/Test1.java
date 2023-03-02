package week23;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 2357. 使数组中所有元素都等于零
 * @date 2023/2/24 01:20:51
 */
public class Test1 {
    public static void main(String[] args) {
        int []a = {1,5,0,3,5};
        System.out.println(new Test1().minimumOperations(a));
    }
    /*public int minimumOperations(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                subtract(nums,nums[i], i);
                ans++;
            }
        }
        return ans;
    }
    public void subtract(int[] nums, int x, int startIndex) {
        System.out.println(Arrays.toString(nums));
        for (int i = startIndex; i < nums.length; i++) {
            nums[i] -= x;
        }
    }*/
    public int minimumOperations(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > 0){
                for (int j = i; j < nums.length; j++) {
                    nums[j] -= num;
                }
                ans++;
            }
        }
        return ans;
    }
}
