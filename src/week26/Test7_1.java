package week26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 15. 三数之和
 * @date 2023/3/24 01:15:56
 */
public class Test7_1 {
    public static void main(String[] args) {
        System.out.println(new Test7_1().
                threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(len < 3) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int l = i + 1;
            int r = len - 1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[++l]);
                    while (l < r && nums[r] == nums[--r]);
                    l++;
                    r--;
                }else if(sum < 0) l++;
                else  r--;
            }
        }
        return ans;
    }
}