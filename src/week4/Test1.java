package week4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 448. 找到所有数组中消失的数字
 * @date 2022/9/26 12:00:44
 */
public class Test1 {
    public static void main(String[] args) {
        int []a = {1,2,3,15,5,6,5,9,10,11,11,11,13,13};
        System.out.println(new Test1().findDisappearedNumbers(a));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;

    }
}
