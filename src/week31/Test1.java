package week31;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1031. 两个非重叠子数组的最大和
 * @date 2023/4/26 18:40:40
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().maxSumTwoNoOverlap
                (new int[]{1,2,3}
                , 1, 2));
    }
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int[] adds = new int[n + 1];
        for (int i = 0; i < n; i++) {
            adds[i + 1] = nums[i] + adds[i];
        }
        System.out.println(Arrays.toString(adds));
        return Math.max(f(adds, firstLen, secondLen), f(adds, secondLen, firstLen));
    }
    private int f(int[] s, int firstLen, int secondLen) {
        int max = 0, res = 0;
        for (int i = firstLen + secondLen; i < s.length; ++i) {
            max = Math.max(max, s[i - secondLen] - s[i - secondLen - firstLen]);
            res = Math.max(res, max + s[i] - s[i - secondLen]);
        }
        return res;
    }
}
